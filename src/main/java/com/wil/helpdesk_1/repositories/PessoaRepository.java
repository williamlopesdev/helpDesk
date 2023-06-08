package com.wil.helpdesk_1.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wil.helpdesk_1.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
	Optional<Pessoa> findByCpf(String cpf);
	Optional<Pessoa> findByEmail(String email);

}
