import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a819538\\OneDrive - Eviden\\Documents\\Selenium\\chromedriver-win64\\chromedriver-win64.exe");
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Dropdown
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='DXB']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		driver.findElement(By.cssSelector(".ui-datepicker-week-end.ui-datepicker-today")).click();
		
		
		
		
		
		//auto suggestion
				/**driver.findElement(By.id("autosuggest")).sendKeys("Ind");
				Thread.sleep(3000L);
				
				List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
				for(WebElement option :options)
					{
						if(option.getText().equalsIgnoreCase("India"));
						{
							option.click();
							break;
						}
				}
				**/

	}

}


