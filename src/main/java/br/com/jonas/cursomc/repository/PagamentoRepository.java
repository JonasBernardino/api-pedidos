package br.com.jonas.cursomc.repository;

import br.com.jonas.cursomc.domain.Pagamento;
import br.com.jonas.cursomc.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
}
