package io.github.brunnotoscano.domain.repository;

import io.github.brunnotoscano.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {
}
