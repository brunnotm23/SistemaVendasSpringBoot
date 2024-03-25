package io.github.brunnotoscano.rest.dto;

//{
//    "cliente" : 1,
//    "total" : 100,
//    "itens" : [
//        {
//            "produto" : 1,
//            "quantidade" : 1
//        }
//    ]
//}

import io.github.brunnotoscano.domain.entity.Produto;
import io.github.brunnotoscano.domain.enums.StatusPedido;
import io.github.brunnotoscano.validation.NotEmptyList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PedidoDTO {
    @NotNull(message = "{campo.codigo-cliente.obrigatorio}")
    private Integer cliente;

    @NotNull(message = "{campo.total-pedido.obrigatorio}")
    private BigDecimal total;

    @NotEmptyList(message = "{campo.items-pedido.obrigatorio}")
    private List<ItemPedidoDTO> itens;
}
