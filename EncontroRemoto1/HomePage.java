package br.senai.sp.automacaoteste;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
		
		//Salva o caminho do Input de busca em uma variável
		WebElement input = driver.findElement(By.id("Busca1_txtFiltro"));
		
		//Digita gestão no campo de Input
		input.sendKeys("gestão");
		
		//2 diferentes formas de dar início á busca no site
		//input.sendKeys(Keys.ENTER);
		driver.findElement(By.id("Busca1_btnBusca")).click();
		
		//Considerando que o teste de busca retorna uma página dizendo "Bad request" o teste retorna á página inicial do site.
		driver.navigate().back();
		
		//Teste clica no link "Fale Conosco" na Lateral Esquerda do site, para reportar o erro no site á equipe do site.
		driver.findElement(By.xpath("//*[@id=\"nav\"]/li[8]/a")).click();
		
		//Lista as abas da página de navegação:
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		
		//Muda a navegação para a nova aba aberta: "Fale Conosco"
		driver.switchTo().window(tabs.get(1));
		
		// Realiza o preenchimento do Formulário da pagina Fale Conosco na nova aba:
		//Seleciona o Assunto no input dropdown:
		Select assunto = new Select(driver.findElement(By.id("ctl00_cp_dropAssuntoPf")));
		assunto.selectByVisibleText("Curso Superior de Tecnologia");
		// Preenche Nome:
		driver.findElement(By.id("ctl00_cp_txtFsNome"));
		driver.findElement(By.id("ctl00_cp_txtFsNome")).sendKeys("Joelma Regina Silva");
		//Preenche campo de CPF (CPF Fake)
		driver.findElement(By.id("ctl00_cp_txtFSCPF"));
		driver.findElement(By.id("ctl00_cp_txtFSCPF")).sendKeys("19894423230");
		//Preenche campo de Email
		driver.findElement(By.id("ctl00_cp_txtFSEmail"));
		driver.findElement(By.id("ctl00_cp_txtFSEmail")).sendKeys("joelma@email.com");
		// Preenche campo de DDD
		driver.findElement(By.id("ctl00_cp_txtFSDDDCel"));
		driver.findElement(By.id("ctl00_cp_txtFSDDDCel")).sendKeys("71");
		//Preenche campo de CEP	
		driver.findElement(By.id("ctl00_cp_txtFsCEP"));
		driver.findElement(By.id("ctl00_cp_txtFsCEP")).sendKeys("31535170");
		//Preenche campo de Endereço		
		driver.findElement(By.id("ctl00_cp_txtFsEndereco"));
		driver.findElement(By.id("ctl00_cp_txtFsEndereco")).sendKeys("Rua Brasil");
		//Preenche campo de Número
		driver.findElement(By.id("ctl00_cp_txtFsNumero"));
		driver.findElement(By.id("ctl00_cp_txtFsNumero")).sendKeys("0");
		//Preenche campo de Bairro
		driver.findElement(By.id("ctl00_cp_txtFsBairro"));
		driver.findElement(By.id("ctl00_cp_txtFsBairro")).sendKeys("América");
		//Preenche campo de Cidade
		driver.findElement(By.id("ctl00_cp_txtFSCidade"));
		driver.findElement(By.id("ctl00_cp_txtFSCidade")).sendKeys("Belo Horizonte");
		//Preenche campo de Mensagem
		driver.findElement(By.id("ctl00_cp_txtFsMensagem"));
		driver.findElement(By.id("ctl00_cp_txtFsMensagem")).sendKeys("Teste de mensagem");
		
		}

	
	//@After
	//public void FecharNavegador() {
		//driver.close();
	//}
}
