package com.sophos.academy.tasks;

import com.sophos.academy.ui.elements.DemoqaWebTablesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class DeleteRecord implements Task {

    private final String userId;

    public DeleteRecord(String userId) {
        this.userId = userId;
    }

    public static DeleteRecord deleteRecord(String userId) {
        return Tasks.instrumented(DeleteRecord.class, userId);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DemoqaWebTablesPage.BTN_DELETE.of(userId))
        );
    }
}
