package task;
import org.openqa.selenium.WebDriver;
import userinterfaces.Inicio;
import userinterfaces.Empleos;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HomeTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(Inicio.Empleos),Click.on(Empleos.AceptarCookies),Click.on(Empleos.PrepararseAplicar),Click.on(Empleos.UP));



    }


}
