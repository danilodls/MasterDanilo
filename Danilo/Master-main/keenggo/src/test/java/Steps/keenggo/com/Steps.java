package Steps.keenggo.com;

import java.io.IOException;

import Elementos.keeggo.com.Elementos;
import Metodos.keeggo.com.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	Pages metodos = new Pages();
	Elementos elementos = new Elementos();

	@When("Preencher campo de Cadastro")
	public void preencherCadastro() throws IOException, InterruptedException {
		metodos.pauser(5000, "pausa");
		metodos.clicar(elementos.getBtnUser(), "botão usuario");
		metodos.pauser(3000, "pausa");
		metodos.clicar(elementos.getBtnCreate(), "creat");
		metodos.pauser(8000, "pausa");
		metodos.escrever(elementos.getNomeusuario(), "Danilo", " nome");
		metodos.escrever(elementos.getCampoEmail(), "danilodls@hotmail.com", " Email");
		metodos.escrever(elementos.getSenha(), "Sirley123", "senha");
		metodos.escrever(elementos.getConfirmarsenha(), "Sirley123", "senha");
		metodos.escrever(elementos.getPrimeiroNome(), "Danilo", "nome");
		metodos.escrever(elementos.getUltimoNome(), "lourenço", " nome");
		metodos.escrever(elementos.getTelefone(), "99999999999", "telefone");
		metodos.selecionarComboPosicao(elementos.getPais(), 157, "Pais");
		metodos.escrever(elementos.getCidade(), "Punta cana", " Cidade");
		metodos.escrever(elementos.getEndereco(), "republica dominicana", " rua");
		metodos.escrever(elementos.getEstado(), "são paulo", " Estado");
		metodos.escrever(elementos.getCep(), "88888888", "Cep");
		metodos.clicar(elementos.getCheckBox(), "CHeckbox");
		
	}

	@Given("navegar ate o site {string}")
	public void abriSite(String site) throws IOException {
		metodos.executarNavegador(site, "CHROME", "NAVEGADOR");

	}

	@Then("Cadastro sera realizado com sucesso")
	public void cadastroEfetivado() throws IOException, InterruptedException {
		metodos.pauser(5000, "Pausa");
		metodos.clicar(elementos.getBtnRegistrar(), "Registrar");		
	}

	@When("Preencher informacoes de Login")
	public void fazerLogin() throws IOException, InterruptedException {
		metodos.pauser(6000, "Pausa");
		metodos.clicar(elementos.getHome(), "HOME");
		metodos.pauser(3000, "Pausa");
		metodos.clicar(elementos.getBtnUser(), " ");
		metodos.escrever(elementos.getUsuario(), "Danilo", "usuario");
		metodos.pauser(3000, "Pausa");
		metodos.escrever(elementos.getSenhaLogin(), "Sirley123", "Senha");
		metodos.clicar(elementos.getCheckboxLembrarnovamente(), "checkbox");
		metodos.pauser(7000, "Pausa");
		metodos.clicar(elementos.getBtnlogar(), "login");
	}

	@Then("Login sera realizado com sucesso")
	public void validarLogin() throws IOException, InterruptedException {
		metodos.pauser(2000, "Pausa");
		metodos.validarTexto(elementos.getValidarNome(), "Danilo", "validando");
		String Evidencia = "Login";
		metodos.screnShoot("./Evidencia/" + Evidencia + ".png");
		metodos.fecharBrowser("navegador");
	}
}
