package co.com.choucair.certification.utest.tasks;

import cucumber.api.java.eo.Se;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.type.Type;

import java.util.List;
import java.util.Map;

import static co.com.choucair.certification.utest.userinterface.SignUpDevicesPage.LIST_COMPUTER;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Select implements Task {

    private List<Map<String, String>> devicesData;

    public Select(List<Map<String, String>> devicesData){
        this.devicesData = devicesData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Type.theValue(devicesData.get(0).get("computer")).into(LIST_COMPUTER));
    }

    public static Select herDevicesInformation(List<Map<String, String>> devicesData){
        return instrumented(Select.class, devicesData);
    }
}
