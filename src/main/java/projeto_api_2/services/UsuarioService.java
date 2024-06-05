package projeto_api_2.services;

import org.springframework.stereotype.Service;
import projeto_api_2.domain.model.Usuario;

import java.util.List;

@Service
public interface UsuarioService {


    Usuario findById(long id);

    List<Usuario> findAll();

    Usuario create(Usuario usuarioCriar);


}
