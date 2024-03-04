import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdateDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\a819538\\OneDrive - Eviden\\Documents\\Selenium\\chromedriver-win64\\chromedriver-win64.exe");

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// selecting check boxes
		// using * implies Regular Expression
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='Student']")).isSelected());
		// System.out.println(driver.findElement(By.cssSelector("input[id*='Student']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='Student']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='Student']")).isSelected());
		// System.out.println(driver.findElement(By.cssSelector("input[id*='Student']")).isSelected());
		// count of checkbox
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		// updatedropdown

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		driver.findElement(By.id("divpaxinfo")).getText();

		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();

		}
		driver.findElement(By.id("btnclosepaxoption")).getText();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		// Dynamic dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='DXB']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

		// enable disable date field

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("isEnabled");
			Assert.assertTrue(true);
		} else {
			System.out.println("isNotEnabled");
			Assert.assertTrue(false);
		}

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

		// auto suggestion
		/***
		 * driver.findElement(By.id("autosuggest")).sendKeys("ind");
		 * Thread.sleep(4000L);
		 * 
		 * List<WebElement> options =
		 * driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		 * for(WebElement option :options) {
		 * if(option.getText().equalsIgnoreCase("India")); { option.click(); break; } }
		 ***/

	}
}
