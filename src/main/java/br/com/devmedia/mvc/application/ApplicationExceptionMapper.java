package br.com.devmedia.mvc.application;

import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
/**
 * 
 * @author Sinvaldo Junior
 *
 */
public class ApplicationExceptionMapper implements ExceptionMapper<ConstraintViolationException>{

	private static final String ERRO_PAGE = "erro.jsp";

	@Override
	public Response toResponse(ConstraintViolationException e) {
		//tratamento de erros
		return Response.status(Status.BAD_REQUEST).entity(ERRO_PAGE).build();
	}
}
