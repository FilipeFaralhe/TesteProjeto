package src.tests;

import org.junit.Test;
import src.pages.CadastroPage;
import src.pages.LoginPage;

/* Faz heranca com a class BaseTest*/
public class Teste01 extends BaseTest{
	CadastroPage CadastroPage;
	LoginPage LoginPage;
	/* Recebe o ChromeDriver*/
	public Teste01() {
		CadastroPage =  new CadastroPage(driver);
		LoginPage =  new LoginPage(driver);
	}
	/* Responsavel por iniciar o testes */
	
	@Test
	public void script() throws Exception {
		//LoginPage.CriaConta();
		//CadastroPage.realizaCadastro();
		//LoginPage.realizaLogin();
	}
}

