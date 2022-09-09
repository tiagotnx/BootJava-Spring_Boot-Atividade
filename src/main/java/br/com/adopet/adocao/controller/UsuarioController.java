package br.com.adopet.adocao.controller;

import br.com.adopet.adocao.core.crud.CrudController;
import br.com.adopet.adocao.domain.Usuario;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController extends CrudController<Usuario, Long> {
}
