package br.com.adopet.adocao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Adocao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name="ID_USUARIO", referencedColumnName = "id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name="ID_ANIMAL", referencedColumnName = "id")
    private Animal animal;
}
