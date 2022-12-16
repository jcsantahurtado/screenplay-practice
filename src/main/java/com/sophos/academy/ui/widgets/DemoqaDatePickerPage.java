package com.sophos.academy.ui.widgets;

import net.serenitybdd.screenplay.targets.Target;

public class DemoqaDatePickerPage {

    public static final Target CONTAINER = Target.the("Contenedor principal")
            .locatedBy("id:datePickerContainer");

    public static final Target SELECT_DATE = Target.the("Select Date")
            .locatedBy("id:datePickerMonthYearInput");

    public static final Target DATE_AND_TIME = Target.the("Date And Time")
            .locatedBy("id:dateAndTimePickerInput");

}
