package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class SignUpPersonalPage {

    public static final Target INPUT_FIRSTNAME = the("Text first name").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = the("Text last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = the("Text email address").located(By.id("email"));
    public static final Target LIST_BIRTHMONTH = the("List birth month").located(By.id("birthMonth"));
    public static final Target LIST_BIRTHDAY = the("List birth day").located(By.id("birthDay"));
    public static final Target LIST_BIRTHYEAR = the("List birth year").located(By.id("birthYear"));
    public static final Target BUTTON_NEXT_LOCATION = the("Button next: Location").locatedBy("//a[@class='btn btn-blue']");

}
