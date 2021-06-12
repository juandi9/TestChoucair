package co.com.choucair.certification.testchoucair.userinterface;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UTestRegisterPage  {
    public static final Target JOIN_BUTTON = Target.the("button that shows us the form to register").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target INPUT_NAME = Target.the("where do we write the first name").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("where do we write the last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the email").located(By.id("email"));
    public static final Target INPUT_MONTH = Target.the("where do we select the birth month").located(By.xpath("//*[@id='birthMonth']"));
    public static final Target INPUT_DAY = Target.the("where do we select the birth day").located(By.xpath("//*[@id='birthDay']"));
    public static final Target INPUT_YEAR = Target.the("where do we select the birth year").located(By.xpath("//*[@id='birthYear']"));
    public static final Target NEXT_LOCATION_BUTTON = Target.the("button press next location").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public static final Target INPUT_CITY = Target.the("where do we write the city").located(By.id("city"));
    public static final Target INPUT_POSTAL_CODE = Target.the("where do we write the postal code").located(By.id("zip"));
    public static final Target INPUT_COUNTRY = Target.the("where do we select the contry").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target NEXT_DEVICES_BUTTON = Target.the("button press next devices").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));
    public static final Target INPUT_COUNTRY_CLICK = Target.the("button press next devices").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));

}
