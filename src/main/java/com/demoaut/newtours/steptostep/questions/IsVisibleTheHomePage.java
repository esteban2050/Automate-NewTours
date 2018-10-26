package com.demoaut.newtours.steptostep.questions;

import java.util.List;
import com.demoaut.newtours.steptostep.userinterfaces.LogginNewToursComponent;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class IsVisibleTheHomePage implements Question<List<String>> {

	@Override
	public List<String> answeredBy(Actor actor) {
		return Text.of(LogginNewToursComponent.NEWTOURS_LOGIN_TITLE).viewedBy(actor).asList();
	}

	public static Question<List<String>> isVisible(){
		return new IsVisibleTheHomePage();
	}
}
