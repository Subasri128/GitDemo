import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\a819538\\OneDrive - Eviden\\Documents\\Selenium\\chromedriver-win64\\chromedriver-win64.exe");

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// drowndown is available select tag can be used (static)

		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());

		// another way by visibility
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		// another way
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		/****
		 * SBMB driver.get("https://integration.multibrand.servicebox-parts.com/en/");
		 * WebElement staticDropdown = driver.findElement(By.className("ng-option
		 * ng-star-inserted")); Select dropdown = new Select(staticDropdown);
		 * dropdown.selectByVisibleText("YT");
		 * System.out.println(dropdown.getFirstSelectedOption().getText());
		 ****/

	}

}
