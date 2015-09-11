package net.springhub.examples.petclinic.gatling.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

object BrowseVets {
  
   val vets = exec(http("List Vets")
                     .get("/vets")
                     .check(xpath("//vets")))
}