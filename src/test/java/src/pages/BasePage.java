package src.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import src.constants.Constants;

public class BasePage {
	WebDriver driver;
	WebDriverWait wait;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Constants.TEMPO_ESPERA_MAXIMO);
	}
	
	/* Confirma se o elemento está presente no teste, se estiver retorna true, senão estiver retorna false*/
	public boolean isPresent(By elemento) {
		wait = new WebDriverWait(driver, Constants.TEMPO_ESPERA_MINIMA);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/*Aguarda o elemento aparecer, se o elemento não aparecer, retorna a mensagem "Elemento não carregado"*/
	public void aguardaElement(By elemento) throws Exception {
		wait = new WebDriverWait(driver, Constants.TEMPO_ESPERA_MAXIMO);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
		} catch (Exception e) {
			throw new Exception("Elemento não carregado");
		}
	}
	
	/*Aguarda o elemento clicável aparecer, se caso não aparecer retorna uma mensagem "Não conseguiu clicar " */
	public void click(By elemento) throws Exception {
		try {
			aguardaElement(elemento);
			driver.findElement(elemento).click();
		}catch(Exception e) {
			throw new Exception("Não conseguiu clicar");
		}
	}
	
	/* Aguarda o elemento aparecer e em seguida preenche o campo, se não encontrar o elemento retorna uma mensagem "Não conseguiu preencher o texto [texto digitado]"*/
	public void preenche(By elemento, String texto) throws Exception {
		try {
			aguardaElement(elemento);
			driver.findElement(elemento).sendKeys(texto);
		}catch(Exception e) {
			throw new Exception("Não conseguiu preencher texto :"+texto);
		}
	}
}


