package com.sophos.academy.tasks;

import com.sophos.academy.model.DateAndTime;
import com.sophos.academy.ui.widgets.DemoqaSelectDateAndTime;
import com.sophos.academy.ui.widgets.DemoqaDatePickerPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class SelectDateAndTime implements Task {

    private final DateAndTime dateAndTime;

    public SelectDateAndTime(DateAndTime dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public static SelectDateAndTime selectDateAndTime(DateAndTime dateAndTime) {
        return Tasks.instrumented(SelectDateAndTime.class, dateAndTime);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(DemoqaDatePickerPage.CONTAINER),
                Click.on(DemoqaDatePickerPage.DATE_AND_TIME),
                Scroll.to(DemoqaSelectDateAndTime.POPPER),
                Click.on(DemoqaSelectDateAndTime.DOWN_ARROW_YEAR),
                Click.on(DemoqaSelectDateAndTime.YEAR.of(dateAndTime.getYear())),
                Click.on(DemoqaSelectDateAndTime.DOWN_ARROW_MONTH),
                Click.on(DemoqaSelectDateAndTime.MONTH.of(dateAndTime.getMonth())),
                Click.on(DemoqaSelectDateAndTime.DAY.of(dateAndTime.getDay())),
                Click.on(DemoqaSelectDateAndTime.TIME.of(dateAndTime.getTime())),
                Scroll.to(DemoqaDatePickerPage.CONTAINER)
        );
    }
}
