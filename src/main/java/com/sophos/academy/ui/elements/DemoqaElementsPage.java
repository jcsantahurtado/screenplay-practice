package com.sophos.academy.ui.elements;

import net.serenitybdd.screenplay.targets.Target;

public class DemoqaElementsPage {

    public static final Target WEB_TABLES = Target.the("Web Tables")
            .locatedBy("//*[text()='Web Tables']/ancestor::*[@id='item-3']");

}
