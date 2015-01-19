package br.com.treinar.tarefa.marlon;

public enum DiaSemana {
	DOMINGO("Domingo", Comercial.NAO_COMERCIAL),
	SEGUNDA_FEIRA("Segunda Feira", Comercial.COMERCIAL),
	TERCA_FEIRA("Ter�a Feira", Comercial.COMERCIAL),
	QUARTA_FEIRA("Quarta Feira", Comercial.COMERCIAL),
	QUINTA_FEIRA("Quinta Feira", Comercial.COMERCIAL),
	SEXTA_FEIRA("Sexta Feira", Comercial.COMERCIAL),
	SABADO("S�bado", Comercial.NAO_COMERCIAL);
	
	
	private DiaSemana(String descricao, Comercial comercial) {
		this.descricao = descricao;
		this.comercial = comercial;
	}

	private String descricao;
	private Comercial comercial;
	
	
	public String getDescricao() {
		return descricao;
	}
	public Comercial getComercial() {
		return comercial;
	}
	
	//
	public DiaSemana getEnumOrdinal(int ordinal){
		return DiaSemana.values()[ordinal];
	}
	
	public static DiaSemana getOrdinal(Integer ordinal){
		return values()[ordinal];

		
	}
}
