package com.sophos.academy.tasks;

import com.sophos.academy.model.User;
import com.sophos.academy.ui.elements.DemoqaRegistrationFormPage;
import com.sophos.academy.ui.elements.DemoqaWebTablesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class AddNewRecord implements Task {

    private final User user;

    public AddNewRecord(User user) {
        this.user = user;
    }

    public static AddNewRecord addNewRecord(User user) {
        return Tasks.instrumented(AddNewRecord.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(DemoqaWebTablesPage.BTN_ADD),
                Click.on(DemoqaWebTablesPage.BTN_ADD),
                Enter.theValue(user.getFirstName()).into(DemoqaRegistrationFormPage.FIRST_NAME),
                Enter.theValue(user.getLastName()).into(DemoqaRegistrationFormPage.LAST_NAME),
                Enter.theValue(user.getEmail()).into(DemoqaRegistrationFormPage.EMAIL),
                Enter.theValue(user.getAge()).into(DemoqaRegistrationFormPage.AGE),
                Enter.theValue(user.getSalary()).into(DemoqaRegistrationFormPage.SALARY),
                Enter.theValue(user.getDepartment()).into(DemoqaRegistrationFormPage.DEPARTMENT),
                Click.on(DemoqaRegistrationFormPage.SUBMIT)
        );
    }
}
