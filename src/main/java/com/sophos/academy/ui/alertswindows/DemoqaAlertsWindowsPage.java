package com.sophos.academy.ui.alertswindows;

import net.serenitybdd.screenplay.targets.Target;

public class DemoqaAlertsWindowsPage {

    public static final Target ALERTS = Target.the("Alerts")
            .locatedBy("//*[text()='Alerts']/ancestor::*[@id='item-1']");

}
