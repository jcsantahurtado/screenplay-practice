package com.sophos.academy.tasks;

import com.sophos.academy.ui.alertswindows.DemoqaAlertsWindowsPage;
import com.sophos.academy.ui.DemoqaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class BrowseToAlertsFrameAndWindows implements Task {

    public static BrowseToAlertsFrameAndWindows browseToAlertsFrameAndWindows() {
        return Tasks.instrumented(BrowseToAlertsFrameAndWindows.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(DemoqaPage.ALERTS_FRAME_AND_WINDOWS),
                Click.on(DemoqaPage.ALERTS_FRAME_AND_WINDOWS),
                Scroll.to(DemoqaAlertsWindowsPage.ALERTS),
                Click.on(DemoqaAlertsWindowsPage.ALERTS)
        );
    }
}
