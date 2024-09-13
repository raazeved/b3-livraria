package tech.ada.poo.base.solid.p_04_i;

public class MainEmpresa {

    interface Trabalhador {
        double salario();
        // comportamento padrao foi movido para uma interface especifica
        //double comissao();
    }

    // uma nova interface para um novo comportamento
    interface Comissionavel {
        double comissao();
    }

    // vendedor agora tem dois papeis, trabalhador e comissionavel
    class Vendedor implements Trabalhador, Comissionavel {
        @Override public double salario() {
            return 0;
        }
        @Override public double comissao() {
            return 0;
        }
    }

    // tiramos a dependencia de comissao do trabalhador e aqui tambem
    class Atendente implements Trabalhador {
        @Override public double salario() {
            return 0;
        }
    }

}
