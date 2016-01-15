package mail_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class mailTests {
	    WebDriver driver = new FirefoxDriver();
	   
	    @BeforeClass()
	public void enterInMail()  {
		
		driver.get("https://mail.ru/");
		WebElement element1 = driver.findElement(By.className("mailbox__login"));
		element1.sendKeys("pavel.falkovskiy.1993");
		WebElement element2 = driver.findElement(By.className("mailbox__password"));
		element2.sendKeys("mygrandfather");
		driver.findElement(By.xpath("//input[@id='mailbox__auth__button']")).submit();;
			
		}
		@Test
	public void loginTest() {
			try {
			WebElement element3 = driver.findElement(By.xpath("//*[@id='PH_user-email']"));
			WebElement element4 = driver.findElement(By.className("x-ph__auth_list__item__info__email__text"));
			System.out.println(element3.getText());
			System.out.println(element4.getText());
			WebElement element5 = driver.findElement(By.xpath("//a[@id='PH_logoutLink']"));
			System.out.println(element5.getText());
			element5.click();
					
		}
			catch(Exception e){
			}
		
		}	

}
