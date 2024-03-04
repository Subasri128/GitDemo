import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//chrome browser
		WebDriver driver = new ChromeDriver();
		
		
		//Edge browser
		WebDriver driver1 = new EdgeDriver();
		//(both can be used)System.setProperty("webdriver.chrome.driver", "C:\\Users\\a819538\\OneDrive - Eviden\\Documents\\Selenium\\chromedriver-win64\\chromedriver-win64.exe");
		driver.get("https://integration.multibrand.servicebox-parts.com//login/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();

	}

}
