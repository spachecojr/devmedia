package br.com.devmedia.mvc.application;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.mvc.security.Csrf;
import javax.mvc.security.Csrf.CsrfOptions;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
/**
 * 
 * @author Sinvaldo Junior
 *
 */
@ApplicationPath("app")
public class MvcApplication extends Application {
	
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> set = new HashSet<Class<?>>();
		//TODO adicionar classes gerenciadas pela JAX-RS.
		return set;
	}
	
	@Override
	public Map<String, Object> getProperties() {
		final Map<String, Object> map = new HashMap<String, Object>();
		map.put(Csrf.CSRF_PROTECTION, CsrfOptions.EXPLICIT);
		return map;
	}
}