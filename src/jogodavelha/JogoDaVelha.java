package jogodavelha;

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String tabela[][] = {
            {"|1", "2", "3|"},
            {"|4", "5", "6|"},
            {"|7", "8", "9|"}
        };

        int po[] = new int[9];

        int p;

        int vez = 1;

        int i = 0;
        
        System.out.println("Jogador I: X (começa); \n" + "Jogador II: O");

        imprimirTabela(tabela);

        while (i < 9) {
            System.out.println("Digite a posição:");
            p = sc.nextInt();
            if (p == po[0] || p == po[1] || p == po[2] || p == po[3] || p == po[4] || p == po[5] || p == po[6] || p == po[7] || p == po[8]) {
                System.out.println("Posição já ocupada!");
            } else {
                posicionar(p, tabela, vez);
                imprimirTabela(tabela);
                int s = status(tabela, i);
                if (s == 1) {
                    break;
                } else {
                    po[i] = p;
                    if (vez == 1) {
                        vez = 2;
                    } else {
                        vez = 1;
                    }
                    i++;
                }

            }
        }
    }

    
    
    
    
    
    
    
    
    static int status(String a[][], int i) {
        int v = 0;
        if ((a[0][0].equals("|X") && a[0][1].equals("X") && a[0][2].equals("X|")) || (a[0][0].equals("|X") && a[1][0].equals("|X") && a[2][0].equals("|X")) || (a[0][0].equals("|X") && a[1][1].equals("X") && a[2][2].equals("X|")) || (a[0][2].equals("X|") && a[1][1].equals("X") && a[2][0].equals("|X")) || (a[2][0].equals("|X") && a[2][1].equals("X") && a[2][2].equals("X|")) || (a[0][1].equals("X") && a[1][1].equals("X") && a[2][1].equals("X")) || (a[0][2].equals("X|") && a[1][2].equals("X|") && a[2][2].equals("X|"))) {
            System.out.println("Jogo encerrado!");
            v = 1;
        } else if ((a[0][0].equals("|O") && a[0][1].equals("O") && a[0][2].equals("O|")) || (a[0][0].equals("|O") && a[1][0].equals("|O") && a[2][0].equals("|O")) || (a[0][0].equals("|O") && a[1][1].equals("O") && a[2][2].equals("O|")) || (a[0][2].equals("O|") && a[1][1].equals("O") && a[2][0].equals("|O")) || (a[2][0].equals("|O") && a[2][1].equals("O") && a[2][2].equals("O|")) || (a[0][1].equals("O") && a[1][1].equals("O") && a[2][1].equals("O")) || (a[0][2].equals("O|") && a[1][2].equals("O|") && a[2][2].equals("O|"))) {
            System.out.println("Jogo encerrado!");
            v = 1;
        } else if (i == 8) {
            System.out.println("Empate!");
        } else {
            System.out.println("Em andamento!");
        }
        return v;
    }

    static void posicionar(int a, String t[][], int v) {
        if (v == 1) {
            switch (a) {
                case 1:
                    t[0][0] = "|X";
                    break;
                case 2:
                    t[0][1] = "X";
                    break;
                case 3:
                    t[0][2] = "X|";
                    break;
                case 4:
                    t[1][0] = "|X";
                    break;
                case 5:
                    t[1][1] = "X";
                    break;
                case 6:
                    t[1][2] = "X|";
                    break;
                case 7:
                    t[2][0] = "|X";
                    break;
                case 8:
                    t[2][1] = "X";
                    break;
                case 9:
                    t[2][2] = "X|";
                    break;
            }
        } else {
            switch (a) {
                case 1:
                    t[0][0] = "|O";
                    break;
                case 2:
                    t[0][1] = "O";
                    break;
                case 3:
                    t[0][2] = "O|";
                    break;
                case 4:
                    t[1][0] = "|O";
                    break;
                case 5:
                    t[1][1] = "O";
                    break;
                case 6:
                    t[1][2] = "O|";
                    break;
                case 7:
                    t[2][0] = "|O";
                    break;
                case 8:
                    t[2][1] = "O";
                    break;
                case 9:
                    t[2][2] = "O|";
                    break;
            }

        }
    }

    static void imprimirTabela(String a[][]) {
        System.out.println("============================");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
