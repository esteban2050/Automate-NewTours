package com.demoaut.newtours.steptostep.stepDefinitions;

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
	
	private Actor Esteban = Actor.named("Esteban");
	
	private NewToursPage newToursPage;
	
	LogginNewToursModel logginNewToursModel;
	
	@Before
	public void setUp() 
	{
		//En screenplay no se hace uso del driver directamente, sino del actor
		//por ello, el actor debe referenciar al driver
		Esteban.can(BrowseTheWeb.with(hisBrowser));		
	}

	//Esteban.wasAbleTo("");//Como es pasado por el was, se usan los metodos given
	//Esteban.attemptsTo(tasks); //intenta; por lo tanto son en presente, metodos when
	
	@Given("^that Esteban is in the loggin page of New Tours$")
	public void iAmInTheLogginPageOfNewTours()  {
	    //Precondiciones:Estar en New Tours
		//OpenTheBrowser open = new OpenTheBrowser();
		//se crea una instancia de la clase debido a que el metodo wasAbleTo
		//recibe objetos y no clase.
		//Se manda el metodo estatico de esa clase que es el que instancia el objeto
		Esteban.wasAbleTo(OpenTheBrowser.on(newToursPage));
	    
	}
	
	@When("^Esteban entry with a user and password$")
	public void iEntryWithUserMancoHotmailComAndPasswordSophos(List<LogginNewToursModel> Loggeo){
	    // Condiciones:Loggearse en la pagina 
		Esteban.attemptsTo(fillLoginPage.doLoggin(Loggeo.get(0)));		
	}

	@Then("^Esteban will be in the welcome page$")
	public void iWillBeInTheWelcomePage() throws AssertionError{
	    // Consecuencias:Aparecera la pagina de reserva 
	    Esteban.should(seeThat(IsVisibleReservationPage.page()));	    
	}

}
