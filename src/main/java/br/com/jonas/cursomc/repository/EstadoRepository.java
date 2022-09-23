package br.com.jonas.cursomc.repository;

import br.com.jonas.cursomc.domain.Estado;
import br.com.jonas.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
