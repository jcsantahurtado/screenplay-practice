package com.sophos.academy.steps;

import com.sophos.academy.model.Date;
import com.sophos.academy.model.DateAndTime;
import com.sophos.academy.questions.VerifyValue;
import com.sophos.academy.tasks.BrowseToDatePicker;
import com.sophos.academy.tasks.SelectDate;
import com.sophos.academy.tasks.SelectDateAndTime;
import com.sophos.academy.ui.widgets.DemoqaDatePickerPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

public class SeleccionarFechasStepDefs {

    @When("^Selecciono \"([^\"]*)\", \"([^\"]*)\" y \"([^\"]*)\" en la opcion Select Date$")
    public void seleccionoYEnLaOpcionSelectDate(String year, String month, String day) {
        Date date = new Date(year, month, day);
        theActorInTheSpotlight().attemptsTo(BrowseToDatePicker.browseToDatePicker());
        theActorInTheSpotlight().attemptsTo(SelectDate.selectDate(date));

    }

    @And("^Selecciono \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" y \"([^\"]*)\" en la opcion Select Date And Time$")
    public void seleccionoYEnLaOpcionSelectDateAndTime(String year, String month, String day, String time) {
        DateAndTime dateAndTime = new DateAndTime(year, month, day, time);
        theActorInTheSpotlight().attemptsTo(SelectDateAndTime.selectDateAndTime(dateAndTime));
    }

    @Then("^Valido que la fecha tenga el \"([^\"]*)\" correcto$")
    public void validoQueLaFechaTengaElCorrecto(String month) {
        theActorInTheSpotlight().should(seeThat(VerifyValue.ofTheField(DemoqaDatePickerPage.DATE_AND_TIME),
                containsString(month)));
    }
}
