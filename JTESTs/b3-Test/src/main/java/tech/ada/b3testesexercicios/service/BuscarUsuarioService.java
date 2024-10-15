package tech.ada.b3testesexercicios.service;

import org.springframework.stereotype.Service;
import tech.ada.b3testesexercicios.repository.UsuarioRepository;
import tech.ada.b3testesexercicios.entity.Usuario;

@Service
public class BuscarUsuarioService {

    private final UsuarioRepository usuarioRepository;


    public BuscarUsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario buscarUsuarioPorCPF(String cpf) {
        if (cpf == null || cpf.isBlank()) {
            throw new IllegalArgumentException("CPF não pode ser nulo ou em branco");
        }

        return usuarioRepository.findByCpf(cpf)
                .orElse(null);
    }
}
