package com.demoaut.newtours.steptostep.questions;

/**
 * 
 * @author Juan Esteban Lopez Giraldo b
 *
 */
import java.util.List;
import com.demoaut.newtours.steptostep.userinterfaces.LogginNewToursComponent;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class IsVisibleTheHomePage implements Question<List<String>> {

	//Este metodo me retorna un booleano que me indica si un elemento es visible o no despues de cargar la pagina principal.
	@Override
	public List<String> answeredBy(Actor actor) {
		return Text.of(LogginNewToursComponent.NEWTOURS_LOGIN_TITLE).viewedBy(actor).asList();
	}

	public static Question<List<String>> isVisible(){
		return new IsVisibleTheHomePage();
	}
}
