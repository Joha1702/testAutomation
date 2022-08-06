package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class PasswordPage {

    public static final Target INPUT_PASSWORD = the("Text password").located(By.id("password"));
    public static final Target INPUT_PASSWORD_CONFIRM = the("Text password").located(By.id("confirmPassword"));
    public static final Target BUTTON_COMPLETE = the("Button complete").located(By.id("laddaBtn"));
    public static final Target CHECK_TERMS = the("Button complete").locatedBy("//input[@id='termOfUse']/following-sibling::span[@class='checkmark signup-consent__checkbox error']");
    public static final Target CHECK_ACEPT_PRIVACY = the("Button complete").locatedBy("//input[@id='privacySetting']/following-sibling::span[@class='checkmark signup-consent__checkbox error']");
}
