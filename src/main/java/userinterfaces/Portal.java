package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Portal {
    public static final Target BotonEmpleos=Target.the("BotonEmpleos").locatedBy("//div[@data-id=\"d1f45a7\"]");
    public static final Target BotonExit=Target.the("Salir").locatedBy("//a[@class=\"elementor-button-link elementor-button elementor-size-sm\"]");

}
