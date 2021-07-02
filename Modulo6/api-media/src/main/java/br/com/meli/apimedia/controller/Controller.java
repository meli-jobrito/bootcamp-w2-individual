package br.com.meli.apimedia.controller;

import br.com.meli.apimedia.dto.AlunoDTO;
import br.com.meli.apimedia.entity.Aluno;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/media")
    public AlunoDTO endPoint(@RequestBody Aluno aluno){
        return new AlunoDTO().converte(aluno);
    }
}
