package dev.java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Explicita que a classe se trata de um controlador de uma API REST
@RequestMapping //Define esta classe como base para o mapeamento de rotas
public class Controller {

    @GetMapping("/boasvindas") //Metodo ira devolver informação, quando o caminho "localhost:8080/boasVindas" for acessado
    public String boasVindas (){
        return "Essa é minha primeira mensagem nessa rota";
    }

}
