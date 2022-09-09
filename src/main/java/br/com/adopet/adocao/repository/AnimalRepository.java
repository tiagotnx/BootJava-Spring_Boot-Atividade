package br.com.adopet.adocao.repository;

import br.com.adopet.adocao.core.crud.CrudRepositry;
import br.com.adopet.adocao.domain.Animal;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends CrudRepositry<Animal, Long> {
}
