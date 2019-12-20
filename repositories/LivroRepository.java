package com.algaworks.socialbooksapi.repositories;

import com.algaworks.socialbooksapi.domain.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
