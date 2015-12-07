package br.com.devmedia.mvc.business;

import javax.ejb.Stateless;
import javax.enterprise.event.Observes;

import br.com.devmedia.mvc.domain.Leitor;

/**
 *
 * @author Sinvaldo Junior
 */
@Stateless
public class PesquisaServiceBean {
	
	public void persistirCadadastroLeitor(@Observes Leitor leitor) {
		//persistencia.
	}
	
	public void enviarEmailLeitor(@Observes Leitor leitor) {
		// envio de e-mail.
	}
}