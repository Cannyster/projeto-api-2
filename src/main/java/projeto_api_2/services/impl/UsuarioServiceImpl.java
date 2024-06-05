package projeto_api_2.services.impl;

import org.springframework.stereotype.Service;
import projeto_api_2.domain.model.Usuario;
import projeto_api_2.domain.model.repository.UsuarioRepository;
import projeto_api_2.services.UsuarioService;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioServiceImpl(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public Usuario findById(long id) {
        return repository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<Usuario> findAll() {
        return List.of();
    }

    @Override
    public Usuario create(Usuario usuarioCriar) {
       if(usuarioCriar.getId() != null && repository.existsById(usuarioCriar.getId())){
            throw new IllegalArgumentException("Usuário Já Existente.");
       }
       return repository.save(usuarioCriar);
    }
}
