package com.demoaut.newtours.steptostep.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.demoaut.newtours.steptostep.exeptions.NoInternetConection;
import com.demoaut.newtours.steptostep.questions.IsVisibleTheHomePage;
import static org.hamcrest.CoreMatchers.hasItem;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheBrowser implements Task{
		
	//Variable privada tipo PageObject
	private PageObject page;
	
	//Constructor
	public OpenTheBrowser(PageObject page) {
	this.page = page;	
	}
	
	@Override
	@Step("{0} opens the browser on NewTours Page")
	public <T extends Actor> void performAs(T actor) 
	{
		//En estos metodos se abre la pagina de store.demoQA y se valida que cargue
		actor.attemptsTo(Open.browserOn(page));
		actor.should(seeThat(IsVisibleTheHomePage.isVisible(), hasItem("User Name:")).orComplainWith(NoInternetConection.class, 
				 getNoInternetConectionMessage()));
	}	

	//Metodo que retorna el mensaje de no internet.
	public String getNoInternetConectionMessage() {
		return String.format(NoInternetConection.NO_INTERNET_CONECTION_MESSAGE);
	}

	public static OpenTheBrowser on(PageObject page) {
		//No se retorna de forma comun "new OpenTheBrowser()", se hace con el 
		//metodo de la libreria tasks, que recibe dos parametros
		//1. la clase de la que se va hacer la instancia, en este caso, la misma clase OpenTheBrowser
		//2. los parametros que vengan del constructor pero como es un constructor vacio, entonces se puede eliminar los parametros
		//debido a que no hay nada
		return instrumented(OpenTheBrowser.class, page);
	}

}
