package com.sophos.academy.steps;

import com.sophos.academy.ui.DemoqaPage;
import com.sophos.academy.utils.Constant;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class ComunStepDefs {

    @Before
    public void setup() {
        setTheStage(new OnlineCast());
    }

    @Given("^Necesito ingresar a la pagina$")
    public void necesitoIngresarALaPagina() {
        theActorCalled(Constant.ACTOR_NAME).wasAbleTo(Open.browserOn(new DemoqaPage()));
    }
}
