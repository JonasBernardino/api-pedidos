package br.com.jonas.cursomc.domain;

import br.com.jonas.cursomc.domain.enuns.EstadoPagamento;

import javax.persistence.Entity;

@Entity
public class PagamentoComBoleto extends Pagamento {

    private Integer numeroDeParcelas;

    public PagamentoComBoleto() {
    }

    public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
        super(id,estado,pedido);
        this.numeroDeParcelas = numeroDeParcelas;
    }

    public Integer getNumeroDeParcelas() {
        return numeroDeParcelas;
    }

    public void setNumeroDeParcelas(Integer numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }
}
