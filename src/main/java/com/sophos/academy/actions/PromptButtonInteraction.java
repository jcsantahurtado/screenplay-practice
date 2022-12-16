package com.sophos.academy.actions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class PromptButtonInteraction implements Interaction {

    private final WebDriver driver;
    private final Target target;
    private final String name;

    public PromptButtonInteraction(WebDriver driver, Target target, String name) {
        this.driver = driver;
        this.target = target;
        this.name = name;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        target.resolveFor(actor).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(name);
        alert.accept();
    }
}
