package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class SignUpDevicesPage {

    public static final Target BUTTON_LAST_STEP = the("button Next: Last step").locatedBy("//span[@class='btn-inline-error ng-hide']");
}
