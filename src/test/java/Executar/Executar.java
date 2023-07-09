package Executar;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Drivers.Drivers;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;


@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/features",
		// packege que serão implementados steps
		glue = "Steps",
		// tags que serão executadas
		tags = "@test",
		// retira os caracteres especiais
		monochrome = true,
		// utilizado para planejar os gerkins, falso não executa o teste, apenas valida
		dryRun = false, // QUANDO FOR PEGAR OS STEPS true//QUANDO FOR EXECUTAR false
		// deixa o console o junito com a mesma aparencia cucumber, gera os reports
		plugin = {"pretty", "html:target/report-cucumber.html" },
		// troca o _ para padrão Java
		snippets = SnippetType.CAMELCASE// UTILIZAMOS O DO CUCUMBER OPTIONS

)

public class Executar extends Drivers{
	
	public static void abrirNavegador() {

		WebDriverManager.chromedriver().setup();// classe da bliblioteca
		ChromeOptions chromeOptions = new ChromeOptions();// classe do selenium
		chromeOptions.addArguments("--start-maximized");// aqui escolhemos se queremos ou não abrir o navegador
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.amazon.com.br/");// aqui abrimos o navegador

	}

}
