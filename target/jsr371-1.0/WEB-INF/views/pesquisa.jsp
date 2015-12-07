<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pesquisa</title>
    </head>
    <body>
    
	    <c:if test="${br != null}">
		    <ul>
		        <c:forEach var="message" items="${br.allMessages}">
		            <li><span style="color: red;">${mvc.encoders.html(message)}</span></li>
		        </c:forEach>
		    </ul>
		</c:if>
		
	    <h2><span>Exemplo de utilização da JSR 371</span></h2>
	    
	    <form action="${mvc.basePath}/controller" method="post">
	    	<br>
	    	
	    	<label><b>Nome:</b>
				<input type="text" name="nome"/> <br><br>
			</label>
			
			<label><b>E-mail:</b>
				<input type="text" name="email"/> <br><br>
			</label>
			
			<label><b>Endereço:</b> 
				<input type="text" name="endereco"/> <br><br>
			</label>
			
			<label><b>Profissão:</b> 
				<input type="text" name="profissao"/> <br><br>
			</label>
			
			<label><b>MVC de preferência :</b> 
				<input type="radio" name="categoriaEscolhida" value="BASEADO_EM_COMPONENTES">Baseado em componentes 
				<input type="radio" name="categoriaEscolhida" value="BASEADO_EM_ACOES">Baseado em ações <br><br>
			</label> 
			
			<label><b>Justificativa:</b>
				<textarea style="width: 214px; height: 57px;" name="justificativa" id="justificativa">${mvc.encoders.html(justificativa)}</textarea><br><br>
			</label>
			
			<input type="hidden" name="${mvc.csrf.name}" value="${mvc.csrf.token}">
			
			<input type="submit"  value="Confirmar"/>
		</form>
    </body>
</html>
