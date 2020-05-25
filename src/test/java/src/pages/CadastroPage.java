package src.pages;

import org.openqa.selenium.WebDriver;

import src.constants.Constants;
import src.maps.CadastroMap;

/* Faz heran�a com a class BasePage*/
public class CadastroPage extends BasePage{
	CadastroMap CadastroMap;
	public CadastroPage(WebDriver driver) {
		super(driver);
		CadastroMap = new CadastroMap();
	}
	
	/*Respons�vel por realizar as a��es e inser��es da tela cadastro*/
	public void realizaCadastro() throws Exception {
		aguardaElement(CadastroMap.btnCadastrar);
		preenche(CadastroMap.inputNome, Constants.NOME);
		preenche(CadastroMap.inputEmail, Constants.EMAIL);
		preenche(CadastroMap.inputTelefone, Constants.TELEFONE);
		preenche(CadastroMap.inputEndereco, Constants.ENDERECO);
		preenche(CadastroMap.inputSenha, Constants.SENHA);
		click(CadastroMap.btnCadastrar);
	}
	
}
