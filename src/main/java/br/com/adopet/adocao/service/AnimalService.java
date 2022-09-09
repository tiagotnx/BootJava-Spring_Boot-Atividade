package br.com.adopet.adocao.service;

import br.com.adopet.adocao.core.crud.CrudService;
import br.com.adopet.adocao.domain.Animal;
import org.springframework.stereotype.Service;

@Service
public class AnimalService extends CrudService<Animal, Long> {
    @Override
    protected Animal editarEntidade(Animal recuperado, Animal entidade) {
        recuperado.setNome(entidade.getNome());
        recuperado.setCidade(entidade.getCidade());
        recuperado.setTipo(entidade.getTipo());
        recuperado.setDescricao(entidade.getDescricao());
        recuperado.setIdade(entidade.getIdade());

        return recuperado;
    }
}
