package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class opneBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\IT\\Cyber\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
	}

}
