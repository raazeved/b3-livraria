package tech.ada.b3testesexercicios.service;
// https://dontpad.com/notas-de-aulas
//https://github.com/rflima11/b3-exercicios-test

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import tech.ada.b3testesexercicios.entity.Usuario;

import org.mockito.Mock;
import org.mockito.Mockito;
import tech.ada.b3testesexercicios.repository.UsuarioRepository;

import java.time.LocalDateTime;
import java.util.Optional;


@ExtendWith(MockitoExtension.class)
class BuscarUsuarioServiceTest {

    @Mock
    UsuarioRepository usuarioRepositoryMock;

    @InjectMocks// definir a anotação em cima do atributo é responsável por criar o new
    BuscarUsuarioService service;


    @Test
    void deveBuscarUmUsuarioPorCPFComSucesso() {
         // Cenário
        String cpf = "18298623835";
        Usuario usuarioRetorno= new Usuario ( "Rogerio", "18298623835", 49, LocalDateTime.now());


        Mockito.when(usuarioRepositoryMock.findByCpf(cpf))
                .thenReturn(Optional.of(usuarioRetorno));

        // Execução
         Usuario usuario  = service.buscarUsuarioPorCPF(cpf);

        // Verificação
        Assertions.assertNotNull(usuario); // se for
        Assertions.assertEquals(cpf, usuario.getCpf());

    }

    @Test
    void deveRetornarNuloAoNaoEncontrarUmUsuario() {

        //Cenario
        String cpf = "18298623835";
        Mockito.when(usuarioRepositoryMock.findByCpf(cpf))
                .thenReturn(Optional.empty());

        //Executar

        Usuario usuario = service.buscarUsuarioPorCPF(cpf);



        //Verificação
        Assertions.assertNull(usuario);
    }
}