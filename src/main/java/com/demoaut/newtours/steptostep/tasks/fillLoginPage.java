package com.demoaut.newtours.steptostep.tasks;

/**
 * 
 * @author Juan Esteban Lopez Giraldo b
 *
 */
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.demoaut.newtours.steptostep.models.LogginNewToursModel;
import com.demoaut.newtours.steptostep.userinterfaces.LogginNewToursComponent;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import net.thucydides.core.annotations.Step;
//Clase que implementa tareas
public class fillLoginPage implements Task{

	//Variable privada tipo LogginNewToursModel
	private LogginNewToursModel logginNewToursModel;
	
	public fillLoginPage(LogginNewToursModel logginNewToursModel) {
		this.logginNewToursModel= logginNewToursModel;
	}
	@Override
	@Step("{0} fill the username on loggin NewTours Page")
	
	//metodo que lleva las interacciones 
	public <T extends Actor> void performAs(T actor) 
	{		
		//En estas interacciones, se ingresan los valores para hacer loggin en la pagina.
		actor.attemptsTo(
		Enter.theValue(logginNewToursModel.getUsername()).into(LogginNewToursComponent.USERNAME_LOGGIN),
		Enter.theValue(logginNewToursModel.getPassword()).into(LogginNewToursComponent.PASSWORD_LOGGIN),	
		Click.on(LogginNewToursComponent.BUTTON_LOGIN));
	}
	
	public static Performable doLoggin(LogginNewToursModel logginNewToursModel) 
	{
		return instrumented(fillLoginPage.class,logginNewToursModel);
	}
}
