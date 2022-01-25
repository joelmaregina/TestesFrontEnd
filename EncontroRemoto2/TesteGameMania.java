package br.senai.sp.testepagina;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteGameMania {
	
	private WebDriver driver;
	
		@Before
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\joelm\\Desktop\\Programas\\chromedriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
	}
		
	@Test
	public void TestarFormLogin () {
		driver.get(" http://localhost:4200/");
		
		driver.findElement(By.id("loginpage")).click();
		
		driver.findElement(By.id("email")).sendKeys("ciaran@email.com");
		driver.findElement(By.id("password")).sendKeys("minhasenha");
		
		driver.findElement(By.id("sendlogin")).sendKeys(Keys.ENTER);
		
	
		WebElement mensagem = driver.findElement(By.id("mensagem")); 
		WebElement mensagemdadosinvalidos = driver.findElement(By.id("mensagemdadosinvalidos")); 
			
		System.out.println(mensagem.getText());
		System.out.println(mensagemdadosinvalidos.getText());

	}
	


}
