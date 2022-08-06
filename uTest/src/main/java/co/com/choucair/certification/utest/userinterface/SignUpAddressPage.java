package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class SignUpAddressPage {

    public static final Target INPUT_CITY = the("Text City").located(By.id("city"));
    public static final Target INPUT_POSTAL_CODE = the("Text Zip or postal code").located(By.id("zip"));
    public static final Target LIST_COUNTRY = the("List Country").locatedBy("//input[@class='form-control ui-select-search ng-valid ng-dirty ng-touched ng-empty']");
    public static final Target BUTTON_NEXT_DEVICES = the("Text Next: Devices").locatedBy("//a[@class='btn btn-blue pull-right']");

}
