package co.com.choucair.certification.testchoucair.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SearchDevice {
    public static final Target INPUT_COMPUTER = Target.the("where do we select the birth computer").located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/input[1]"));
    public static final Target INPUT_VERSION = Target.the("where do we select the birth computer version").located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/input[1]"));
    public static final Target INPUT_LANGUAGE = Target.the("where do we select the birth language").located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/input[1]"));
    public static final Target INPUT_MOBILE = Target.the("where do we select the birth mobile device").located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/input[1]"));
    public static final Target INPUT_MODEL = Target.the("where do we select the birth mode").located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/input[1]"));
    public static final Target INPUT_SYSTEM = Target.the("where do we select the birth operating system").located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/input[1]"));
    public static final Target NEXT_LAST_STEP_BUTTON = Target.the("button press next location").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/div[2]/div/a/span"));

    public static final Target INPUT_COMPUTER_CLICK = Target.the("where do we select the birth computer").located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target INPUT_VERSION_CLICK = Target.the("where do we select the birth computer version").located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/div[1]/span/span[2]"));
    public static final Target INPUT_LANGUAGE_CLICK = Target.the("where do we select the birth language").located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/div[1]/span/span[2]"));
    public static final Target INPUT_MOBILE_CLICK = Target.the("where do we select the birth mobile device").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MODEL_CLICK = Target.the("where do we select the birth mode").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]/span/span[2]"));
    public static final Target INPUT_SYSTEM_CLICK = Target.the("where do we select the birth operating system").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/span"));
}
