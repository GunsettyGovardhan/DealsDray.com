package ScreenShots;

import java.io.File;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.io.Files;

public class Chrome_window_1536 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		  WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://www.getcalley.com/");
          Thread.sleep(4000); 
          Dimension cap = new Dimension(1536,864);
          driver.manage().window().setSize(cap);
          Thread.sleep(4000); 
          File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          Files.copy(file, new File("C:\\Users\\LENOVO\\eclipse-workspace\\Dealsdray\\Chrome\\09-10_20.png"));
          
	}

}