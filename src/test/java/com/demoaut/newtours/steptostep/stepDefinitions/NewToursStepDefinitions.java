package com.demoaut.newtours.steptostep.stepDefinitions;

/**
 * 
 * @author Juan Esteban Lopez Giraldo
 *
 */
import org.openqa.selenium.WebDriver;

import com.demoaut.newtours.steptostep.questions.IsVisibleReservationPage;
import com.demoaut.newtours.steptostep.tasks.OpenTheBrowser;
import com.demoaut.newtours.steptostep.tasks.fillLoginPage;
import com.demoaut.newtours.steptostep.userinterfaces.NewToursPage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.List;

import com.demoaut.newtours.steptostep.models.LogginNewToursModel;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class NewToursStepDefinitions {

	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	
	//Se instancia el actor.
	private Actor Esteban = Actor.named("Esteban");
	
	//Variable privada de tipo NewToursPage
	private NewToursPage newToursPage;
	
	LogginNewToursModel logginNewToursModel;
	
	//Lo primero que se ejecuta al correr el test
	@Before
	public void setUp() 
	{
		//En screenplay no se hace uso del driver directamente, sino del actor
		//por ello, el actor debe referenciar al driver
		Esteban.can(BrowseTheWeb.with(hisBrowser));		
	}

	//Se abre el navegador en la pagina de newTours.
	@Given("^that Esteban is in the loggin page of New Tours$")
	public void iAmInTheLogginPageOfNewTours()  {
	    Esteban.wasAbleTo(OpenTheBrowser.on(newToursPage));
	    
	}
	
	//Hace loggin con usuario y contrasena
	@When("^Esteban entry with a user and password$")
	public void iEntryWithUserMancoHotmailComAndPasswordSophos(List<LogginNewToursModel> Loggeo){
	    Esteban.attemptsTo(fillLoginPage.doLoggin(Loggeo.get(0)));		
	}

	//se valida que este en la pagina de reserva.
	@Then("^Esteban will be in the welcome page$")
	public void iWillBeInTheWelcomePage() throws AssertionError{
	    Esteban.should(seeThat(IsVisibleReservationPage.page()));	    
	}

}
