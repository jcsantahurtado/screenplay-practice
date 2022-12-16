package com.sophos.academy.ui.elements;

import net.serenitybdd.screenplay.targets.Target;

public class DemoqaRegistrationFormPage {

    public static final Target FIRST_NAME = Target.the("First Name")
            .locatedBy("id:firstName");

    public static final Target LAST_NAME = Target.the("Last Name")
            .locatedBy("id:lastName");

    public static final Target EMAIL = Target.the("Email")
            .locatedBy("id:userEmail");

    public static final Target AGE = Target.the("Age")
            .locatedBy("id:age");

    public static final Target SALARY = Target.the("Salary")
            .locatedBy("id:salary");

    public static final Target DEPARTMENT = Target.the("Department")
            .locatedBy("id:department");

    public static final Target SUBMIT = Target.the("Submit")
            .locatedBy("id:submit");

}
