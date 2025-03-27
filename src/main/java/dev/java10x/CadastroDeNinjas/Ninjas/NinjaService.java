package dev.java10x.CadastroDeNinjas.Ninjas;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

//    Listar todos os meus ninjas
    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();
    }

//    Listar todos os meus ninjas por ID
    public NinjaModel listarNinjasPorID(Long id) {
        Optional<NinjaModel> ninjaModel = ninjaRepository.findById(id);
        return ninjaModel.orElse(null);
    }

    //    Criar um novo ninja
    public NinjaModel criarNinja(NinjaModel ninja) {
        return ninjaRepository.save(ninja);
    }

//    Deletar o ninja - Tem que ser um metodo VOID
    public  void deletarNinjaPorID(long id) {
        ninjaRepository.deleteById(id);
    }

//    Alterar um ninja
//    public NinjaModel alterarNinjaPorId(Long id) {
//
//    }

}
