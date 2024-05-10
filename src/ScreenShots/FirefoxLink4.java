package ScreenShots;

import java.io.File;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class FirefoxLink4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.getcalley.com/best-auto-dialer-app/");
        Thread.sleep(4000); 
        Dimension cap = new Dimension(1920,1080);
        driver.manage().window().setSize(cap);
        Thread.sleep(4000); 
        File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(file, new File("C:\\Users\\LENOVO\\eclipse-workspace\\Dealsdray\\Firefox\\09-6.png"));
        Thread.sleep(4000); 
        Dimension cap1 = new Dimension(1536,864);
        driver.manage().window().setSize(cap1);
        Thread.sleep(4000); 
        File file1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(file1, new File("C:\\Users\\LENOVO\\eclipse-workspace\\Dealsdray\\Firefox\\09-6_10.png"));
        Thread.sleep(4000); 
        Dimension cap2 = new Dimension(1366,768);
        driver.manage().window().setSize(cap2);
        Thread.sleep(4000); 
        File file2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(file2, new File("C:\\Users\\LENOVO\\eclipse-workspace\\Dealsdray\\Firefox\\09-6_20.png"));
        Thread.sleep(4000); 
        Dimension cap3 = new Dimension(360,640);
        driver.manage().window().setSize(cap3);
        Thread.sleep(4000); 
        File file3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(file3, new File("C:\\Users\\LENOVO\\eclipse-workspace\\Dealsdray\\Firefox\\09-6_30.png"));
        Thread.sleep(4000); 
        Dimension cap4 = new Dimension(414,896); 
        driver.manage().window().setSize(cap4);
        Thread.sleep(4000); 
        File file4=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(file4, new File("C:\\Users\\LENOVO\\eclipse-workspace\\Dealsdray\\Firefox\\09-6_40.png"));
        Thread.sleep(4000); 
        Dimension cap5 = new Dimension(375,667);
        driver.manage().window().setSize(cap5);
        Thread.sleep(4000); 
        File file5=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(file5, new File("C:\\Users\\LENOVO\\eclipse-workspace\\Dealsdray\\Firefox\\09-6_50.png"));
        driver.quit();

	}

}
