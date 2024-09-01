package tech.ada.poo.base.biblioteca.util;
import tech.ada.poo.base.biblioteca.model.Livro;

import java.io.*;

public class LivroFiles {

    public Livro[] carregaFiles(String fileName){
        File file = new File(fileName);
        Livro livro;
        Livro[] livros;
        livros = new Livro[contaLinhas(file)];
        try {
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader bf = new BufferedReader(isr);
            String linha;
            linha=bf.readLine();
            int linhas=0;
            while(true){
                linha=bf.readLine();
                if(linha==null)
                    break;
                String[] dados=linha.split(";");
                livro=new Livro();
                livro.setId(Integer.parseInt(dados[0]));
                livro.setTitulo(dados[1]);
                livro.setAutor(dados[2]);
                livros[linhas]=livro;
                linhas++;
            }
            bf.close();
        }  catch (Exception e) {
            e.printStackTrace();
        }
        return livros;
    }

    public int contaLinhas(File file){
        System.out.println("Contando as linhas");
        int total=0;
        try {
            FileReader isr = new FileReader(file);
            BufferedReader bf = new BufferedReader(isr);
            String linha;
            linha=bf.readLine();
            int linhas=0;
            while(true){
                linha=bf.readLine();
                if(linha==null)
                    break;
                linhas++;
            }
            total=linhas;
            bf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("t"+total);
        return total;
    }
}
