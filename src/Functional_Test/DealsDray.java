package Functional_Test;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class DealsDray {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("https://demo.dealsdray.com/");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("prexo.mis@dealsdray.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("prexo.mis@dealsdray.com");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        driver.findElement(By.xpath("(//button[@name=\"child\"])[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@align='right']")).click();
        Thread.sleep(4000);
        WebElement upload=driver.findElement(By.xpath("//input[@aria-invalid='false']"));
        upload.sendKeys("C:\\Users\\LENOVO\\OneDrive\\Desktop\\demo-data.xlsx");
       Thread.sleep(3000);
        driver.findElement(By.xpath("(//button[@type=\"button\"])[7]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();   
        Thread.sleep(4000);
        WebElement Element = driver.findElement(By.xpath("(//button[@type='button'])[9]"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(3000);
        File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(file, new File("C:\\Users\\LENOVO\\eclipse-workspace\\Dealsdray\\Functional_Test_screenshot\\screenshot.png"));
        driver.quit();

	}

}
