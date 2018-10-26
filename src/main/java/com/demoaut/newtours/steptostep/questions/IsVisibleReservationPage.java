package com.demoaut.newtours.steptostep.questions;

import com.demoaut.newtours.steptostep.userinterfaces.FlightFinderPageNewTours;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class IsVisibleReservationPage implements Question<Boolean> {
	
	@Override
	public Boolean answeredBy(Actor actor) {
		return the(FlightFinderPageNewTours.PASSANGERS_COUNT).answeredBy(actor).isCurrentlyVisible();
	}

	public static IsVisibleReservationPage page() {
		return new IsVisibleReservationPage();
	}	
}
