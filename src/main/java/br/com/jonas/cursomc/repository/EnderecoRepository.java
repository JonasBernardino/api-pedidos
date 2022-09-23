package br.com.jonas.cursomc.repository;

import br.com.jonas.cursomc.domain.Cliente;
import br.com.jonas.cursomc.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
