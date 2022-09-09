package br.com.adopet.adocao.controller;

import br.com.adopet.adocao.domain.Animal;
import br.com.adopet.adocao.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping
    public ResponseEntity<List<Animal>> listar() {
        var usuarios = animalService.listar();
        return ResponseEntity.ok(usuarios);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Animal> especifico(@PathVariable("id") Long id) {
        var resultado = animalService.porId(id);

        if (Objects.isNull(resultado)) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(resultado);
    }

    @PostMapping
    public ResponseEntity<Animal> criar(@RequestBody Animal animal) {
        var salvo = animalService.criar(animal);
        return ResponseEntity.ok(salvo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Animal> editar(@PathVariable("id") Long id, @RequestBody Animal animal) {
        return ResponseEntity.ok(animalService.editar(id, animal));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        animalService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
