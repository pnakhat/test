package qainfolabs.test.steps;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.AfterScenario.Outcome;

public class MySteps {
	
	
	@Given("I am a passing step")
	public void passing(){
		System.out.println("Passing");
	}
	
	
	@Given("I am a failing step")

	public void failing(){
		System.out.println("Failing");
		throw new RuntimeException("aaaa");
	}
    
	
	@AfterScenario(uponOutcome = Outcome.FAILURE)
	public void waitAfterFailing() throws InterruptedException{
		System.out.println("Entered on failure");
		Thread.sleep(1000);
	}
    
}
