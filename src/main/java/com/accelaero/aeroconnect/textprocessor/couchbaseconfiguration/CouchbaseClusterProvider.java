package com.accelaero.aeroconnect.textprocessor.couchbaseconfiguration;

import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.CouchbaseCluster;

import java.util.List;

/**
 * 
 * RBAC enabled couchbase cluster
 *
 */
public class CouchbaseClusterProvider {

	private Cluster cluster;

	private static volatile CouchbaseClusterProvider clusterProviderInstance;

	private CouchbaseClusterProvider(List<String> host, String bucketRootUserName, String password) {
		cluster = CouchbaseCluster.create(host);
		cluster.authenticate(bucketRootUserName, password);
	}

	public static CouchbaseClusterProvider getInstance(List<String> host, String bucketRootUserName, String password) {
		if (clusterProviderInstance == null) {
			synchronized (CouchbaseClusterProvider.class) {

				if (clusterProviderInstance == null) {
					clusterProviderInstance = new CouchbaseClusterProvider(host, bucketRootUserName, password);
				}
			}
		}
		return clusterProviderInstance;
	}

	public Cluster getCluster() {
		return cluster;
	}
}