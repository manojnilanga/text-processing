package com.accelaero.aeroconnect.textprocessor.couchbaseconfiguration;

/*import com.accelaero.aeroconnect.document.Api;
import com.accelaero.aeroconnect.document.Connector;
import com.accelaero.aeroconnect.document.ConnectorParameter;
import com.accelaero.aeroconnect.document.ErrorLog;
import com.accelaero.aeroconnect.document.Message;
import com.accelaero.aeroconnect.document.MessageOriginatingReference;
import com.accelaero.aeroconnect.document.MessageRevision;
import com.accelaero.aeroconnect.document.Route;
import com.accelaero.aeroconnect.document.RouteHistory;
import com.accelaero.aeroconnect.document.Subscriber;
import com.accelaero.aeroconnect.repository.configuration.ApiRepository;
import com.accelaero.aeroconnect.repository.configuration.ConnectorRepository;
import com.accelaero.aeroconnect.repository.configuration.RouteHistoryRepository;
import com.accelaero.aeroconnect.repository.configuration.RouteRepository;
import com.accelaero.aeroconnect.repository.configuration.SubscriberRepository;
import com.accelaero.aeroconnect.repository.message.MessageOriginatingReferenceRepository;
import com.accelaero.aeroconnect.repository.message.MessageRepository;
import com.accelaero.aeroconnect.repository.message.MessageRepositoryCustom;
import com.accelaero.aeroconnect.repository.message.MessageRevisionRepository;*/

import com.accelaero.aeroconnect.textprocessor.document.Employee;
import com.accelaero.aeroconnect.textprocessor.repository.EmployeeRepository;
import io.grpc.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseDataConfiguration;
import org.springframework.data.couchbase.config.CouchbaseConfigurer;
import org.springframework.data.couchbase.core.CouchbaseTemplate;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;
import org.springframework.data.couchbase.repository.config.RepositoryOperationsMapping;

/**
 * 
 * RBAC enabled CouchbaseBucketConfig to hold multiple bucket connections
 *
 */

@Configuration
@EnableCouchbaseRepositories
public class CouchbaseBucketConfig extends AbstractCouchbaseDataConfiguration {
	
	@Autowired
	private CouchbaseClusterConfigurer generalConfigurer;

	@Bean
	public CouchbaseTemplate messageConfigTemplate() throws Exception {
		CouchbaseTemplate template = new CouchbaseTemplate(couchbaseConfigurer().couchbaseClusterInfo(),
				generalConfigurer.messageBucket(), mappingCouchbaseConverter(), translationService());
		template.setDefaultConsistency(getDefaultConsistency());
		return template;
	}

	@Override
	public void configureRepositoryOperationsMapping(RepositoryOperationsMapping baseMapping) {
		try {
			baseMapping.mapEntity(Employee.class, couchbaseTemplate()).mapEntity(EmployeeRepository.class, couchbaseTemplate());



		} catch (Exception e) {
			throw Status.INTERNAL.withDescription("Couchbase repository/entity mapping error occurred.")
					.withCause(e).asRuntimeException();
		}
	}

	@Override
	protected CouchbaseConfigurer couchbaseConfigurer() {
		return generalConfigurer;
	}
}
