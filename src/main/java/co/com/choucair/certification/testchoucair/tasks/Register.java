package co.com.choucair.certification.testchoucair.tasks;

import co.com.choucair.certification.testchoucair.userinterface.UTestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Register implements Task {


    private String strName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;
    private String strPostalCode;
    private String strCountry;

    public Register(String strName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, String strPostalCode, String strCountry) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strPostalCode = strPostalCode;
        this.strCountry = strCountry;
    }

    public static Register onThePage(String strName,String strLastName,String strEmail,String strMonth,String strDay,String strYear,String strPostalCode,String strCountry) {
        return Tasks.instrumented(Register.class,strName,strLastName,strEmail,strMonth,strDay,strYear,strPostalCode,strCountry);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestRegisterPage.JOIN_BUTTON),
                Enter.theValue(strName).into(UTestRegisterPage.INPUT_NAME),
                Enter.theValue(strLastName).into(UTestRegisterPage.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(UTestRegisterPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strMonth).from(UTestRegisterPage.INPUT_MONTH),
                SelectFromOptions.byVisibleText(strDay).from(UTestRegisterPage.INPUT_DAY),
                SelectFromOptions.byVisibleText(strYear).from(UTestRegisterPage.INPUT_YEAR),
                Click.on(UTestRegisterPage.NEXT_LOCATION_BUTTON),
                //Enter.theValue("Medellín").into(UTestRegisterPage.INPUT_CITY),
                Enter.theValue(strPostalCode).into(UTestRegisterPage.INPUT_POSTAL_CODE),
                Click.on(UTestRegisterPage.INPUT_COUNTRY_CLICK),
                Enter.theValue(strCountry).into(UTestRegisterPage.INPUT_COUNTRY),
                Click.on(UTestRegisterPage.NEXT_DEVICES_BUTTON)
        );
    }
}