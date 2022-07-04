package com.saucedemo.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPageSwagLabs implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Open.url("https://www.saucedemo.com/")
        );
    }

    public static OpenPageSwagLabs on() {
        return Instrumented.instanceOf(OpenPageSwagLabs.class).withProperties();
    }
}
