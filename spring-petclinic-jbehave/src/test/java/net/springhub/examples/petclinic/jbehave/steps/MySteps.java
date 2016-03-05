package net.springhub.examples.petclinic.jbehave.steps;
import org.jbehave.core.annotations.*;
import org.springframework.stereotype.Component;

@Component
public class MySteps{
	
	@Given("abc")
	public void givenAbc(){
		 System.out.println("abc1");
	}
	
	@Then("abc")
	public void thenAbc(){
		System.out.println("abc2");
	}
	
	@When("abc")
	public void whenAbc(){
		System.out.println("abc3");
	}
}