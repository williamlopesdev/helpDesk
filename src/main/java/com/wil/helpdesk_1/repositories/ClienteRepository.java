package com.wil.helpdesk_1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wil.helpdesk_1.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	
}
