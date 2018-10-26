package com.demoaut.newtours.steptostep.userinterfaces;

/**
 * 
 * @author Juan Esteban Lopez Giraldo
 *
 */
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class LogginNewToursComponent {
	
	//Se mapean los target que pertenecen a la pagina de loggin
	public static final Target USERNAME_LOGGIN = Target.the("The Username input").located(By.name("userName"));
	public static final Target PASSWORD_LOGGIN = Target.the("The Password input").located(By.name("password"));
	public static final Target BUTTON_LOGIN = Target.the("The loggin button").located(By.name("login"));
	public static final Target NEWTOURS_LOGIN_TITLE = Target.the("New Tours Login Title").located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/font"));

}
