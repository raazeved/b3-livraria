package tech.ada.b3testesexercicios.service;
// https://dontpad.com/notas-de-aulas
//https://github.com/rflima11/b3-exercicios-test

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import tech.ada.b3testesexercicios.repository.UsuarioRepository;

class CriarUsuarioServiceTest {
    @Mock
    UsuarioRepository repositoryMock;

    @InjectMocks
    DeletarUsuarioService deletarUsuarioService;



    @Test
    void deveCriarUmUsuarioComSucesso() {
    }

    @Test
    void deveLancarExcecaoCasoUmUsuarioJaTenhaSidoCadastrado() {
    }
}