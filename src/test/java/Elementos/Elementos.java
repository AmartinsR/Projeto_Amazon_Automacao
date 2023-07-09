package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	public By pesquisa = By.xpath("//input[@name='field-keywords']");
	public By lupa = By.id("nav-search-submit-button");
	public By produtoDesejado = By.xpath("//img[@alt='Hypnotic Poison Dior - Perfume Feminino - Eau de Toilette 50ml']");
	public By adicionarAoCarrinho = By.id("add-to-cart-button");
	public By irParaCarrinho = By.id("nav-cart-text-container");
	public By fecharPedido = By.name("proceedToRetailCheckout");
	
	public By email = By.id("ap_email");
	public By continuar = By.id("continue");
	public By password = By.id("ap_password");
	public By btnFazerLogin = By.id("signInSubmit");
	public By boleto = By.name("ppw-instrumentRowSelection");
	public By gerar = By.xpath("//input[@aria-labelledby='orderSummaryPrimaryActionBtn-announce']");
	public By finalizarPedido = By.id("submitOrderButtonId");
}
			
			