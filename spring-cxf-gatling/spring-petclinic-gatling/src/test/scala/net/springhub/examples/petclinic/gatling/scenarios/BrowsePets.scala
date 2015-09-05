package net.springhub.examples.petclinic.gatling.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

object BrowsePets {

  
  val listPetTypes = exec(http("List Pet Types")
                          .get("/petTypes")
                          .check(xpath("//petTypes"))                     
                      )
}