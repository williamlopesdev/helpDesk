package com.wil.helpdesk_1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wil.helpdesk_1.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

	
	
}
