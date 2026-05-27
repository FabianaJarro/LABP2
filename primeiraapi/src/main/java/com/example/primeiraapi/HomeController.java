package com.example.primeiraapi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String inicio() { return "API funcionando com Spring Boot!";}

    @GetMapping("/mensagem")
    public String mensagem() {
        return "Bem-vindos á aula prática de spring boot!";
    }
}
