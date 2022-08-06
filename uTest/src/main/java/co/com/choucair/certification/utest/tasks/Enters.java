package co.com.choucair.certification.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;

import java.util.List;
import java.util.Map;

import static co.com.choucair.certification.utest.userinterface.PasswordPage.*;
import static co.com.choucair.certification.utest.userinterface.SignUpAddressPage.*;
import static co.com.choucair.certification.utest.userinterface.SignUpDevicesPage.BUTTON_LAST_STEP;
import static co.com.choucair.certification.utest.userinterface.SignUpPersonalPage.BUTTON_NEXT_LOCATION;
import static co.com.choucair.certification.utest.userinterface.SignUpPersonalPage.INPUT_FIRSTNAME;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Enters implements Task {

    private final List<Map<String, String>> addressData;

    public Enters(List<Map<String, String>> addressData){
        this.addressData = addressData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Type.theValue(addressData.get(0).get("city")).into(INPUT_CITY),
                Type.theValue(addressData.get(0).get("postalCode")).into(INPUT_POSTAL_CODE),
                Click.on(BUTTON_NEXT_DEVICES),
                Click.on(BUTTON_LAST_STEP),
                Type.theValue(addressData.get(0).get("password")).into(INPUT_PASSWORD),
                Type.theValue(addressData.get(0).get("password")).into(INPUT_PASSWORD_CONFIRM),
                Click.on(CHECK_TERMS),
                Click.on(CHECK_ACEPT_PRIVACY),
                Click.on(BUTTON_COMPLETE)
                );
    }

    public static Enters herAddressData(List<Map<String, String>> addressData){
        return instrumented(Enters.class, addressData);
    }
}
