package br.com.adopet.adocao.service;

import br.com.adopet.adocao.core.crud.CrudService;
import br.com.adopet.adocao.domain.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService extends CrudService<Usuario, Long> {
    @Override
    protected Usuario editarEntidade(Usuario recuperado, Usuario entidade) {
        recuperado.setNome(entidade.getNome());
        recuperado.setCidade(entidade.getCidade());
        recuperado.setEmail(entidade.getEmail());
        recuperado.setDescricao(entidade.getDescricao());
        recuperado.setTelefone(entidade.getTelefone());

        return recuperado;
    }
}
