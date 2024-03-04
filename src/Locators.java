import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implicit wait - 2 secs time out
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a819538\\OneDrive - Eviden\\Documents\\Selenium\\chromedriver-win64\\chromedriver-win64.exe");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://integration.multibrand.servicebox-parts.com//login/");
		driver.findElement(By.id("userid")).clear();
		driver.findElement(By.id("userid")).sendKeys("DB87047");
		driver.findElement(By.id("storecode")).clear();
		driver.findElement(By.name("storecode")).sendKeys("XTTIAM4");
		driver.findElement(By.className("btn-primary")).click();
		//driver.findElement(By.xpath("//body/psa-root/div/div[@class='sticky ng-star-inserted']/psa-nav-header[@id='nav-header']/div[@class='nav-header']/div[@class='searchbar container']/psa-header-search-vehicle-global[@class='ng-star-inserted']/div[@class='row align-items-stretch headerShrink ng-star-inserted']/section[@class='col-6']/psa-search-vehicle/div[@class='h-100 ng-star-inserted']/div[@id='RFsearchVehicle']/div[1]/div[1]")).sendKeys("DT185RY");
		//System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		//driver.findElement(By.xpath("//div[@class='placeholder immat-input-placeholder no-border desktop-size'")).sendKeys("DT185RY");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.findElement(By.xpath("//button[@popoverclass='popover-call']")).click();

		//driver.findElement(By.xpath("//input[@placeholder='popover-failure-message popover-failure-bottom']")).clear();
		driver.findElement(By.xpath("//div[@id='RFsearchVehicle']")).sendKeys("DT185RY");
		//driver.findElement(By.xpath("//input[@placeholder='search_icon']")).click();
		//driver.findElement(By.xpath("//div[@class='placeholder immat-input-placeholder no-border desktop-size ']")).sendKeys("DT185RY");
		


}
}