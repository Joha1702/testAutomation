package co.com.choucair.certification.utest.stepdefinitions;

import co.com.choucair.certification.utest.tasks.FillsOut;
import co.com.choucair.certification.utest.tasks.Open;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;


public class UserRegisterStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Leidy is on uTest page$")
    public void thatUserIsOnUTestPage() {

        OnStage.theActorCalled("Leidy").wasAbleTo(Open.thePage());
    }

    @When("^she fills out her personal information$")
    public void sheFillsOutHerPersonalInformation(List<Map<String, String>> personalData) {
        OnStage.withCurrentActor(FillsOut.herPersonalInformation(personalData));
    }

    @When("^she enters her address data$")
    public void sheEntersHerAddressData(DataTable arg1) {

    }

    @When("^she enters her devices information$")
    public void sheEntersHerDevicesInformation(DataTable arg1) {

    }

    @When("^she enters a secure password$")
    public void sheEntersASecurePassword(DataTable arg1) {

    }

    @Then("^she should be registered on the page$")
    public void sheShouldBeRegisteredOnThePage() {

    }
}
