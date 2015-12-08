package br.com.devmedia.mvc.domain;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
/**
 * 
 * @author Sinvaldo Junior
 *
 */
public class Leitor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7174180260543631984L;

	@NotNull(message="Campo 'Nome': Preenchimento obrigatorio")
    @Size(min = 1, max = 20, message="Campo 'Nome': deve conter entre 1 e 20 letras")
    @Pattern(regexp = "[a-zA-Z]+" , message="Campo 'Nome': O valor: ${validatedValue} digitado no campo Nome e invalido, informe somente letras.")
	@FormParam("nome")
	private String nome;
	
	@NotNull(message="Campo 'E-mail':  Preenchimento obrigatorio")
	@Pattern(regexp = ".+@.+\\.[a-z]+", message="Campo 'E-mail': O valor:  ${validatedValue} nao e um e-mail valido")
	@FormParam("email")
	private String email;
	
	@Pattern(regexp = "\\(\\d{3}\\)\\d{4}-\\d{4}", message="Campo 'Telefone': O valor:  ${validatedValue} + e invalido para o campo Telefone, preencha seguindo o formato (000) 0000-0000")
	@FormParam("telefone")
    private String telefone;
	
	@NotNull(message="Campo 'Profissao': Preenchimento obrigatorio ")
	@FormParam("profissao")
	private String profissao;
	
	@NotNull(message="Campo 'Categoria': Preenchimento obrigatorio")
	@FormParam("categoriaEscolhida")
	private CategoriaMVC categoriaEscolhida;
	
	@NotNull(message= "Campo 'Justificativa': Preenchimento obrigatorio")
	@Size(min = 5, max = 50, message="Campo 'Justificativa': Deve conter entre 5 e 50 caracteres")
	@FormParam("justificativa")
	private String justificativa;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public CategoriaMVC getCategoriaEscolhida() {
		return categoriaEscolhida;
	}

	public void setCategoriaEscolhida(CategoriaMVC categoriaEscolhida) {
		this.categoriaEscolhida = categoriaEscolhida;
	}

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}
}