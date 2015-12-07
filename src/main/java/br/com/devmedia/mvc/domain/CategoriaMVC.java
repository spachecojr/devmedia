package br.com.devmedia.mvc.domain;

import java.io.Serializable;

public enum CategoriaMVC implements Serializable {
	
	BASEADO_EM_COMPONENTES("Baseado em componentes"), BASEADO_EM_ACOES("Baseado em acoes");
	
	private String value;

	private CategoriaMVC(String value) {
		this.value = value;
	}
	public CategoriaMVC convertValueToEnum(String value){
		return BASEADO_EM_ACOES.value.equals(value) ? BASEADO_EM_ACOES: BASEADO_EM_COMPONENTES;
	}
}