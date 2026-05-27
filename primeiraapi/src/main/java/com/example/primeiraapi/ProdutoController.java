package com.example.primeiraapi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProdutoController {
    @GetMapping("/produto")
    public Produto produto(){
        //cria e retorna um objeto Produto
        //O Spring Boot converte esses objeto automaticamente em JSON
        return new Produto( 1L, "notebook", 3500.00);
    }

    @GetMapping("/produtos")
    public List<Produto> listarProdutos() {
        //Retorna uma listacom vários produtos
        //o Spring boot cnverte a lista em JSON automaticamente
        return List.of(
                new Produto(1L, "notebook", 3500.00),
                new Produto(2L, "Mouse", 80.00),
                new Produto(3L, "teclado", 150.00)
        );
    }
}