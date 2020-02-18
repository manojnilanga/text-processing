package com.accelaero.aeroconnect.textprocessor.couchbaseconfiguration;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.CouchbaseCluster;
import com.couchbase.client.java.bucket.BucketType;
import com.couchbase.client.java.cluster.BucketSettings;
import com.couchbase.client.java.cluster.ClusterInfo;
import com.couchbase.client.java.cluster.ClusterManager;
import com.couchbase.client.java.cluster.DefaultBucketSettings;
import com.couchbase.client.java.env.CouchbaseEnvironment;
import com.couchbase.client.java.env.DefaultCouchbaseEnvironment;
import com.couchbase.client.spring.cache.CacheBuilder;
import com.couchbase.client.spring.cache.CouchbaseCacheManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.CouchbaseConfigurer;

import java.util.Arrays;
import java.util.List;

@Configuration
@EnableCaching
public class CouchbaseCacheConfig implements CouchbaseConfigurer {

    private final Logger logger = LoggerFactory.getLogger(CouchbaseCacheConfig.class);

    @Value("#{environment.getProperty('aeroconnect_couchbase_rootPass')}")
    private String bucketRootPassword;
    @Value("#{environment.getProperty('aeroconnect_couchbase_rootUser')}")
    private String bucketRootUserName;
    @Value("#{environment.getProperty('aeroconnect_couchbase_server')}")
    private String hosts;

    @Value("employee")
    private String cacheBucketName;
    @Value("#{environment.getProperty('aeroconnect_couchbase_cache_bucketSizeMb')}")
    private String bucketSize;

    private static final long CONNECTION_TIMEOUT = 60000L;

    private Cluster getCluster(List<String> host, String bucketRootUserName, String password) {
        Cluster cluster = CouchbaseCluster.create(host);
        cluster.authenticate(bucketRootUserName, password);

        return cluster;
    }

    private List<String> getBootstrapHosts() {
        return Arrays.asList(hosts.split(","));
    }

    @Bean(destroyMethod = "disconnect")
    public Cluster couchbaseCluster() {
        return getCluster(getBootstrapHosts(), bucketRootUserName, bucketRootPassword);
    }

    private Bucket getBucket(String bucketName) {
        Cluster cluster = couchbaseCluster();
        ClusterManager clusterManager = couchbaseCluster().clusterManager();

        if (!clusterManager.hasBucket(bucketName)) {
            BucketSettings bucketSettings = new DefaultBucketSettings.Builder()
                    .type(BucketType.COUCHBASE)
                    .name(bucketName)
                    .quota(Integer.parseInt(bucketSize))
                    .build();
            clusterManager.insertBucket(bucketSettings);
        }
        return cluster.openBucket(bucketName);

    }

    private synchronized Bucket cacheBucket() {
        return getBucket(cacheBucketName);
    }

    @Bean
    public CacheManager cacheManager() {
        logger.info("cacheManager  initiate cache at : {} ", System.currentTimeMillis());
        CacheBuilder cacheBuilder = CacheBuilder.newInstance(cacheBucket());
        return new CouchbaseCacheManager(cacheBuilder, "sequenceReference");
    }

    @Override
    public CouchbaseEnvironment couchbaseEnvironment() {
        return DefaultCouchbaseEnvironment.builder().connectTimeout(CONNECTION_TIMEOUT).kvTimeout(CONNECTION_TIMEOUT)
                .queryTimeout(CONNECTION_TIMEOUT).viewTimeout(CONNECTION_TIMEOUT).build();
    }

    @Override
    public ClusterInfo couchbaseClusterInfo() {
        return couchbaseCluster().clusterManager().info();
    }

    @Override
    public Bucket couchbaseClient() {
        return getBucket(cacheBucketName);
    }
}
