package src.maps;

import org.openqa.selenium.By;


public class CadastroMap {
	/* Armazena na variáveis os XPath da tela Cadastro*/
	public By inputNome =  new By.ByXPath("//input[@placeholder='Nome']");
	public By inputEmail =  new By.ByXPath("//input[@placeholder='E-mail']");
	public By inputTelefone =  new By.ByXPath("//input[@placeholder='Telefone']");
	public By inputEndereco =  new By.ByXPath("//input[@placeholder='Endereço']");
	public By inputSenha =  new By.ByXPath("//input[@placeholder='Senha']");
	public By btnCadastrar = new By.ByXPath("//button[@name='submit']");
}
