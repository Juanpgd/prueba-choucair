package userinterfaces;
import net.serenitybdd.screenplay.actions.ScrollToWebElement;
import net.serenitybdd.screenplay.actions.ScrollToBy;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Empleos {
    public static final Target AceptarCookies=Target.the("Aceptar Cookies").
            locatedBy("//a[@id=\"cookie_action_close_header\"]");

    public static final Target PrepararseAplicar=Target.the("Cursos").
            locatedBy("//img[@title=\"empleosazulMesa de trabajo 1\"]");

    public static final Target UP=Target.the("subir").
            locatedBy("//a[@class=\"go-top show\"]");
    public static final Target QueEsSer=Target.the("Unirse").
            locatedBy("//img[@title=\"serchazuleMesa de trabajo 1\"]");
}
