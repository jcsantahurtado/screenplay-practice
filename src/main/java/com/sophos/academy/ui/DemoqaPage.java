package com.sophos.academy.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://demoqa.com/")
public class DemoqaPage extends PageObject {

    @Override
    protected void setDriver(WebDriver driver, long timeout) {
        super.setDriver(driver, timeout);
    }

    public static final Target ELEMENTS = Target.the("Opción elements")
            .locatedBy("//*[text()='Elements']/ancestor::*[contains(@class,'top')]/child::*");

    public static final Target WIDGETS = Target.the("Opción widgets")
            .locatedBy("//*[text()='Widgets']/ancestor::*[contains(@class,'top')]/child::*");

    public static final Target ALERTS_FRAME_AND_WINDOWS = Target.the("Opción Alerts, Frame & Windows")
            .locatedBy("//*[text()='Alerts, Frame & Windows']/ancestor::*[contains(@class,'top')]/child::*");

}
