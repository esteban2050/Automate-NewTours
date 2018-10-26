package com.demoaut.newtours.steptostep.stepDefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.List;


import org.openqa.selenium.WebDriver;

import com.demoaut.newtours.steptostep.models.RegisterNewToursModel;
import com.demoaut.newtours.steptostep.questions.IsVisibleTextAferTheRegister;
import com.demoaut.newtours.steptostep.tasks.OpenRegisterPage;
import com.demoaut.newtours.steptostep.tasks.OpenTheBrowser;
import com.demoaut.newtours.steptostep.tasks.fillRegisterPage;
import com.demoaut.newtours.steptostep.userinterfaces.NewToursPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class NewToursRegisterStepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	
	private Actor Esteban = Actor.named("Esteban");
	
	private NewToursPage newToursPage;
	
	@Before
	public void setUp() 
	{
		//El actor referencia al driver
		Esteban.can(BrowseTheWeb.with(hisBrowser));
		
	}
	@Given("^that esteban is in the register page$")
	public void thatEstebanIsInTheRegisterPage() {
	    //Se abre el navegador en la pagina de new tours
		Esteban.wasAbleTo(OpenTheBrowser.on(newToursPage),OpenRegisterPage.on());
	}


	@When("^esteban does the register$")
	public void estebanDoesTheRegister(List<RegisterNewToursModel> Information) {
		Esteban.attemptsTo(fillRegisterPage.doRegister(Information.get(0)));
			
	}

	@Then("^esteban will be in the successful page$")
	public void estebanWillBeInTheSuccessfulPage() {
		Esteban.should(seeThat(IsVisibleTextAferTheRegister.isVisibleButton())); 
	}

}
