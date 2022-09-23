package br.com.jonas.cursomc.repository;

import br.com.jonas.cursomc.domain.Cidade;
import br.com.jonas.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
