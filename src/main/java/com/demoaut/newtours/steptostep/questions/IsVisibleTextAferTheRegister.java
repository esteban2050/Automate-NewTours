package com.demoaut.newtours.steptostep.questions;

import com.demoaut.newtours.steptostep.userinterfaces.RegisterNewToursComponents;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class IsVisibleTextAferTheRegister implements Question<Boolean> {
	
	@Override
	public Boolean answeredBy(Actor actor) {
		return the(RegisterNewToursComponents.SIGN_OFF_BUTTON).answeredBy(actor).isCurrentlyVisible();
	}

	public static IsVisibleTextAferTheRegister isVisibleButton() {
		return new IsVisibleTextAferTheRegister();
	}	

}
