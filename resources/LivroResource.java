package com.algaworks.socialbooksapi.resources;

import com.algaworks.socialbooksapi.domain.Livro;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class LivroResource {

    @RequestMapping(value = "/livros", method = RequestMethod.GET)
    public List<Livro> listar() {
        Livro l1 = Livro.builder().titulo("Livro A").build();
        Livro l2 = Livro.builder().titulo("Livro B").build();
        Livro[] livros = {l1, l2};
        return Arrays.asList(livros);
    }
}
