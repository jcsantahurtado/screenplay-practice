package com.sophos.academy.steps;

import com.sophos.academy.model.User;
import com.sophos.academy.questions.VerifyText;
import com.sophos.academy.tasks.AddNewRecord;
import com.sophos.academy.tasks.BrowseToWebTables;
import com.sophos.academy.ui.DemoqaPage;
import com.sophos.academy.ui.elements.DemoqaWebTablesPage;
import com.sophos.academy.utils.Constant;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static org.hamcrest.Matchers.equalTo;


public class AgregarRegistroStepDefs {

    @Before
    public void setup() {
        setTheStage(new OnlineCast());
    }

    @Given("^Necesito ingresar a la pagina$")
    public void necesitoIngresarALaPagina() {
        theActorCalled(Constant.ACTOR_NAME).wasAbleTo(Open.browserOn(new DemoqaPage()));
    }

    @When("^Agrego \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" y \"([^\"]*)\" a la tabla$")
    public void agregoYALaTabla(String firstName, String lastName, String email, String age, String salary, String department) {
        User user = new User(firstName, lastName, email, age, salary, department);
        theActorInTheSpotlight().attemptsTo(BrowseToWebTables.browseToWebTables());
        theActorInTheSpotlight().attemptsTo(AddNewRecord.addNewRecord(user));

    }

    @Then("^Valido que \"([^\"]*)\" quede ingresado el registro$")
    public void validoQueQuedeIngresadoElRegistro(String lastName) {
        theActorInTheSpotlight().should(seeThat(VerifyText.ofTheElement(DemoqaWebTablesPage.TEXT_FIELD.of(lastName)),
                equalTo(lastName)));
    }
}
