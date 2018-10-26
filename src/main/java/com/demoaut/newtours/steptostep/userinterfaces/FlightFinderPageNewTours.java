package com.demoaut.newtours.steptostep.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FlightFinderPageNewTours  {
	
	public static final Target PASSANGERS_COUNT = Target.the("The passanger count").located(By.name("passCount"));
	
	public static final Target FLIGHTFINDERMENU_TITLE = Target.the("New Tours Flight Finder Menu Title").located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[1]/font/b"));	

}
