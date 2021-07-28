package stepsdefinitions;

import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import userinterfaces.Portal;
import task.HomeTask;
import userinterfaces.Empleos;
import net.serenitybdd.screenplay.actions.ScrollToBy;
import org.junit.Assert;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import org.aspectj.apache.bcel.classfile.Module;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AccesSteps {
    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void Escenario(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Juan");
    }

    @Given("^Juan esta en la pagina principal$")
    public void PaginaPrincipal(){

        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.choucairtesting.com/"));

    }
    @When("^Click en la seccion de Empleos$")
    public void SecciondeEmpleos() {

        theActorInTheSpotlight().attemptsTo(Click.on(Empleos.QueEsSer));

        theActorInTheSpotlight().attemptsTo(Click.on(Portal.BotonEmpleos));

        theActorInTheSpotlight().attemptsTo(Click.on(Portal.BotonExit));

    }
    @Then("^Ver la seccion de empleos$")
    public void Visualizacion(){

    }
}
