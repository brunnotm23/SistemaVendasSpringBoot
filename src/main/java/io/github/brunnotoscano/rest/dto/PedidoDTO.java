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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PedidoDTO {
    private Integer cliente;
    private BigDecimal total;
    private List<ItemPedidoDTO> itens;
}
