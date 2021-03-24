package Elementos.keeggo.com;

import org.openqa.selenium.By;

public class Elementos {

	
	// Elementos para realizar Cadastro
	private By home = By.xpath("/html/body/header/nav/div/a/span[1]");
	private By btnUser = By.id("menuUser");
	private By btnCreate = By.xpath("/html/body/login-modal/div/div/div[3]/a[2]");
	private By Nomeusuario = By.name("usernameRegisterPage");
	private By campoEmail = By.name("emailRegisterPage");
	private By senha = By.name("passwordRegisterPage");
	private By Confirmarsenha = By.name("confirm_passwordRegisterPage");
    private By primeiroNome = By.name("first_nameRegisterPage");
    private By ultimoNome = By.name("last_nameRegisterPage");
    private By telefone = By.name("phone_numberRegisterPage");
    private By pais = By.name("countryListboxRegisterPage");
    private By cidade = By.name("cityRegisterPage");
    private By endereco= By.name("addressRegisterPage");
    private By estado = By.name("state_/_province_/_regionRegisterPage");
    private By cep = By.name("postal_codeRegisterPage");
    private By checkBox = By.name("i_agree");
    private By btnRegistrar = By.id("register_btnundefined");
    
    //Elementos para realizar login e validar
    private By usuario = By.name("username");
    private By senhaLogin = By.name("password");
    private By checkboxLembrarnovamente = By.name("remember_me");
    private By btnlogar = By.id("sign_in_btnundefined");
    private By validarNome = By.xpath("//*[@id=\"menuUserLink\"]/span");
	
    
    
    
    
    
    
    public By getHome() {
		return home;
	}
	public By getBtnUser() {
		return btnUser;
	}
	public By getBtnCreate() {
		return btnCreate;
	}
	public By getNomeusuario() {
		return Nomeusuario;
	}
	public By getCampoEmail() {
		return campoEmail;
	}
	public By getSenha() {
		return senha;
	}
	public By getConfirmarsenha() {
		return Confirmarsenha;
	}
	public By getPrimeiroNome() {
		return primeiroNome;
	}
	public By getUltimoNome() {
		return ultimoNome;
	}
	public By getTelefone() {
		return telefone;
	}
	public By getPais() {
		return pais;
	}
	public By getCidade() {
		return cidade;
	}
	public By getEndereco() {
		return endereco;
	}
	public By getEstado() {
		return estado;
	}
	public By getCep() {
		return cep;
	}
	public By getCheckBox() {
		return checkBox;
	}
	public By getBtnRegistrar() {
		return btnRegistrar;
	}
	public By getUsuario() {
		return usuario;
	}
	public By getSenhaLogin() {
		return senhaLogin;
	}
	public By getCheckboxLembrarnovamente() {
		return checkboxLembrarnovamente;
	}
	public By getBtnlogar() {
		return btnlogar;
	}
	public By getValidarNome() {
		return validarNome;
	}
 
}