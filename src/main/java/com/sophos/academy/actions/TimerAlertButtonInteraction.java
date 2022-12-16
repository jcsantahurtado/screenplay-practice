package com.sophos.academy.actions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class TimerAlertButtonInteraction implements Interaction {

    private final WebDriver driver;
    private final Target target;

    public TimerAlertButtonInteraction(WebDriver driver, Target target) {
        this.driver = driver;
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        target.resolveFor(actor).click();
        waitFiveMinutes();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    private static void waitFiveMinutes() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
