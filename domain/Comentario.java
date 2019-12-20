package com.algaworks.socialbooksapi.domain;

import lombok.Builder;

import java.util.Date;

@Builder
public class Comentario {
    public Long id;
    public String texto;
    public Usuario usuario;
    public Date dataComentario;
}
