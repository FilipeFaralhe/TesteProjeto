package src.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
	WebDriver driver;
	
	public BaseTest() {
		//Diretorio do chrome driver no Windows
		System.setProperty("webdriver.chrome.driver", System.getProperty( "user.dir" )+"/driver/chromedriver");
		
		//Diretorio do chrome driver no Linux
		//System.setProperty("webdriver.chrome.driver", System.getProperty( "user.dir" )+"\\driver\\chromedriver.exe")
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications"); // disabilita as notifica��es 
		 driver = new ChromeDriver(options);
		
		
	}
	/*Inicio: Maximiza a tela e entra no endere�o*/
	@Before
	public void before() {
		driver.manage().window().maximize();
		driver.get("https://twitter.com/home");
	}
	/*Final de execu��o: .close fecha a aba e .quit fecha o navegador*/
	@After
	public void after() {
		driver.close();
		driver.quit();
	
	}
}
