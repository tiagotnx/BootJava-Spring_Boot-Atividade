package br.com.adopet.adocao.service;

import br.com.adopet.adocao.domain.Usuario;
import br.com.adopet.adocao.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    public Usuario porId(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario criar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario editar(Long id, Usuario editado) {
        var recuperado = porId(id);

        if (Objects.isNull(recuperado)) {
            throw new RuntimeException("Não foi encontrado!");
        }

        recuperado.setNome(editado.getNome());
        return usuarioRepository.save(recuperado);
    }

    public void excluir(Long id) {
        usuarioRepository.deleteById(id);
    }
}
