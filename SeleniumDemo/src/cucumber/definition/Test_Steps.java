package cucumber.definition;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.utilities.Hooks;

public class Test_Steps {

	@Before(order=1)
    public void beforeScenario(){
        System.out.println("1");
    }
	@Before(order=0)
    public void beforeScenario0(){
        System.out.println("0");
    }

	@After
    public void afterScenario(){
        System.out.println("This will run after the every Scenario");
    }

	@Before("@First, @Fourth")
    public void beforeFirst(){
        System.out.println("This will run only before the First Scenario");
    }	

	@Before("@Second")
    public void beforeSecond(){
        System.out.println("This will run only before the Second Scenario");
    }	

	@Before("@Third")
    public void beforeThird(){
        System.out.println("This will run only before the Third Scenario");
    }

	@After("@First,@Fourth")
    public void afterFirst(){
        System.out.println("This will run only after the First Scenario");   
    }	

	@After("@Second")
    public void afterSecond(){
        System.out.println("This will run only after the Second Scenario");   
    }	

	@After("@Third")
    public void afterThird(){
        System.out.println("This will run only after the Third Scenario");   
    }	

	
	@Given("^Given1$")
	public void given1() {
		System.out.println("G1");
	}

	@Then("^Then1$")
	public void then1() {
		System.out.println("T1");
		}

	@Given("^Given2$")
	public void given2() {
		System.out.println("G2");
		}

	@Then("^Then2$")
	public void then2() {
		System.out.println("T2");
		}

	@Given("^Given3$")
	public void given3() {
		System.out.println("G3");
		}

	@Then("^Then3$")
	public void then3() {
		System.out.println("T3");
		}

	@Given("^Given4$")
	public void given4() {
		System.out.println("G4");
		}

	@Then("^Then4$")
	public void then4() {
		System.out.println("T4");
		}

}
