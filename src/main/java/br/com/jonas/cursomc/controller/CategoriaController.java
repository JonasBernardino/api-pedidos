package br.com.jonas.cursomc.controller;

import br.com.jonas.cursomc.domain.Categoria;
import br.com.jonas.cursomc.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> findById(@PathVariable Integer id){
        return ResponseEntity.ok().body(categoriaService.findById(id));
    }
    @GetMapping()
    public ResponseEntity<List<Categoria>> findAll(){
        return  ResponseEntity.ok().body(categoriaService.findAll());
    }

}
