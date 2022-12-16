package com.sophos.academy.actions;

import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.WebDriver;

public class Action {

    public static final WebDriver driver = ThucydidesWebDriverSupport.getDriver();  // private

    public static Performable alertButtonInteraction(Target target) {
        return Tasks.instrumented(AlertButtonInteraction.class, driver, target);
    }

    public static Interaction timerAlertButtonInteraction(Target target) {
        return Tasks.instrumented(TimerAlertButtonInteraction.class, driver, target);
    }

    public static Performable confirmButtonInteraction(Target target) {
        return Tasks.instrumented(ConfirmButtonInteraction.class, driver, target);
    }

    public static Performable promptButtonInteraction(Target target, String name) {
        return Tasks.instrumented(PromptButtonInteraction.class, driver, target, name);
    }
}
