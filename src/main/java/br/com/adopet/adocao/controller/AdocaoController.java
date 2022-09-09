package br.com.adopet.adocao.controller;

import br.com.adopet.adocao.core.crud.CrudController;
import br.com.adopet.adocao.domain.Adocao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adocao")
public class AdocaoController extends CrudController<Adocao, Long> {
}
