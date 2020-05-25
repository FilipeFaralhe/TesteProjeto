package src.pages;

import org.openqa.selenium.WebDriver;

import src.constants.Constants;
import src.maps.CadastroMap;

/* Faz herança com a class BasePage*/
public class CadastroPage extends BasePage{
	CadastroMap CadastroMap;
	public CadastroPage(WebDriver driver) {
		super(driver);
		CadastroMap = new CadastroMap();
	}
	
	/*Responsável por realizar as ações e inserções da tela cadastro*/
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
