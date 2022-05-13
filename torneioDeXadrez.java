package aula5desafio;

import java.util.Scanner;

public class torneioDeXadrez {
    public static void main(String[] args) {
        Scanner scString = new Scanner(System.in);
        int i = 0, contVitoria = 0, grupo = 0;
        int cont1 = 0, cont2 = 0, cont3 = 0;
        String resultadoPartida = " ", resp = " "; 

        do{
            contVitoria = 0;
            i++;
            System.out.println("\n-------------------------");
            System.out.println("    " + i + "º Participante");
            System.out.println("-------------------------\n");

            System.out.println("Digite: V - Caso tenha vencido | P - Caso tenha perdido\n");

            for (int j = 0; j < 6; j++) {
                System.out.println("Digite o resulta da " + (j+1) + "º partida: ");
                resultadoPartida = scString.next();
                if(resultadoPartida.equalsIgnoreCase("V")){
                    contVitoria++;
                }
            }

            if(contVitoria == 5 || contVitoria == 6){
                grupo = 1;
                cont1++;
            }

            if(contVitoria == 3 || contVitoria == 4){
                grupo = 2;
                cont2++;
            }

            if(contVitoria == 1 || contVitoria == 2){
                grupo = 3;
                cont3++;
            }

            if(contVitoria == 0){
                grupo = 0;
            }

            System.out.println("\n==========================");
            if (grupo != 0){
                System.out.println("Você foi alocado no grupo " + grupo);
            } else{
                System.out.println("Você não foi convidado a continuar com os treinamentos.");
            }
            System.out.println("===========================\n");
                
            System.out.println("Deseja adicionar os dados de outro participante ?\n S - Sim | N - Não:");
            resp = scString.next();
            if(resp.equalsIgnoreCase("N")){
                break;
            }

        }while(true);

        System.out.println("\n************************************************");
        System.out.println("               Informações do Torneio ");
        System.out.println("************************************************");
        System.out.println("Quantidade de alunos alocados no grupo 1: " + cont1);
        System.out.println("Quantidade de alunos alocados no grupo 2: " + cont2);
        System.out.println("Quantidade de alunos alocados no grupo 3: " + cont3);
        System.out.println("************************************************");

        scString.close();
    }
}
