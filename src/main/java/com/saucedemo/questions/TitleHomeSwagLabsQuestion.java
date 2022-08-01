package com.saucedemo.questions;

import com.saucedemo.userinterfaces.SwagLabsHomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TitleHomeSwagLabsQuestion implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return SwagLabsHomeUI.LBL_TITLE.resolveFor(actor).getText();
    }

    public static Question<String> valueTitleHome(){
        return new TitleHomeSwagLabsQuestion();
    }
}
