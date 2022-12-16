package com.sophos.academy.steps;

import com.sophos.academy.questions.VerifyText;
import com.sophos.academy.tasks.*;
import com.sophos.academy.ui.alertswindows.DemoqaAlerts;
import com.sophos.academy.utils.Constant;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

public class InteractuarVentanasStepDefs {

    @When("^Interactuo con cualquier ventana$")
    public void interactuoConCualquierVentana() {
        theActorInTheSpotlight().attemptsTo(BrowseToAlertsFrameAndWindows.browseToAlertsFrameAndWindows());
        theActorInTheSpotlight().attemptsTo(HandleAlerts.handleAlerts());
    }

    @Then("^Verifico que aparezca un texto$")
    public void verificoQueAparezcaUnTexto() {
        theActorInTheSpotlight().should(seeThat(VerifyText.ofTheElement(DemoqaAlerts.PROMPT_RESULT),
                containsString(Constant.ACTOR_NAME)));
    }
}
