package io.github.brunnotoscano.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.criteria.CriteriaBuilder;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemPedidoDTO {
    private Integer produto;
    private Integer quantidade;
}
