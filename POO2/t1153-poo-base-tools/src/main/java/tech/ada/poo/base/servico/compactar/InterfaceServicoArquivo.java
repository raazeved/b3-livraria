package tech.ada.poo.base.servico.compactar;

import tech.ada.poo.base.servico.compactar.elementos.Audio;

import java.io.File;

public interface InterfaceServicoArquivo {

    String CONFIG_SERVICO = "valor-x";

    void compactar(File file);
    void compactar(Audio audio);

}
