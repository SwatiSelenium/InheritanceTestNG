package InheritanceTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenerio4 extends launchandQuit
{
	@Test
	public void testcase4()
	{
		WebElement searchbar = driver.findElement(By.id("twotabsearchtextbox"));
		searchbar.sendKeys("shoes");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}
}
