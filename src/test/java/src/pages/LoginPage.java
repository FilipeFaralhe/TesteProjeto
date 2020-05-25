package src.pages;

import org.openqa.selenium.WebDriver;

import src.constants.Constants;
import src.maps.LoginMap;

/* Faz heran�a com a class BasePage*/
public class LoginPage extends BasePage{
	LoginMap LoginMap;
	public LoginPage(WebDriver driver) {
		super(driver);
		LoginMap = new LoginMap();
		
	}
	/*Respons�vel por realizar as a��es e inser��es da tela Login*/
	public void realizaLogin() throws Exception {
		aguardaElement(LoginMap.btnEntrar);
		preenche(LoginMap.inputEmail, Constants.EMAIL);
		preenche(LoginMap.inputSenha, Constants.SENHA);
		click(LoginMap.btnEntrar);
	}
	
	/*Clica no button CriarConta para acessar a tela de cadastro*/
	public void CriaConta() throws Exception {
		aguardaElement(LoginMap.linkCriarConta);
		click(LoginMap.linkCriarConta);
	}

}
