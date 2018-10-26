package com.demoaut.newtours.steptostep.questions;

/**
 * 
 * @author Juan Esteban Lopez Giraldo b
 *
 */
import com.demoaut.newtours.steptostep.userinterfaces.FlightFinderPageNewTours;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class IsVisibleReservationPage implements Question<Boolean> {
	
	//Este metodo me retorna un booleano que me indica si un elemento es visible o no despues de hacer el loggin.
	@Override
	public Boolean answeredBy(Actor actor) {
		return the(FlightFinderPageNewTours.PASSANGERS_COUNT).answeredBy(actor).isCurrentlyVisible();
	}

	public static IsVisibleReservationPage page() {
		return new IsVisibleReservationPage();
	}	
}
