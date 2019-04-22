/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.samples.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.AbstractEnvironment;

/**
 * PetClinic Spring Boot Application.
 *
 * @author Dave Syer
 *
 */
@SpringBootApplication

public class PetClinicApplication {

    public static void main(String[] args) {
        System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, CXF.CXF_PROFILE);
        SpringApplication.run(PetClinicApplication.class, args);
    }

	
	
	/*
	 * @Bean public Server rsServer() { JAXRSServerFactoryBean endpoint = new
	 * JAXRSServerFactoryBean(); endpoint.setBus(bus);
	 * //endpoint.setServiceBeans(Arrays.<Object>asList(new HelloServiceImpl1(), new
	 * HelloServiceImpl2())); endpoint.setServiceBean(clinicRestService);
	 * endpoint.setAddress("/clinicService");
	 * 
	 * endpoint.setFeatures(Arrays.asList( new LoggingFeature()));
	 * //endpoint.setFeatures(Arrays.asList(new Swagger2Feature())); return
	 * endpoint.create(); }
	 */

}
