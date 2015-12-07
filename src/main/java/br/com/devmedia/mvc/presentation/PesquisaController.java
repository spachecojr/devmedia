package br.com.devmedia.mvc.presentation;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.mvc.annotation.CsrfValid;
import javax.mvc.binding.BindingResult;
import javax.validation.Valid;
import javax.validation.executable.ExecutableType;
import javax.validation.executable.ValidateOnExecution;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import br.com.devmedia.mvc.domain.Leitor;
/**
 * 
 * @author Sinvaldo Junior
 *
 */
@Controller @Path("controller")
public class PesquisaController {

	private static final String PESQUISA_PAGE = "pesquisa.jsp";
	private static final String CONFIRMACAO_PAGE = "confirmacao.jsp";
	private static final String CONFIRMACAO_PAGE_REDIRECT = "redirect:/controller/confirmar";
	
	@Inject private BindingResult br;

	@Inject private Models models;
	
	@Inject private Event<Leitor> eventoLeitor;
	
	@POST @CsrfValid @ValidateOnExecution(type = ExecutableType.NONE)
	public String post(@Valid @BeanParam Leitor leitor) {
		eventoLeitor.fire(leitor);
		return obterPaginaRetorno(CONFIRMACAO_PAGE_REDIRECT);
	}

	@GET 
	public String get() {
		return PESQUISA_PAGE;
	}
	
	@GET @Path("confirmar")
	public String confirmar() {
		return CONFIRMACAO_PAGE;
	}
	
	@GET @Path("voltar")
	public String voltar() {
		return PESQUISA_PAGE;
	}
	
	private String obterPaginaRetorno(String paginaRetorno) {
		if (br.isFailed()) {
			models.put("br", br);
			paginaRetorno = PESQUISA_PAGE;
		}
		return paginaRetorno;
	}
}