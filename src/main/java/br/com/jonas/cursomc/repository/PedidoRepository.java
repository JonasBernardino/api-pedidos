package br.com.jonas.cursomc.repository;

import br.com.jonas.cursomc.domain.Categoria;
import br.com.jonas.cursomc.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
