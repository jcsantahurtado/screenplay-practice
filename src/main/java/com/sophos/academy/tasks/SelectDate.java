package com.sophos.academy.tasks;

import com.sophos.academy.model.Date;
import com.sophos.academy.ui.widgets.DemoqaDatePickerPage;
import com.sophos.academy.ui.widgets.DemoqaSelectDate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;

public class SelectDate implements Task {

    private final Date date;

    public SelectDate(Date date) {
        this.date = date;
    }

    public static SelectDate selectDate(Date date) {
        return Tasks.instrumented(SelectDate.class, date);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(DemoqaDatePickerPage.SELECT_DATE),
                Click.on(DemoqaDatePickerPage.SELECT_DATE),
                SendKeys.of(date.getYear()).into(DemoqaSelectDate.YEAR),
                SendKeys.of(date.getMonth()).into(DemoqaSelectDate.MONTH),
                Click.on(DemoqaSelectDate.DAY.of(date.getDay()))
        );
    }
}
