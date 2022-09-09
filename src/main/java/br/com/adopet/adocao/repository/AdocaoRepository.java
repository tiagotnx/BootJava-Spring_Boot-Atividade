package br.com.adopet.adocao.repository;

import br.com.adopet.adocao.core.crud.CrudRepositry;
import br.com.adopet.adocao.domain.Adocao;
import org.springframework.stereotype.Repository;

@Repository
public interface AdocaoRepository extends CrudRepositry<Adocao, Long> {
}
