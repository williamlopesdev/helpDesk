package com.wil.helpdesk_1.domain.enums;

public enum Perfil {
	ADMIN(0, "ROLE_ADMIN"), CLIENTE(1, "ROLE_CLIENTE"), TECNICO(2, "ROLE_TECNICO");
	
	private Integer codigo;
	private String descricao;
	
	//alt+shift.S - gera o construtor
	private Perfil(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	//construtor
	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static Perfil toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for(Perfil x : Perfil.values()) {
			if(cod.equals(x.getCodigo())){
				return x;
		}
	}
	throw new IllegalArgumentException("Perfil Invalido");
}}
