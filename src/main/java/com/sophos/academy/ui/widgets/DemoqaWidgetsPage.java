package com.sophos.academy.ui.widgets;

import net.serenitybdd.screenplay.targets.Target;

public class DemoqaWidgetsPage {

    public static final Target DATE_PICKER = Target.the("Date Picker")
            .locatedBy("//*[text()='Date Picker']/ancestor::*[@id='item-2']");

}
