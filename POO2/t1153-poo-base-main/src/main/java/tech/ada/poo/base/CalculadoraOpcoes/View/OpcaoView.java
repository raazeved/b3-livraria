package tech.ada.poo.base.CalculadoraOpcoes.View;

import tech.ada.poo.base.CalculadoraOpcoes.Model.Opcao;
import tech.ada.poo.base.marketplace.Produto;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.event.*;

// papel de representar a visualizacao e acoes de tomada de decisao

public class OpcaoView {

    private List<Opcao> opcoes;

    public static void main(String args[])
    {
        JFrame jf = new JFrame1();
        jf.setVisible(true);
        jf.setSize(200, 200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setOpcoes(List<Opcao> opcoes) {
        this.opcoes = opcoes;
    }

    public void listarOpcoes() {
        // seguem a lista de produtos ordenados por ...
        System.out.println( Arrays.toString(opcoes.toArray()) );
    }



    public void OpcaoViewText(Opcao opcao) {
        System.out.println("-------------------------------------------------");
        System.out.println("                Dados da Opção                   ");
        System.out.println("-------------------------------------------------");
        System.out.println("Preço do Ativo Objeto [" + opcao.getSpot() + "]");
        System.out.println("Preço de Exercício de uma Opção [" + opcao.getStrike()+ "]");
        System.out.println("Taxsa de Juros [" + opcao.getTaxaDeJuros() + "]");
        System.out.println("Data de Vencimento DD/MM/YYYY [" + opcao.getVencimento() + "]");
        System.out.println("Data de Referencia DD/MM/YYYY [" + opcao.getDataReferencia()+ "]");
        System.out.println("Prazo da operação [" + opcao.getPrazo() + "]");
        System.out.println("Volatilidade Implicita da Operação [" + opcao.getVolatilidade()+ "]");
    }

    public void OpcaoViewWindow(Opcao opcao) {

        JFrame frame = new JFrame("Dados da Opção");
        JPanel panel = new JPanel();

        panel.setLayout(new FlowLayout());
        // JLabel label = new JLabel("JFrame By Example");
        JLabel label1 = new JLabel("Preço do Ativo Objeto [" + opcao.getSpot() + "]");
        JLabel label2 = new JLabel("Preço de Exercício de uma Opção [" + opcao.getStrike()+ "]");
        JLabel label3 = new JLabel("Taxsa de Juros [" + opcao.getTaxaDeJuros() + "]");
        JLabel label4 = new JLabel("Data de Vencimento DD/MM/YYYY [" + opcao.getVencimento() + "]");
        JLabel label5 = new JLabel("Data de Referencia DD/MM/YYYY [" + opcao.getDataReferencia()+ "]");
        JLabel label6 = new JLabel("Prazo da operação [" + opcao.getPrazo() + "]");
        JLabel label7 = new JLabel("Volatilidade Implicita da Operação [" + opcao.getVolatilidade()+ "]");

        JButton button = new JButton();
        button.setText("Ok");

        JLabel label8 = new JLabel(" \r\n "+" \r\n "+" \r\n ");
        panel.add(label1);
        panel.add(label8);
        panel.add(label2);
        panel.add(label8);
        panel.add(label3);
        panel.add(label8);
        panel.add(label4);
        panel.add(label8);
        panel.add(label5);
        panel.add(label8);
        panel.add(label6);
        panel.add(label8);
        panel.add(label7);
        panel.add(label8);

        panel.add(button);
        frame.add(panel);
        frame.setSize(200, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        }
}

class JFrame1 extends JFrame {
    public JFrame1() {
        JButton b = new JButton("Click");
        add(b);
        b.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent ae) {
                                    JFrame jf = new JFrame();
                                    jf.setVisible(true);
                                    jf.setSize(200, 200);
                                    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                }
                            }
        );
    }
}