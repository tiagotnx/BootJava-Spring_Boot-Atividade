package br.com.adopet.adocao.service;

import br.com.adopet.adocao.domain.Animal;
import br.com.adopet.adocao.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public List<Animal> listar() {
        return animalRepository.findAll();
    }

    public Animal porId(Long id) {
        return animalRepository.findById(id).orElse(null);
    }

    public Animal criar(Animal animal) {
        return animalRepository.save(animal);
    }

    public Animal editar(Long id, Animal editado) {
        var recuperado = porId(id);

        if (Objects.isNull(recuperado)) {
            throw new RuntimeException("Não foi encontrado!");
        }

        recuperado.setNome(editado.getNome());
        return animalRepository.save(recuperado);
    }

    public void excluir(Long id) {
        animalRepository.deleteById(id);
    }
}
