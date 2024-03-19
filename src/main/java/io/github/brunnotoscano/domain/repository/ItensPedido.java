package io.github.brunnotoscano.domain.repository;

import io.github.brunnotoscano.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensPedido extends JpaRepository<ItemPedido, Integer> {
}
