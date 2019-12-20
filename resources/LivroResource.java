package com.algaworks.socialbooksapi.resources;

import com.algaworks.socialbooksapi.domain.Livro;
import com.algaworks.socialbooksapi.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LivroResource {

    @Autowired
    public LivroRepository livroRepository;

    @RequestMapping(value = "/livros", method = RequestMethod.GET)
    public List<Livro> listar() {
        return livroRepository.findAll();
    }
}
