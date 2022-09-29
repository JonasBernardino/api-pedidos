package br.com.jonas.cursomc.controller;

import br.com.jonas.cursomc.domain.Pedido;
import br.com.jonas.cursomc.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> findById(@PathVariable Integer id){
        return ResponseEntity.ok().body(pedidoService.findById(id));
    }
}
