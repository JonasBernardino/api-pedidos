package br.com.jonas.cursomc.controller;

import br.com.jonas.cursomc.domain.Categoria;
import br.com.jonas.cursomc.dto.CategoriaDTO;
import br.com.jonas.cursomc.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

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
    public ResponseEntity<List<CategoriaDTO>> findAll() {
        List<Categoria> list = categoriaService.findAll();
        List<CategoriaDTO> dtoList = list.stream().map(obj -> new CategoriaDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(dtoList);
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody Categoria obj){
        obj = categoriaService.save(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody Categoria obj){
        obj.setId(id);
        obj = categoriaService.update(obj);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        categoriaService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
