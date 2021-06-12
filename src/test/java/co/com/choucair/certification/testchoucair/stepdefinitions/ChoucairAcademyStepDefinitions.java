package co.com.choucair.certification.testchoucair.stepdefinitions;


import co.com.choucair.certification.testchoucair.tasks.Create;
import co.com.choucair.certification.testchoucair.tasks.OpenUp;

import co.com.choucair.certification.testchoucair.tasks.Register;
import co.com.choucair.certification.testchoucair.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than juan wants to register an account at the  Utest page$")
    public void thanJuanWantsToRegisterAnAccountAtTheUtestPage() {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage(),(Register.onThePage()));
    }


    @When("^he search his devices and tell about them$")
    public void heSearchHisDevicesAndTellAboutThem() {
        //OnStage.theActorInTheSpotlight().attemptsTo(Search.the(strComputer,strVersion,strLanguage,strMobile,strModel,strSystem));
        OnStage.theActorInTheSpotlight().attemptsTo(Search.theDevice("Windows","10","Spanish","Apple","iPhone 8","iOS 11.1.1"));
    }




    @Then("^He enters his password and accepts the terms$")
    public void heEntersHisPasswordAndAcceptsTheTerms() {
        OnStage.theActorInTheSpotlight().attemptsTo(Create.thePassword("WindowsM58","WindowsM58"));
    }


}
