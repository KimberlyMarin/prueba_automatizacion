package com.sqamexico.ejemplo;

//import java.util.logging.Logger;
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

		
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true); 
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
		WebDriver driver = new FirefoxDriver(capabilities);

		driver.manage().window().maximize();
        driver.get("https://www.google.com/?hl=es_419");

        WebElement nombre = driver.findElement(By.xpath("//input[@role='combobox']"));
		WebElement resultado = driver.findElement(By.id("result-stats"));

		nombre.sendKeys("Polombia");
        nombre.sendKeys(Keys.ENTER);
		resultado.getText();
		Assert.assertEquals("colombia",resultado.getText());
        /*
        // Manipulando un checkbox
        WebElement checkbox_correr = driver.findElement(By.id("chk_hobbie-3"));
        if (!checkbox_correr.isSelected()) //valido que NO este seleccionado para seleccionarlo
        	checkbox_correr.click();
        
        
        // Doy click en el boton submit
        WebElement boton = driver.findElement(By.id("btnsubmit"));
        boton.click();
        
        
        
        
        // #4 Agrego un punto de verificaci�n, para validar que el registro fue dado de alta
        WebElement confirmacion = driver.findElement(By.id("registrationok"));
        
        if (!confirmacion.getText().contains("Perfecto! el registro fue dado de alta correctamente")){
        	System.out.println("Hubo un error");
        	//log.severe("Hubo un error en el registro");
        	return;
        }
        
        System.out.println("Registro completado!");
       //log.info("Registro completado con �xito!!!");
        
        
        //Duermo el proceso para ver las modificaciones
        Thread.sleep(10000);
        */
        // #5 Cierro el browser
       // driver.close();

	}

}
