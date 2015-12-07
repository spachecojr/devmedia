package br.com.devmedia.mvc.events;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.mvc.event.AfterControllerEvent;
import javax.mvc.event.AfterProcessViewEvent;
import javax.mvc.event.BeforeControllerEvent;
import javax.mvc.event.ControllerRedirectEvent;
/**
 * 
 * @author Sinvaldo Junior
 *
 */
@ApplicationScoped
public class LogRequisicoesObserver {

	public void onBeforeController(@Observes BeforeControllerEvent e) {
		// Uri requisitada: e.getUriInfo().getRequestUri();
	}

	public void onAfterController(@Observes AfterControllerEvent e) {
		// Metodo requisitado: e.getResourceInfo().getResourceMethod()
	} 
	
	public void onAfterProcessViewEvent(@Observes AfterProcessViewEvent e) {
		// View requisitada: e.getView();
	}
	
	public void onControllerRedirectEvent(@Observes ControllerRedirectEvent e) {
		// Redirecionamento para: e.getLocation();
	}
}
