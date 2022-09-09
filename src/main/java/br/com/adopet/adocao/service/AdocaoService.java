package br.com.adopet.adocao.service;

import br.com.adopet.adocao.core.crud.CrudService;
import br.com.adopet.adocao.domain.Adocao;
import org.springframework.stereotype.Service;

@Service
public class AdocaoService extends CrudService<Adocao, Long> {
    @Override
    protected Adocao editarEntidade(Adocao recuperado, Adocao entidade) {
        return null;
    }
}
