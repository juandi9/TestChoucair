package co.com.choucair.certification.testchoucair.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UTestFinish {
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password").located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("where do we write the password confirm").located(By.id("confirmPassword"));
    public static final Target CHECK_FIRST_CONDITION = Target.the("where do we check the first condition").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_SECOND_CONDITION = Target.the("where do we check the second condition").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETE_BUTTON = Target.the("button press complete register").located(By.xpath("//*[@id='laddaBtn']/span"));

}
