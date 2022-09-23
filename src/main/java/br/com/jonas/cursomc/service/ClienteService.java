package br.com.jonas.cursomc.service;

import br.com.jonas.cursomc.domain.Cliente;
import br.com.jonas.cursomc.repository.ClienteRepository;
import br.com.jonas.cursomc.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente findById(Integer id){
        return clienteRepository.findById(id).
                orElseThrow(() -> new ObjectNotFoundException("Id não encontrado"));
    }
}
