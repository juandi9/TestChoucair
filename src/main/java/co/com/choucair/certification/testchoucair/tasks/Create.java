package co.com.choucair.certification.testchoucair.tasks;

import co.com.choucair.certification.testchoucair.userinterface.SearchDevice;
import co.com.choucair.certification.testchoucair.userinterface.UTestFinish;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Create implements Task {
    private String strPassword;
    private String strConfirmPassword;

    public Create(String strPassword, String strConfirmPassword) {
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }

    public static Create thePassword(String strPassword, String strConfirmPassword) {
        return Tasks.instrumented(Create.class,strPassword,strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strPassword).into(UTestFinish.INPUT_PASSWORD),
                Enter.theValue(strConfirmPassword).into(UTestFinish.INPUT_CONFIRM_PASSWORD),
                Click.on(UTestFinish.CHECK_FIRST_CONDITION),
                Click.on(UTestFinish.CHECK_SECOND_CONDITION),
                Click.on(UTestFinish.COMPLETE_BUTTON)
        );
    }
}
