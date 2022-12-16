package com.sophos.academy.tasks;

import com.sophos.academy.ui.DemoqaPage;
import com.sophos.academy.ui.widgets.DemoqaWidgetsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class BrowseToDatePicker implements Task {

    public static BrowseToDatePicker browseToDatePicker() {
        return Tasks.instrumented(BrowseToDatePicker.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(DemoqaPage.WIDGETS),
                Click.on(DemoqaPage.WIDGETS),
                Scroll.to(DemoqaWidgetsPage.DATE_PICKER),
                Click.on(DemoqaWidgetsPage.DATE_PICKER)
        );
    }
}
