package br.com.jonas.cursomc.service;

import br.com.jonas.cursomc.domain.Categoria;
import br.com.jonas.cursomc.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria findById(Integer id){
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElse(null);
    }

    public List<Categoria> findAll(){
        List<Categoria> list = repository.findAll();
        return list;
    }
}
