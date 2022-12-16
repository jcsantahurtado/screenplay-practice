package com.sophos.academy.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Value;
import net.serenitybdd.screenplay.targets.Target;


public class VerifyValue implements Question<String> {

    private final Target target;

    public VerifyValue(Target target) {
        this.target = target;
    }

    public static VerifyValue ofTheField(Target target) {
        return new VerifyValue(target);
    }

    @Override
    public String answeredBy(Actor actor) {
        return Value.of(target).viewedBy(actor).asString();
    }
}
