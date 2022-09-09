package br.com.adopet.adocao.controller;

import br.com.adopet.adocao.core.crud.CrudController;
import br.com.adopet.adocao.domain.Animal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/animal")
public class AnimalController extends CrudController<Animal, Long> {
}
