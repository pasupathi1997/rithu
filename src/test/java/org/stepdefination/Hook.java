package org.stepdefination;
import java.util.concurrent.TimeUnit;
import org.baseclass.Demo;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Hook extends Demo {
		@Before("smoke")
	public void beforesmoke() {
System.out.println("execute only before smoke test");
	}
	@Before
	public void bef() {
		System.out.println("Scenario before");
		openchrome();
		stay(10);
	}
	@After("smoke")
	public void aftersmoke() {
System.out.println("execute only after smoke test");
	}
@After
public void aft(Scenario s) {
	// take screen shot
	if (s.isFailed()) {
		
	
	TakesScreenshot t = (TakesScreenshot)driver;
	byte[] screen = t.getScreenshotAs(OutputType.BYTES);
	s.embed(screen, "image/png");
	}
	System.out.println("Scenario after");

}
}
