package tech.ada.poo.base.servico.compactar;

import tech.ada.poo.base.servico.compactar.elementos.Audio;
import tech.ada.poo.base.servico.compactar.elementos.Fluxo;

import java.io.File;

public class ServicoArquivoFluxoImpl implements InterfaceServicoArquivo, InterfaceServicoStream {

    @Override
    public void compactar(File file) {
        System.out.println("compactando o arquivo");
    }

    @Override
    public void compactar(Audio audio) {
        System.out.println("compactando audio");
    }

    @Override
    public void compactar(Fluxo fluxo) {
        System.out.println("compactando fluxo de dados");
    }
}
