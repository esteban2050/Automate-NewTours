package com.demoaut.newtours.steptostep.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import net.thucydides.core.annotations.Step;
import com.demoaut.newtours.steptostep.userinterfaces.RegisterNewToursComponents;

public class OpenRegisterPage implements Task {
	
	@Override
	@Step("{0} opens the register page on NewTours Page")
	public <T extends Actor> void performAs(T actor) 
	{
		actor.attemptsTo(Click.on(RegisterNewToursComponents.REGISTER_BUTTON));
		//Open, click, Hit
	}
	
	public static OpenRegisterPage on() {
		
		return instrumented(OpenRegisterPage.class);
	}
}
