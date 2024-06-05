package projeto_api_2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import projeto_api_2.domain.model.Usuario;
import projeto_api_2.services.UsuarioService;

import java.net.URI;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    private final UsuarioService usuarioService;

    //Injeção de dependencias via construtor
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    //Aqui e interessante usar o padrão DTO(Data Transfer Object)
    @GetMapping("/{id}")
    public ResponseEntity<Usuario>  findById(@PathVariable Long id){
        var  Usuario = usuarioService.findById(id);
        return ResponseEntity.ok(Usuario);
    }

    @PostMapping
    public ResponseEntity<Usuario>  create(@RequestBody Usuario novoUsuario){
        usuarioService.create(novoUsuario);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(novoUsuario.getId())
                .toUri();
        return ResponseEntity.created(location).body(novoUsuario);
    }





}
