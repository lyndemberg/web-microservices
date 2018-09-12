package br.microservices.anyservice.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @GetMapping
    public ResponseEntity<List<String>> getAll(){
        return ResponseEntity.ok(Arrays.asList("EJB3","Utilizando UML e Padrões", "Angular 6"));
    }

}
