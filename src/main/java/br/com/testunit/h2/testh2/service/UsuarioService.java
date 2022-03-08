package br.com.testunit.h2.testh2.service;

import br.com.testunit.h2.testh2.model.Usuario;
import br.com.testunit.h2.testh2.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }
}
