package co.com.choucair.certification.utest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;

import java.util.List;
import java.util.Map;

import static co.com.choucair.certification.utest.userinterface.SignUpPersonalPage.*;
import static co.com.choucair.certification.utest.userinterface.UTestHomePage.BUTTON_JOINTODAY;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillsOut implements Task {

    private List<Map<String, String>> personalData;

    public FillsOut(List<Map<String, String>> personalData){
        this.personalData = personalData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_JOINTODAY),
                Type.theValue(personalData.get(0).get("firstName")).into(INPUT_FIRSTNAME),
                Type.theValue(personalData.get(0).get("lastName")).into(INPUT_LASTNAME),
                Type.theValue(personalData.get(0).get("email")).into(INPUT_EMAIL),
                Type.theValue(personalData.get(0).get("birthMonth")).into(LIST_BIRTHMONTH),
                Type.theValue(personalData.get(0).get("birthDay")).into(LIST_BIRTHDAY),
                Type.theValue(personalData.get(0).get("birthYear")).into(LIST_BIRTHYEAR),
                Click.on(BUTTON_NEXT_LOCATION)


        );
    }

    public static FillsOut herPersonalInformation(List<Map<String, String>> personalData){
        return instrumented(FillsOut.class, personalData);
    }
}
