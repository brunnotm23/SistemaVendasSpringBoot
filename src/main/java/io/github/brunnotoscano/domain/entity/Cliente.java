package io.github.brunnotoscano.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "cliente")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id")
    private Integer id;
    @Column(name = "nome", length = 100)
    private String nome;
    @Column(name = "cpf")
    private String cpf;

    @JsonIgnore
    @OneToMany( mappedBy = "cliente", fetch = FetchType.LAZY)
    private Set<Pedido> pedidos;

    public Cliente(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
