package br.com.jonas.cursomc.repository;

import br.com.jonas.cursomc.domain.Cidade;
import br.com.jonas.cursomc.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
