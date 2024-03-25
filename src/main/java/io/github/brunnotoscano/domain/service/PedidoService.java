package io.github.brunnotoscano.domain.service;

import io.github.brunnotoscano.domain.entity.Pedido;
import io.github.brunnotoscano.domain.enums.StatusPedido;
import io.github.brunnotoscano.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto);

    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaPedido (Integer id, StatusPedido statusPedido);
}
