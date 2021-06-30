package com.sqamexico.ejemplo;

//import java.util.logging.Logger;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class main {

	public static void main(String[] args) throws InterruptedException {

		/*ejecucion en mac */
		//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		//WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
        driver.get("https://www.google.com/?hl=es_419");

        WebElement nombre = driver.findElement(By.xpath("//div[@class='a4bIc']/input"));
		nombre.sendKeys("Polombia");
        nombre.sendKeys(Keys.ENTER);
		WebElement resultado = driver.findElement(By.xpath("//div[@id='extabar']"));
		resultado.getText();
		Assert.assertThat(resultado.getText(), CoreMatchers.containsString("Cerca"));

       // Thread.sleep(10000);

       driver.close();

	}

}
