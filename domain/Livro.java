package com.algaworks.socialbooksapi.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String titulo;
    @ManyToMany
    public List<Autor> autores;
    @OneToMany
    public List<Comentario> comentarios;
    public Date dataPublicacao;
}
