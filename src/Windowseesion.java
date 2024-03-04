import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowseesion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//these 2 line is mandatory for all classes
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a819538\\OneDrive - Eviden\\Documents\\Selenium\\chromedriver-win64\\chromedriver-win64.exe");
		
		driver.manage().window().maximize();
		driver.get("https://google.com");
		//until all elements gets loaded browers will wait
		driver.navigate().to("https://www.freshworks.com/company/careers/");
		driver.navigate().back();
		driver.navigate().forward();;
	}

}
