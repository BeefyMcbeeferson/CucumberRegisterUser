package stepDefinitions;

import common.Registrator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {

    private Registrator registrator;

    @Given("I have correct url")
    public void iHaveCorrectUrl() {

        Registrator registrator = registrator;
        System.out.println("I have correct url");
    }

    @When("I fill in all required fields")
    public void iFillInAllRequiredFields() {

        registrator.add();

        System.out.println("All required fields are filled in");
    }

    @And("Click on registrate button")
    public void clickOnRegistrateButton() {
        System.out.println("Clicking on registrate button");
    }

    @Then("An account is created")
    public void anAccountIsCreated(string expected) {
        string actual = registrator.getResult();

        System.out.println("User account is created");

        assertEquals(expected, actual);
    }

    private void assertEquals(string expected, string actual) {
    }
}
