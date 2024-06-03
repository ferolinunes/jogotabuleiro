package programacao;
import java.util.Random;
import java.util.Scanner;
public class jogo_tabuleiro {
    public static void main(String[] arg) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        int soma1 = 0;
        int soma2 = 0;
        int jogadores = 1;

        System.out.println("Bem vindo ao jogo Ilha do Tesouro Perdido");
        while (jogadores != 0 && soma1 < 30 && soma2 < 30) {
            System.out.println("De quem é a vez? 1 - Jogador 1; 2 - Jogador 2");
            jogadores = scanner.nextInt();
            if(jogadores == 1) {
                soma1 += dado1;
                System.out.println("Você tirou " + dado1 + " e está na posição " + soma1);
            } else if (jogadores == 2){
                soma2 += dado2;
                System.out.println("Você tirou " + dado2 + " e está na posição " + soma2);
            } else {
                System.out.println("Tente novamente");
            }
            switch ( soma1 | soma2) {
                case 1:
                    System.out.println("Continue no 1");
                    break;
                case 2:
                    System.out.println("Avance 3 casas (5)");
                    if (jogadores == 1) {
                        soma1 += 3;
                    } else {
                        soma2 += 3;
                    }
                    break;
                case 3:
                    System.out.println("Avance 2 casas (5)");
                    if (jogadores == 1) {
                        soma1 += 2;
                    } else {
                        soma2 += 2;
                    }
                    break;
                case 4:
                    System.out.println("Continue no 4");
                    break;
                case 5:
                    System.out.println("Volte ao início");
                    if (jogadores == 1) {
                        soma1 -= 5;
                    } else {
                        soma2 -= 5;
                    }
                    break;
                case 6:
                    System.out.println("Continue no 6");
                    break;
                case 7:
                    System.out.println("Avance 5 casas (12)");
                    if (jogadores == 1) {
                        soma1 += 5;
                    } else {
                        soma2 += 5;
                    }
                    break;
                case 8:
                    System.out.println("Volte 1 casa (7)");
                    if (jogadores == 1) {
                        soma1 -= 1;
                    } else {
                        soma2 -= 1;
                    }
                    break;
                case 9:
                    System.out.println("Continue no 9");
                    break;
                case 10:
                    System.out.println("Avance 1 casa (11)");
                    if (jogadores == 1) {
                        soma1 += 1;
                    } else {
                        soma2 += 1;
                    }
                    break;
                case 11:
                    System.out.println("Volte 3 casas (8)");
                    if (jogadores == 1) {
                        soma1-= 3;
                    } else {
                        soma2 -= 3;
                    }
                    break;
                case 12:
                    System.out.println("Continue no 12");
                    break;
                case 13:
                    System.out.println("Continue no 13");
                    break;
                case 14:
                    System.out.println("Avance 1 casa (15)");
                    if (jogadores == 1) {
                        soma1 += 1;
                    } else {
                        soma2 += 1;
                    }
                    break;
                case 15:
                    System.out.println("Volte 5 casas (10)");
                    if (jogadores == 1) {
                        soma1 -= 5;
                    } else {
                        soma2 -= 5;
                    }
                    break;
                case 16:
                    System.out.println("Avance 2 casas (18)");
                    if (jogadores == 1) {
                        soma1 += 2;
                    } else {
                        soma2 += 2;
                    }
                    break;
                case 17:
                    System.out.println("Volte 2 casas (15)");
                    if (jogadores == 1) {
                        soma1 -= 2;
                    } else {
                        soma2 -= 2;
                    }
                    break;
                case 18:
                    System.out.println("Avance 10 casas (28)");
                    if (jogadores == 1) {
                        soma1 += 10;
                    } else {
                        soma2 += 10;
                    }
                    break;
                case 19:
                    System.out.println("Continue no 19");
                    break;
                case 20:
                    System.out.println("Volte 2 casas (18)");
                    if (jogadores == 1) {
                        soma1 -= 2;
                    } else {
                        soma2 -= 2;
                    }
                    break;
                case 21:
                    System.out.println("Avance 3 casas (24)");
                    if (jogadores == 1) {
                        soma1 += 3;
                    } else {
                        soma2 += 3;
                    }
                    break;
                case 22:
                    System.out.println("Continue no 22");
                    break;
                case 23:
                    System.out.println("Volte 4 casas (19)");
                    if (jogadores == 1) {
                        soma1 -= 4;
                    } else {
                        soma2 -= 4;
                    }
                    break;
                case 24:
                    System.out.println("Avance 1 casa (25)");
                    if (jogadores == 1) {
                        soma1 += 1;
                    } else {
                        soma2 += 1;
                    }
                    break;
                case 25:
                    System.out.println("Volte 2 casas (23)");
                    if (jogadores == 1) {
                        soma1 -= 2;
                    } else {
                        soma2 -= 2;
                    }
                    break;
                case 26:
                    System.out.println("Continue no 26");
                    break;
                case 27:
                    System.out.println("Volte 1 casa (26)");
                    if (jogadores == 1) {
                        soma1 -= 1;
                    } else {
                        soma2 -= 1;
                    }
                    break;
                case 28:
                    System.out.println("Avance 2 casas (30)");
                    if (jogadores == 1) {
                        soma1 += 2;
                    } else {
                        soma2 += 2;
                    }
                    break;
                case 29:
                    System.out.println("Volte 10 casas (19)");
                    if (jogadores == 1) {
                        soma1 += 10;
                    } else {
                        soma2 += 10;
                    }
                case 30:
                    System.out.println("Você venceu!!");
                    break;
                default:
            }
        }
    }
}
