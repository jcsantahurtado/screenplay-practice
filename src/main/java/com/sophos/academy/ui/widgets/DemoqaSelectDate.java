package com.sophos.academy.ui.widgets;

import net.serenitybdd.screenplay.targets.Target;

public class DemoqaSelectDate {

    public static final Target YEAR = Target.the("Año")
            .locatedBy("//*[@class='react-datepicker__year-select']");

    public static final Target MONTH = Target.the("Mes")
            .locatedBy("//*[@class='react-datepicker__month-select']");

    public static final Target DAY = Target.the("Día")
            .locatedBy("//*[not(contains(@class, '--outside-month')) and text() ='{0}']");

}
