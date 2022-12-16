package com.sophos.academy.actions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebDriver;

public class ConfirmButtonInteraction implements Interaction {

    private final WebDriver driver;
    private final Target target;

    public ConfirmButtonInteraction(WebDriver driver, Target target) {
        this.driver = driver;
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        target.resolveFor(actor).click();
        driver.switchTo().alert().accept();
    }
}
