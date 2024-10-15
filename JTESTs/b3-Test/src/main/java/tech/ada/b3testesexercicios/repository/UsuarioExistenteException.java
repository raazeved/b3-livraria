package tech.ada.b3testesexercicios.repository;

public class UsuarioExistenteException extends RuntimeException {

    public UsuarioExistenteException(String msg) {
        super(msg);
    }
}
