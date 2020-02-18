package com.accelaero.aeroconnect.textprocessor.couchbaseconfiguration;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.couchbase.config.CouchbaseConfigurer;
import org.springframework.stereotype.Component;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.cluster.ClusterInfo;
import com.couchbase.client.java.env.CouchbaseEnvironment;
import com.couchbase.client.java.env.DefaultCouchbaseEnvironment;

/**
 * 
 * RBAC enabled CouchbaseConfigurer
 *
 */
@Component
public class CouchbaseClusterConfigurer implements CouchbaseConfigurer {
	
	@Value("#{environment.getProperty('aeroconnect_couchbase_rootPass')}")
	private String bucketRootPassword;

	@Value("#{environment.getProperty('aeroconnect_couchbase_rootUser')}")
	private String bucketRootUserName;

	@Value("#{environment.getProperty('aeroconnect_couchbase_server')}")
	private String hosts;

	@Value("employee")
	protected String configurationBucketName;

	@Value("#{environment.getProperty('aeroconnect_couchbase_message_bucketName')}")
	protected String messageBucketName;

	private static final long CONNECTION_TIMEOUT = 60000l;

	private List<String> getBootstrapHosts() {
		return Arrays.asList(hosts.split(","));
	}

	@Override
	public CouchbaseEnvironment couchbaseEnvironment() throws Exception {
		return DefaultCouchbaseEnvironment.builder().connectTimeout(CONNECTION_TIMEOUT).kvTimeout(CONNECTION_TIMEOUT)
				.queryTimeout(CONNECTION_TIMEOUT).viewTimeout(CONNECTION_TIMEOUT).build();
	}

	@Override
	public Cluster couchbaseCluster() throws Exception {
		return CouchbaseClusterProvider.getInstance(getBootstrapHosts(), bucketRootUserName, bucketRootPassword)
				.getCluster();
	}

	@Override
	public ClusterInfo couchbaseClusterInfo() throws Exception {
		return couchbaseCluster().clusterManager().info();
	}

	@Override
	public synchronized Bucket couchbaseClient() throws Exception {
		return getBucket(configurationBucketName);
	}

	public synchronized Bucket messageBucket() throws Exception {
		return getBucket(messageBucketName);
	}

	private Bucket getBucket(String bucketName) throws Exception {
		return couchbaseCluster().openBucket(bucketName);

	}

}
