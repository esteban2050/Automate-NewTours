package com.demoaut.newtours.steptostep.tasks;

/**
 * 
 * @author Juan Esteban Lopez Giraldo b
 *
 */
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import net.thucydides.core.annotations.Step;
import com.demoaut.newtours.steptostep.userinterfaces.RegisterNewToursComponents;

//Clase que implementa tareas
public class OpenRegisterPage implements Task {
	
	@Override
	@Step("{0} opens the register page on NewTours Page")
	public <T extends Actor> void performAs(T actor) 
	{	
		//En este metodo hago clic en el link register para abrir la pagina de register.
		actor.attemptsTo(Click.on(RegisterNewToursComponents.REGISTER_BUTTON));
	}
	
	public static OpenRegisterPage on() {
		
		return instrumented(OpenRegisterPage.class);
	}
}
