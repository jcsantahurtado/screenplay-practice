package com.sophos.academy.steps;

import com.sophos.academy.questions.VerifyDeleteBtn;
import com.sophos.academy.tasks.BrowseToWebTables;
import com.sophos.academy.tasks.DeleteRecord;
import com.sophos.academy.ui.elements.DemoqaWebTablesPage;
import com.sophos.academy.utils.Constant;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.equalTo;


public class EliminarRegistroStepDefs {

    @When("^Elimino el registro con id \"([^\"]*)\" de la tabla$")
    public void eliminoElRegistroConIdDeLaTabla(String recordId) {
        theActorInTheSpotlight().attemptsTo(BrowseToWebTables.browseToWebTables());
        theActorInTheSpotlight().attemptsTo(DeleteRecord.deleteRecord(recordId));
    }

    @Then("^Valido que el registro con id \"([^\"]*)\" quede eliminado$")
    public void validoQueElRegistroConIdQuedeEliminado(String recordId) {
        theActorInTheSpotlight().should(seeThat(VerifyDeleteBtn.doesNotExist(DemoqaWebTablesPage.BTN_DELETE.of(recordId)),
                equalTo(Constant.TRUE)));
    }
}
