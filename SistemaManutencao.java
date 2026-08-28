package com.mycompany.sistemamanutencao;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaManutencao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> sistemaMensagens = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n--- Menu do Sistema ---");
            System.out.println("1. Adicionar Mensagem");
            System.out.println("2. Visualizar Mensagens");
            System.out.println("3. Remover Mensagem");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a mensagem: ");
                    String msg = scanner.nextLine();
                    
                    if(msg.trim().isEmpty()){
                        System.out.println("Erro. Não é permitido adicionar mensagens vazias ou compostas apenas por espaços");
                    }else{
                        sistemaMensagens.add(msg);
                        System.out.println("Mensagem adicionada!");   
                    }
                    break;

                case 2:
                    System.out.println("\nMensagens no sistema:");
                    if (sistemaMensagens.isEmpty()) {
                        System.out.println("Nenhuma mensagem registrada.");
                    } else {
                        for (int i = 0; i < sistemaMensagens.size(); i++) {
                            System.out.println((i + 1) + ". " + sistemaMensagens.get(i));
                        }
                    }
                    break;
                
                case 3:
                    System.out.println("\nMensagens no sistema:");
                    if (sistemaMensagens.isEmpty()){
                        System.out.println("Nenhuma mensagem registrada.");
                    } else {
                        for (int i = 0; i < sistemaMensagens.size(); i++) {
                            System.out.println((i + 1) + ". " + sistemaMensagens.get(i));
                        }
                        System.out.println("Qual mensagem deseja excluir");
                        int msgEscolhida = scanner.nextInt();
                        
                        scanner.nextLine();
                        
                        int i = msgEscolhida - 1;
                        
                        if(i >= 0 && i < sistemaMensagens.size() ){
                            String msgRemovida = sistemaMensagens.remove(i);
                            System.out.println("Mensagem: " + i + "removida com sucesso");
                        }else{
                            System.out.println("Não foi possivel remover a mensagem.");
                        }                 
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcao != 4);

        scanner.close();
    }
}