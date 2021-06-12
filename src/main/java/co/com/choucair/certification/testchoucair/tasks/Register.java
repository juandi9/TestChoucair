package co.com.choucair.certification.testchoucair.tasks;

import co.com.choucair.certification.testchoucair.userinterface.UTestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Register implements Task {



    public static Register onThePage() {
        return Tasks.instrumented(Register.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestRegisterPage.JOIN_BUTTON),
                Enter.theValue("Juan").into(UTestRegisterPage.INPUT_NAME),
                Enter.theValue("Arboleda").into(UTestRegisterPage.INPUT_LAST_NAME),
                Enter.theValue("Jhhhhhnfnn@gmail.com").into(UTestRegisterPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("June").from(UTestRegisterPage.INPUT_MONTH),
                SelectFromOptions.byVisibleText("30").from(UTestRegisterPage.INPUT_DAY),
                SelectFromOptions.byVisibleText("1999").from(UTestRegisterPage.INPUT_YEAR),
                Click.on(UTestRegisterPage.NEXT_LOCATION_BUTTON),
                //Enter.theValue("Medellín").into(UTestRegisterPage.INPUT_CITY),
                Enter.theValue("050015").into(UTestRegisterPage.INPUT_POSTAL_CODE),
                Click.on(UTestRegisterPage.INPUT_COUNTRY_CLICK),
                Enter.theValue("Colombia").into(UTestRegisterPage.INPUT_COUNTRY),
                Click.on(UTestRegisterPage.NEXT_DEVICES_BUTTON)
        );
    }
}