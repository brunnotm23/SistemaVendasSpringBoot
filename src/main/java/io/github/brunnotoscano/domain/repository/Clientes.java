package io.github.brunnotoscano.domain.repository;

import io.github.brunnotoscano.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Clientes extends JpaRepository<Cliente, Integer> {

    @Query(value = " select c from Cliente c where c.nome like :nome ")
    List<Cliente> encontrarPorNome(@Param("nome") String nome);

    boolean existsByNome(String nome);

    @Query( " select c from Cliente c left join fetch c.pedidos where c.id = :id ")
    Cliente findClienteFetchPedidos(@Param("id") Integer id);
}
