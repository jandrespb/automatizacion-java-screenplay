package com.saucedemo.tasks;

import com.saucedemo.models.LoginModels;
import com.saucedemo.userinterfaces.LoginUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginSwagLabs implements Task {

    private LoginModels users;

    // constructor
    public LoginSwagLabs(LoginModels users) {
        this.users = users;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(users.getUsername()).into(LoginUI.TXT_USERNAME),
                Enter.theValue(users.getPassword()).into(LoginUI.TXT_PASSWORD)
        );

        try {
            Thread.sleep(2000);
            actor.attemptsTo(
                    Click.on(LoginUI.BTN_LOGIN)
            );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static LoginSwagLabs addCredentialsLogin(LoginModels credentials){
        return Instrumented.instanceOf(LoginSwagLabs.class).withProperties(credentials);
    }
}
