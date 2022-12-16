package com.sophos.academy.tasks;

import com.sophos.academy.actions.Action;
import com.sophos.academy.ui.alertswindows.DemoqaAlerts;
import com.sophos.academy.utils.Constant;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;

public class HandleAlerts implements Task {

    public static HandleAlerts handleAlerts() {
        return Tasks.instrumented(HandleAlerts.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(DemoqaAlerts.NORMAL_ALERT),
                Action.alertButtonInteraction(DemoqaAlerts.NORMAL_ALERT)
        );

        actor.attemptsTo(
                Scroll.to(DemoqaAlerts.TIMER_ALERT),
                Action.timerAlertButtonInteraction(DemoqaAlerts.TIMER_ALERT)
        );

        actor.attemptsTo(
                Scroll.to(DemoqaAlerts.CONFIRM_ALERT),
                Action.confirmButtonInteraction(DemoqaAlerts.CONFIRM_ALERT)
        );

        actor.attemptsTo(
                Scroll.to(DemoqaAlerts.PROMT_ALERT),
                Action.promptButtonInteraction(DemoqaAlerts.PROMT_ALERT, Constant.ACTOR_NAME)
        );

    }
}
