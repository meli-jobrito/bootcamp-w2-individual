package br.com.meli.apimorse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/morse/{value}")
    public String endPoint(@PathVariable String value){

        return Morse.normal(value);
    }
}
