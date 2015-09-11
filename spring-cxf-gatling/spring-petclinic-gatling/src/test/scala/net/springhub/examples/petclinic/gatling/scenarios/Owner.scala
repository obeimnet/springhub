package net.springhub.examples.petclinic.gatling.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

object Owner {
  
  
   val create =       feed(csv("owners.csv").random)
                      .exec(http("create owner")
                     .post("/owner")
                     .body(ELFileBody("owner.xml")).asXML
                     .check(status.is(204)))
}