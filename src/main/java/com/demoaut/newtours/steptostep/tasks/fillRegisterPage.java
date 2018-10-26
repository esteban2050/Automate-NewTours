package com.demoaut.newtours.steptostep.tasks;

/**
 * 
 * @author Juan Esteban Lopez Giraldo b
 *
 */
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.demoaut.newtours.steptostep.models.RegisterNewToursModel;
import com.demoaut.newtours.steptostep.userinterfaces.RegisterNewToursComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;

//Clase que implementa tareas
public class fillRegisterPage implements Task{
	
	//Variable privada tipo RegisterNewToursModel
	private RegisterNewToursModel registerNewToursModel;
	
	//Constructor.
	public fillRegisterPage(RegisterNewToursModel registerNewToursModel) {
		this.registerNewToursModel= registerNewToursModel;
	}
	
	@Override
	@Step("{0} fill the register NewTours Page")	
	public <T extends Actor> void performAs(T actor) 
	{		
		//En estas interacciones, se inresan los valores en la pagina de registro y se da clic en el boton submit para registrarse.
		actor.attemptsTo(
		Enter.theValue(registerNewToursModel.getFirtsName()).into(RegisterNewToursComponents.FIRSTNAME),
		Enter.theValue(registerNewToursModel.getLastName()).into(RegisterNewToursComponents.LASTNAME),
		Enter.theValue(registerNewToursModel.getPhone()).into(RegisterNewToursComponents.PHONE),
		Enter.theValue(registerNewToursModel.getEmail()).into(RegisterNewToursComponents.EMAIL),
		Enter.theValue(registerNewToursModel.getAdress()).into(RegisterNewToursComponents.ADDRESS),
		Enter.theValue(registerNewToursModel.getCity()).into(RegisterNewToursComponents.CITY),
		Enter.theValue(registerNewToursModel.getState()).into(RegisterNewToursComponents.STATE),
		Enter.theValue(registerNewToursModel.getPostalCode()).into(RegisterNewToursComponents.POSTALCODE),
		SelectFromOptions.byVisibleText(registerNewToursModel.getCountry().toUpperCase()).from(RegisterNewToursComponents.COUNTRY),
		Enter.theValue(registerNewToursModel.getUserName()).into(RegisterNewToursComponents.USERNAME),
		Enter.theValue(registerNewToursModel.getPassword()).into(RegisterNewToursComponents.PASSWORD),
		Enter.theValue(registerNewToursModel.getConfirmPassword()).into(RegisterNewToursComponents.CONFIRM_PASSWORD),
		Click.on(RegisterNewToursComponents.SUBMIT_BUTTON));
	}
	
	public static Performable doRegister(RegisterNewToursModel registerNewToursModel) 
	{
		return instrumented(fillRegisterPage.class,registerNewToursModel);
	}

}
