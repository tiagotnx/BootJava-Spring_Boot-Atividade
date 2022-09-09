package br.com.adopet.adocao.core.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CrudRepositry<T, ID> extends JpaRepository<T, ID> {
}
