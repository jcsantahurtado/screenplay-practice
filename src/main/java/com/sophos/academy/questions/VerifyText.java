package com.sophos.academy.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;


public class VerifyText implements Question<String> {

    private final Target target;

    public VerifyText(Target target) {
        this.target = target;
    }

    public static VerifyText ofTheElement(Target target) {
        return new VerifyText(target);
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(target).viewedBy(actor).asString();
    }
}
