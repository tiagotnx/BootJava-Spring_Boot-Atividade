package br.com.adopet.adocao.repository;

import br.com.adopet.adocao.core.crud.CrudRepositry;
import br.com.adopet.adocao.domain.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepositry<Usuario, Long> {
}
