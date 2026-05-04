import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);

        boolean menu = true;

        while(menu==true){
            System.out.println("[1] - Quadrado");
            System.out.println("[2] - Diagonal superior esquerda");
            System.out.println("[3] - Diagonal superior direita");
            System.out.println("[4] - Diagonal inferior esquerda");
            System.out.println("[5] - Diagonal inferior direita");
            System.out.println("[0] - Sair\n");
            System.out.print("Resposta: ");
            int resp = entrada.nextInt();

            int lc = 0;
            if(resp>=1 && resp<=5){
                System.out.print("Quantas colunas e linhas deseja? => ");
                lc = entrada.nextInt();
            }

            System.out.println();
            switch (resp) {
                case 1:
                    for(int l = 1; l <= lc; l++){
                        for(int c = 1; c <= lc; c++){
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for(int l = lc; l >= 1; l--){
                        for(int c = 1; c <= l; c++){
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for(int l = lc; l >= 1; l--){
                        for(int b = 0; b < lc - l; b++){
                            System.out.print("   ");
                        }
                        for(int c = 1; c <= l; c++){
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for(int l = 1; l <= lc; l++){
                        for(int c = 1; c <= lc; c++){
                            if(l >= c) System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    for(int l = 1; l <= lc; l++){
                        for(int b = 0; b < lc - l; b++){
                            System.out.print("   ");
                        }
                        for(int c = 1; c <= l; c++){
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("Obrigado, volte sempre!");
                    menu = false;
                    break;
                default:
                    System.out.println("Não entendi! tente novamente.");
            }
            System.out.println();
        }
        entrada.close();
    }
}
