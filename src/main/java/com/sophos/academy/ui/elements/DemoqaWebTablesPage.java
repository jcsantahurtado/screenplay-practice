package com.sophos.academy.ui.elements;

import net.serenitybdd.screenplay.targets.Target;

public class DemoqaWebTablesPage {

    public static final Target BTN_ADD = Target.the("Botón Add")
            .locatedBy("id:addNewRecordButton");

    public static final Target BTN_DELETE = Target.the("Botón Delete")
            .locatedBy("id:delete-record-{0}");

    public static final Target TEXT_FIELD = Target.the("Campo 'Apellido' del usuario ingresado")
            .locatedBy("//*[text()='{0}']");

}
