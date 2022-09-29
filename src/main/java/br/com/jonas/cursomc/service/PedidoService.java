package br.com.jonas.cursomc.service;

import br.com.jonas.cursomc.domain.Pedido;
import br.com.jonas.cursomc.repository.PedidoRepository;
import br.com.jonas.cursomc.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    public Pedido findById(Integer id){
        return repository.findById(id).orElseThrow(() ->
                new ObjectNotFoundException("Objeto não encontrado"));
    }
}
