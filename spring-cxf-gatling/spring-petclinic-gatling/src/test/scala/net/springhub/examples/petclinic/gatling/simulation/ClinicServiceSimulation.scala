package net.springhub.examples.petclinic.gatling.simulation

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import net.springhub.examples.petclinic.gatling.scenarios.BrowsePets
import net.springhub.examples.petclinic.gatling.scenarios.BrowseVets
import net.springhub.examples.petclinic.gatling.scenarios.Owner

class ClinicServiceSimulation extends Simulation {
  
  val headers_content_types = Map("Content-Type" -> "multipart/mix")
   
    val httpConf = http
    .baseURL("http://localhost:8080/petclinic/webservices/rest/clinicRestService") 
    .acceptHeader("application/octet-stream,application/xml,text/html") 
    .headers(headers_content_types)
    
      
    val clinicServiceRestScenario = scenario("Clinic Rest Service Scenarios").exec(BrowsePets.petTypes, BrowseVets.vets, Owner.create)
        
    setUp(
          clinicServiceRestScenario.inject(atOnceUsers(1))
          ).protocols(httpConf)
    
}