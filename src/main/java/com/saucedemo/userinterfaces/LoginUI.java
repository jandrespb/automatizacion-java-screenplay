package com.saucedemo.userinterfaces;


import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;
public class LoginUI {

    public static final Target TXT_USERNAME = Target.the("field text that user can write username")
            .located(By.id("user-name"));
    public static final Target TXT_PASSWORD = Target.the("field text that user can write password")
            .located(By.id("password"));
    public static final Target BTN_LOGIN = Target.the("Button that let validate credential")
            .located(By.id("login-button"));
}
