package br.com.acqiogrowup.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter @Setter
public class Carrinho implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carrinhoId;
    private Double valorTotal;

    @OneToOne
    @JoinColumn(name = "cliente_cliente_id")
    private Cliente cliente;

    @OneToMany
    @JoinColumn (name="idProduto")
    private List<Produto> listaProdutos;



}
