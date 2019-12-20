package com.algaworks.socialbooksapi.domain;

import lombok.Builder;

import javax.persistence.*;
import java.util.Date;

@Builder
@Entity
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String texto;
    @ManyToOne
    public Usuario usuario;
    public Date dataComentario;
}
