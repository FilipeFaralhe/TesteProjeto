package src.maps;

import org.openqa.selenium.By;

public class LoginMap {
	/* Armazena na variáveis os XPath da tela Login*/
	public By linkCriarConta = new By.ByXPath("//a[@href='/signup']");
	public By inputEmail =  new By.ByXPath("//input[@placeholder='E-mail']");
	public By inputSenha =  new By.ByXPath("//input[@placeholder='Senha']");
	public By btnEntrar = new By.ByXPath("//button[@name='submit']");
}
