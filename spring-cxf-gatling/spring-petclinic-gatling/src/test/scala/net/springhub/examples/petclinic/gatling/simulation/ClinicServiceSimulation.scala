package net.springhub.examples.petclinic.gatling.simulation

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import net.springhub.examples.petclinic.gatling.scenarios.BrowsePets
import net.springhub.examples.petclinic.gatling.scenarios.BrowseVets

class ClinicServiceSimulation extends Simulation {
  
  val headers_content_type = Map("Content-Type" -> "application/xml")
   
    val httpConf = http
    .baseURL("http://localhost:8080/petclinic/webservices/rest/clinicRestService") // Here is the root for all relative URLs
    .acceptHeader("application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8") // Here are the common headers
    .doNotTrackHeader("1")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .acceptEncodingHeader("gzip, deflate")
    //.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0")
    .headers(headers_content_type)
    
    

      
    val clinicServiceRestScenario = scenario("Clinic Rest Service Scenarios").exec(BrowsePets.listPetTypes)
    
    val clinicServiceRestScenario2 = scenario("Clinic Rest Service Scenarios2").exec(BrowseVets.listVets)
    
    setUp(
          clinicServiceRestScenario.inject(atOnceUsers(1)),
          clinicServiceRestScenario2.inject(atOnceUsers(1))
          ).protocols(httpConf)
    
}