package com.sophos.academy.ui.alertswindows;

import net.serenitybdd.screenplay.targets.Target;

public class DemoqaAlerts {

    public static final Target NORMAL_ALERT = Target.the("Button to see alert")
            .locatedBy("id:alertButton");

    public static final Target TIMER_ALERT = Target.the("Button to see alert will appear after 5 seconds")
            .locatedBy("id:timerAlertButton");

    public static final Target CONFIRM_ALERT = Target.the("Button to see confirm box will appear")
            .locatedBy("id:confirmButton");

    public static final Target PROMT_ALERT = Target.the("Button to see prompt box will appear")
            .locatedBy("id:promtButton");

    public static final Target PROMPT_RESULT = Target.the("Nombre ingresado")
            .locatedBy("id:promptResult");

}
