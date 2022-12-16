package com.sophos.academy.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Presence;
import net.serenitybdd.screenplay.targets.Target;


public class VerifyDeleteBtn implements Question<Boolean> {

    private final Target target;

    public VerifyDeleteBtn(Target target) {
        this.target = target;
    }

    public static VerifyDeleteBtn doesNotExist(Target target) {
        return new VerifyDeleteBtn(target);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return !Presence.of(target).viewedBy(actor).asBoolean();
    }
}
