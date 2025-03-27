package dev.java10x.CadastroDeNinjas.Ninjas;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é a minha primeira mensagem nessa rota";
    }

//    Adicionar ninja (CREATE)
    @PostMapping ("/criar")
    public NinjaModel criarNinja (@RequestBody NinjaModel ninja) {
        return ninjaService.criarNinja(ninja);
    }

//    Mostrar todos os ninjas (READ)
    @GetMapping ("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

//    Mostrar ninja por id (READ)
    @GetMapping ("/listar/{id}")
    public NinjaModel listarNinjasPorID (@PathVariable Long id) {
        return ninjaService.listarNinjasPorID(id);
    }

//    Alterar dados dos ninjas (UPDATE)
    @PutMapping ("/alterar/{id}")
    public NinjaModel alterarNinjaPorID (@PathVariable long id, @RequestBody NinjaModel ninjaAtualizado) {
        return ninjaService.atualizarNinja(id, ninjaAtualizado);
    }

//    Deletar Ninja (DELETE)
    @DeleteMapping ("/deletar/{id}")
    public void deletarNinjaPorID (@PathVariable long id) {
        ninjaService.deletarNinjaPorID(id);
    }



}
