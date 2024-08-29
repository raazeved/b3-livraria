import java.util.Scanner;

public class GameJogoDaVelha {

    // Controles do jogador internos para facilitar futuramente adicionar jogador sendo computador,
    public static final int Jogador1  = 0;
    public static final int Jogador2  = 1;
    public static final int Embranco  = 2;
    
    // Jogadores que terão o nome exibido = JogadorX=Jogador1 ; JogadorO=Jogador2
    private static String jogadorX;
    private static String jogadorO;

    // Board ou Tabuleiro do jogo da velha
    public static final int Linha = 3, Coluna = 3;  // numero de linha e coluna
    public static int[][] Tabuleiro = new int[Linha][Coluna]; // dimensão do tabuleiro do jogo

    // entrada do jogo e jogador
    public static Scanner in = new Scanner(System.in); // captura entradas

    // Constants que definem os estados do jogo
    public static final int Jogando         = 0;
    public static final int Empate          = 1;
    public static final int Jogador1_VENCEU = 2;
    public static final int Jogador2_VENCEU = 3;

    // Status Atual do Jogo
    public static int StatusDoJogo;
    // Status do Jogadores
    public static int JogadorJogando;  // Jogador1, Jogador 2
    // Entrada de dados
    private Scanner entrada = new Scanner(System.in);

    // Iniciar o jogo e o  tabuleiro 
    public static void IniciarJogo() {
        for (int lin = 0; lin < Linha; ++lin) {
            for (int col = 0; col < Coluna; ++col) {
                Tabuleiro[lin][col] = Embranco;     // Limpa todas as celulas
            }
        }
        JogadorJogando = Jogador1;  // Assinalando 1o jogador, aqui dá para fazer a mudança para Computador
        StatusDoJogo  = Jogando;    // Pronto para jogar
    }
    // Atualizar o tabuleiro na tela
    public static void AtualizaTela() {
        for (int lin = 0; lin < Linha; ++lin) {
            for (int col = 0; col < Coluna; ++col) {
                Jogada(Tabuleiro[lin][col]); // Exibe a celula
                if (col != Coluna - 1) {
                    System.out.print("|");   // Barra vertical de separação
                }
            }
            System.out.println(); // pular uma linha
            if (lin != Linha - 1) {
                System.out.println("-----------"); // Barra horizontal de separação
            }
        }
        System.out.println(); // pular uma linha
    }

    // Imprima se a célula tiver algum conteúdo fornecido pelo jogador
    public static void Jogada(int content) {
        switch (content) {
            case Jogador1:  System.out.print(" X "); break;
            case Jogador2:  System.out.print(" O "); break;
            case Embranco:  System.out.print("   "); break;
        }
    }
    
    // Inicio do programa 
    public static void main (String[] args) {
        try {
            IniciarJogo();

            // futuramente adaptar uma função caso deseje que o jogador seja um computador
            System.out.print("Digite o nome do jogador X: ");
            jogadorX = in.nextLine();
            System.out.print("Digite o nome do jogador O: ");
            jogadorO = in.nextLine();

            // Fluxo principal do Programa 
            do {
                Jogar(jogadorX,jogadorO);
                // Atualiza a Tela com após a Jogada 
                AtualizaTela();
                // Emite a mensagem quando o jogo finalizar 
                if (StatusDoJogo == Jogador1_VENCEU) {
                    System.out.println("Jogador"+ jogadorX+" Ganhou!\nAté a próxima!");
                } else if (StatusDoJogo == Jogador2_VENCEU) {
                    System.out.println("Jogador"+ jogadorX+" Ganhou!\nAté a próxima!");
                } else if (StatusDoJogo == Empate) {
                    System.out.println("Deu Empate!\nTente Novamente!");
                }
                // Troca de jogador a cada jogada 
                JogadorJogando = (JogadorJogando == Jogador1) ? Jogador2 : Jogador1;
                
            } while (StatusDoJogo == Jogando); // Repetição enquanto não termina o jogo

        }  // Descobrir quais excessões (throws) teremos que adicioanr aqui. 
            catch(StringIndexOutOfBoundsException e) {
            System.out.println("parametro invalido");
        }
    }

    // Solicitar ao jogador que faça a jogada
    public static void Jogar(String JogadorX, String JogadorO) {
        boolean Continua = false;  // Continua o Jogo ? 
        do {
            if (JogadorJogando == Jogador1) {
                System.out.print("Jogador:"+JogadorX+", faça sua jogada (Linha[1-3] depois Coluna[1-3]): ");
            } else {
                System.out.print("Jogador:"+JogadorO+", faça sua jogada (Linha[1-3] depois Coluna[1-3]): ");
            }
            int lin = in.nextInt() - 1;  // entrada da linha jogada 
            int col = in.nextInt() - 1;  // entrada da coluna jogada
            if (lin >= 0 && lin < Linha && col >= 0 && col < Coluna
                    && Tabuleiro[lin][col] == Embranco) {
                 // Atualiza o Tabuleiro e retorna novo status para o jogo após jogadas
                StatusDoJogo = AtualizaJogo(JogadorJogando, lin, col);
                Continua = true;
            } else {
                System.out.println("Jogada (" + (lin + 1) + "," + (col + 1)
                        + ") não é valido, tente novamente!");
            }
        } while (!Continua);  // Repetir se for uma entrada Lin, Col inválida
    }

    // Confere se há algum ganhador 
    public static int AtualizaJogo(int jogador, int linSel, int colSel) {
        // Atualiza Tabuleiro
        Tabuleiro[linSel][colSel] = jogador;

        // Verifica quem Ganhou
        if (Tabuleiro[linSel][0] == jogador         // Verificar nas 3 linhas
                && Tabuleiro[linSel][1] == jogador
                && Tabuleiro[linSel][2] == jogador
                || Tabuleiro[0][colSel] == jogador  // Verificar nas 3 colunas
                && Tabuleiro[1][colSel] == jogador
                && Tabuleiro[2][colSel] == jogador
                || linSel == colSel                 // Verificar nas 3 Diagonal
                && Tabuleiro[0][0] == jogador
                && Tabuleiro[1][1] == jogador
                && Tabuleiro[2][2] == jogador
                || linSel + colSel == 2             // Verificar nas 3 diagonais oposta
                && Tabuleiro[0][2] == jogador
                && Tabuleiro[1][1] == jogador
                && Tabuleiro[2][0] == jogador) {
            return (jogador == Jogador1) ? Jogador1_VENCEU : Jogador2_VENCEU; // Alguém venceu
        } else {
           // Ninguém venceu ou ainda está jogando
            for (int lin = 0; lin < Linha; ++lin) {
                for (int col = 0; col < Coluna; ++col) {
                    if (Tabuleiro[lin][col] == Embranco) {
                        return Jogando;             // continuamos com celulas em branco!
                    }
                }
            }
            return Empate; // Não temos mais celulas em branco, logo houve um empate !
        }
    }
}