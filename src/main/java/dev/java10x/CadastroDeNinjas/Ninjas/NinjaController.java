package dev.java10x.CadastroDeNinjas.Ninjas;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é a minha primeira mensagem nessa rota";
    }

//    Adicionar ninja (CREATE)
    @PostMapping ("/criar")
    public String criarNinja () {
        return "Ninja criado";
    }

//    Mostrar todos os ninjas (READ)
    @GetMapping ("/todos")
    public String mostrarTodosOsNinjas () {
        return "Mostrar ninja";
    }

//    Mostrar ninja por id (READ)
    @GetMapping ("/todosID")
    public String mostrarTodosOsNinjasPorID () {
        return "Mostrar ninja por ID";
    }

//    Alterar dados dos ninjas (UPDATE)
    @PutMapping ("/alterarID")
    public String alterarNinjaPorID () {
        return "Alterar Ninja por id";
    }

//    Deletar Ninja (DELETE)
    @DeleteMapping ("/deletarID")
    public String deletarNinjaPorID () {
        return "Ninja deletado por ID";
    }


}
