package Metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;


import Drivers.Drivers;

public class Metodos extends Drivers {

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void validarMensagem(By elemento, String msgEsperada) {

		String msgCapturado = driver.findElement(elemento).getText();
		assertEquals(msgEsperada, msgCapturado);

	}
	
	public void pausa(int tempo) {

		// podemos utilizar o try catch, para não ficar add o Trows toda hora
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	

	

}