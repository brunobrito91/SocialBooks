package com.algaworks.socialbooksapi.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Date;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
public class Livro {
    public Long id;
    public String titulo;
    public Autor autor;
    public List<Comentario> comentarios;
    public Date dataPublicacao;
}
