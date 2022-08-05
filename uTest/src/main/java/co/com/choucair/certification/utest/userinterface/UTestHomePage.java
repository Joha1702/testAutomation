package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

@DefaultUrl("https://utest.com/")
public class UTestHomePage extends PageObject {

    public static final Target BUTTON_JOINTODAY =
            the("Button Join Today").located(By.className("unauthenticated-nav-bar__sign-up"));
}
