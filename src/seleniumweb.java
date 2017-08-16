
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class seleniumweb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 /*System.setProperty("webdriver.gecko.driver","C:/Users/rimen/workspace/geckodriver-v0.18.0-win64/geckodriver.exe");
  WebDriver driver  = new FirefoxDriver();*/
  
  /*System.setProperty("webdriver.chrome.driver","C:/Users/rimen/workspace/chromedriver_win32/chromedriver.exe");
  WebDriver driver = new ChromeDriver();*/
		
		System.setProperty("webdriver.ie.driver","C:/Users/rimen/workspace/IEDriverServer_Win32_2.39.0/IEDriverServer.exe");
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability("ignoreZoomSetting", true);
		
        WebDriver driver = new InternetExplorerDriver(caps);
  driver.get("https://secure.futurevault.com/login");
  
  driver.findElement(By.xpath(".//*[@id='inputEmail']")).sendKeys("asrimen79+190@gmail.com");
  driver.findElement(By.xpath(".//*[@id='inputPassword']")).
  
	}

}
