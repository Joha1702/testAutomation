package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.UTestHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class Open implements Task {

    private UTestHomePage uTestHomePagepage;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(net.serenitybdd.screenplay.actions.Open.browserOn(uTestHomePagepage));
    }

    public static Open thePage(){
        return instrumented(Open.class);
    }
}
