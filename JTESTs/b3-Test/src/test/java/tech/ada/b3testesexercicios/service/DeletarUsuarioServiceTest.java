package tech.ada.b3testesexercicios.service;
// https://dontpad.com/notas-de-aulas
//https://github.com/rflima11/b3-exercicios-test

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import tech.ada.b3testesexercicios.entity.Usuario;
import tech.ada.b3testesexercicios.exception.UsuarioNaoEncontradoException;
import tech.ada.b3testesexercicios.repository.UsuarioRepository;

import java.time.LocalDateTime;
import java.util.Optional;

class DeletarUsuarioServiceTest {

    @Mock
    UsuarioRepository repositoryMock;

    @InjectMocks
    DeletarUsuarioService deletarUsuarioService;


    @Test
    void deveDeletarUmUsuarioEncontradoComSucesso() {
        // Cenario
        Long id = 11L;

        Usuario usuario  = new Usuario (
                "Rogerio",
                "18298623835",
                49,
                LocalDateTime.now()
        );

        Mockito.when(repositoryMock.findById(id)).thenReturn(Optional.of(usuario));

        // Execução
        deletarUsuarioService.deletarUsuario(id);

        // Verificação
        Mockito.verify(repositoryMock, Mockito.times(1)).delete(usuario);

    }


    @Test
    void deveLancarUmaExcecaoAoNaoEncontrarUmUsuuario() {
        // Cenario
        Long id = 11L;

        Mockito.when(repositoryMock.findById(id)).thenReturn(Optional.empty());

        Assertions.assertThrows(UsuarioNaoEncontradoException.class, () -> deletarUsuarioService.deletarUsuario(id));

        // Assertions.assertNotNull(UsuarioNaoEncontradoException);

      //  Assertions.assertEquals(String.format("Usuario não Encontrado com o ID %s", id), usu);

    }

}