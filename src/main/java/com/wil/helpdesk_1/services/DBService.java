package com.wil.helpdesk_1.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wil.helpdesk_1.domain.Chamado;
import com.wil.helpdesk_1.domain.Cliente;
import com.wil.helpdesk_1.domain.Tecnico;
import com.wil.helpdesk_1.domain.enums.Perfil;
import com.wil.helpdesk_1.domain.enums.Prioridade;
import com.wil.helpdesk_1.domain.enums.Status;
import com.wil.helpdesk_1.repositories.ChamadoRepository;
import com.wil.helpdesk_1.repositories.ClienteRepository;
import com.wil.helpdesk_1.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	
	public void instaciaDB() {
		Tecnico tec1 = new Tecnico(null, "Valdir Cesar", "555.651.310-49", "valdir@email.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus Torvalds", "183.255.940-80", "linus@email.com", "321");
		cli1.addPerfil(Perfil.CLIENTE);
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
		
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
}
