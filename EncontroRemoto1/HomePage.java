package br.senai.sp.automacaoteste;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	private WebDriver driver;
	
	@Before
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\joelm\\Desktop\\Programas\\chromedriver\\chromedriver.exe");	
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void testeNavegarparaOSenai () {
		
		driver.get("https://online.sp.senai.br/");
		
		//Salva o caminho do Input de busca em uma vari�vel
		WebElement input = driver.findElement(By.id("Busca1_txtFiltro"));
		
		//Digita gest�o no campo de Input
		input.sendKeys("gest�o");
		
		//2 diferentes formas de dar in�cio � busca no site
		//input.sendKeys(Keys.ENTER);
		driver.findElement(By.id("Busca1_btnBusca")).click();
		
		//Considerando que o teste de busca retorna uma p�gina dizendo "Bad request" o teste retorna � p�gina inicial do site.
		driver.navigate().back();
		
		//Teste clica no link "Fale Conosco" na Lateral Esquerda do site, para reportar o erro no site � equipe do site.
		driver.findElement(By.xpath("//*[@id=\"nav\"]/li[8]/a")).click();
	
	}
	
	//@After
	//public void FecharNavegador() {
		//driver.close();
	//}
}
