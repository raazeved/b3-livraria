package tech.ada.poo.base.biblioteca.model;

import tech.ada.poo.base.biblioteca.util.LivroFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Livro extends ItemCatalogo {
    private int id;
    private String autor;
    private String editora;

    public Livro() {
        this.id = 0;
        this.setTitulo("");
        this.autor = "";
        this.editora = "";
    }

    public Livro (String titulo) {
        super.setTitulo(titulo);
    }

    public Livro(int id, String titulo, String autor, String editora) {
        this.id = id;
        this.setTitulo(titulo);
        this.autor = autor;
        this.editora = editora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return super.getTitulo();
    }

    public void setTitulo(String titulo) {
        super.setTitulo(titulo);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    /* public Livro[] carregaLivros(String fileName)
    {
        File file = new File(fileName);
        Livro livro;
        Livro[] livros;
        LivroFiles LivroFile = new LivroFiles();

         livros = new Livro(LivroFile.contaLinhas(file));
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
        return Livro;
    }
*/
    public int listaLivros(Livro[] livros){
        int total=0;
        System.out.println("Listando os Livros");
        for (Livro livro : livros) {
            System.out.println("Id......:"+livro.getId());
            System.out.println("Título..:"+livro.getTitulo());
            System.out.println("Autor...:"+livro.getAutor());
            System.out.println("----------------");
            total++;
        }
        return total;
    }

    public void buscar(Livro[] livros, String nome){
        for (Livro livro : livros) {
            //buscar por títulos que tenham parte daquilo que foi digitado
            if(livro.getTitulo().toLowerCase().contains(nome.toLowerCase())){
                System.out.println("Id......:"+livro.getId());
                System.out.println("Título..:"+livro.getTitulo());
                System.out.println("Autor...:"+livro.getAutor());
                System.out.println("----------------");
            }
        }

    }

}

