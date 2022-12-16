package com.sophos.academy.ui.widgets;

import net.serenitybdd.screenplay.targets.Target;

public class DemoqaSelectDateAndTime {

    public static final Target POPPER = Target.the("Popper")
            .locatedBy("//*[@class='react-datepicker-popper']");

    public static final Target DOWN_ARROW_YEAR = Target.the("Flecha abajo Año")
            .locatedBy("//*[@class='react-datepicker__year-read-view--down-arrow']");

    public static final Target YEAR = Target.the("Año")
            .locatedBy("//*[text()='{0}' and contains(@class, 'option')]");

    public static final Target DOWN_ARROW_MONTH = Target.the("Flecha abajo Mes")
            .locatedBy("//*[@class='react-datepicker__month-read-view--down-arrow']");

    public static final Target MONTH = Target.the("Mes")
            .locatedBy("//*[text()='{0}' and contains(@class, 'option')]");

    public static final Target DAY = Target.the("Día")
            .locatedBy("//*[not(contains(@class, '--outside-month')) and text() ='{0}']");

    public static final Target TIME = Target.the("Hora")
            .locatedBy("//*[text()='{0}']");

}
