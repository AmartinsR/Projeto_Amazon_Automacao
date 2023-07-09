package Steps;



import Drivers.Drivers;
import Elementos.Elementos;
import Executar.Executar;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends Drivers{
	
	Metodos metodos = new Metodos();

	Elementos el = new Elementos();
	

	@Given("digite o produto que desejo")
	public void digiteOProdutoQueDesejo() throws InterruptedException {
		Executar.abrirNavegador();
		metodos.escrever(el.pesquisa, "Perfume Feminino Dior");
		
		
			    
		
	}
	@When("clico na lupa para pesquisar")
	public void clicoNaLupaParaPesquisar() {
		metodos.clicar(el.lupa);
		
	}

	@When("clico no produto desejado")
	public void clicoNoProdutoDesejado() {
	    metodos.clicar(el.produtoDesejado);
	}

	@Then("clico em comprar")
	public void clicoEmComprar() {
		metodos.clicar(el.adicionarAoCarrinho);
	   
		
	}
	@Then("clico no carrinho de compras e em finalizar compra")
	public void clicoNoCarrinhoDeComprasEEmFinalizarCompra() {
	    metodos.clicar(el.irParaCarrinho);
	    metodos.clicar(el.fecharPedido);
	}
	@Then("preecho os dados e forma de pagamento")
	public void preechoOsDadosEFormaDePagamento() throws InterruptedException {
		metodos.escrever(el.email, "amandamartinssantos0@gmail.com");
		metodos.clicar(el.continuar);
		metodos.escrever(el.password, "Amanda97*");
		metodos.clicar(el.btnFazerLogin);
		metodos.clicar(el.boleto);
		metodos.clicar(el.gerar);
		driver.wait(200);
		metodos.clicar(el.finalizarPedido);
	    
	}


}
