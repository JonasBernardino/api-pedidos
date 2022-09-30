package br.com.jonas.cursomc.service;

import br.com.jonas.cursomc.domain.Categoria;
import br.com.jonas.cursomc.repository.CategoriaRepository;
import br.com.jonas.cursomc.service.exceptions.DataIntegrityException;
import br.com.jonas.cursomc.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria findById(Integer id) {
        return repository.findById(id).orElseThrow(() ->
                new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Categoria> findAll() {
        List<Categoria> list = repository.findAll();
        return list;
    }

    public Categoria save(Categoria obj) {
        obj.setId(null);
        return repository.save(obj);
    }

    public Categoria update(Categoria obj) {
        this.findById(obj.getId());
        return repository.save(obj);
    }

    public void delete(Integer id) {
        try {
            this.findById(id);
            repository.deleteById(id);
        }
        catch (DataIntegrityViolationException e){
            throw new DataIntegrityException("Não é possível excluir a categoria que contem produtos");
        }
    }
}
