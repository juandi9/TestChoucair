package co.com.choucair.certification.testchoucair.stepdefinitions;


import co.com.choucair.certification.testchoucair.model.UTestData;
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

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than juan wants to register an account at the  Utest page$")
    public void thanJuanWantsToRegisterAnAccountAtTheUtestPage(List<UTestData> uTestData) throws Exception {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage(),(Register.onThePage(uTestData.get(0).getStrName(),uTestData.get(0).getStrLastName(),uTestData.get(0).getStrEmail(),uTestData.get(0).getStrMonth(),uTestData.get(0).getStrDay(),uTestData.get(0).getStrYear(),uTestData.get(0).getStrPostalCode(),uTestData.get(0).getStrCountry())));
    }


    @When("^he search his devices and tell about them$")
    public void heSearchHisDevicesAndTellAboutThem(List<UTestData> uTestData) throws Exception {
        //OnStage.theActorInTheSpotlight().attemptsTo(Search.the(strComputer,strVersion,strLanguage,strMobile,strModel,strSystem));
        OnStage.theActorInTheSpotlight().attemptsTo(Search.theDevice(uTestData.get(0).getStrComputer(),uTestData.get(0).getStrVersion(),uTestData.get(0).getStrLanguage()));
    }




    @Then("^He enters his password and accepts the terms$")
    public void heEntersHisPasswordAndAcceptsTheTerms(List<UTestData> uTestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Create.thePassword(uTestData.get(0).getStrPassword(),uTestData.get(0).getStrConfirmPassword()));
    }


}
