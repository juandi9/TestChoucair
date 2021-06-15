package co.com.choucair.certification.testchoucair.tasks;

import co.com.choucair.certification.testchoucair.userinterface.SearchDevice;
import co.com.choucair.certification.testchoucair.userinterface.UTestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


public class Search implements Task {


    private String strComputer;
    private String strVersion;
    private String strLanguage;


    public Search(String strComputer, String strVersion, String strLanguage) {
        this.strComputer = strComputer;
        this.strVersion = strVersion;
        this.strLanguage = strLanguage;

    }



    public static Search theDevice(String strComputer, String strVersion, String strLanguage) {
        return Tasks.instrumented(Search.class,strComputer,strVersion,strLanguage);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(

                Click.on(SearchDevice.INPUT_COMPUTER_CLICK),
                Enter.theValue(strComputer).into(SearchDevice.INPUT_COMPUTER),
                Click.on(SearchDevice.INPUT_VERSION_CLICK),
                Enter.theValue(strVersion).into(SearchDevice.INPUT_VERSION),
                Click.on(SearchDevice.INPUT_LANGUAGE_CLICK),
                Enter.theValue(strLanguage).into(SearchDevice.INPUT_LANGUAGE),
               /*
               Click.on(SearchDevice.INPUT_MOBILE_CLICK),
               Enter.theValue(strMobile).into(SearchDevice.INPUT_MOBILE),
                Click.on(SearchDevice.INPUT_MODEL_CLICK),
                Enter.theValue(strModel).into(SearchDevice.INPUT_MODEL),
                Click.on(SearchDevice.INPUT_SYSTEM_CLICK),
                Enter.theValue(strSystem).into(SearchDevice.INPUT_SYSTEM),


                */
                Click.on(SearchDevice.NEXT_LAST_STEP_BUTTON)

        );
    }
}
