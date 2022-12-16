package com.sophos.academy.tasks;

import com.sophos.academy.ui.elements.DemoqaElementsPage;
import com.sophos.academy.ui.DemoqaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class BrowseToWebTables implements Task {

    public static BrowseToWebTables browseToWebTables() {
        return Tasks.instrumented(BrowseToWebTables.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(DemoqaPage.ELEMENTS),
                Click.on(DemoqaPage.ELEMENTS),
                Scroll.to(DemoqaElementsPage.WEB_TABLES),
                Click.on(DemoqaElementsPage.WEB_TABLES)
        );
    }
}
