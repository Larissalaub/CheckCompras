package main;

import service.ItemService;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ItemService itemService = new ItemService();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Remover item");
            System.out.println("3 - Listar itens");
            System.out.println("4 - ver total");
            System.out.println("5 - Sair");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Digite o nome do item: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite quantidade");
                    int quatity = scanner.nextInt();
                    System.out.println("Digite o preço:");
                    double price = scanner.nextDouble();
                    itemService.addItem(nome, quatity, price);
                    break;
                    case 2:
                        System.out.println("Digite o nome do item a remover:");
                        String nomeRemover = scanner.nextLine();
                        itemService.removeItem(nomeRemover);
                        break;
                    case 3:
                        itemService.listItems();
                        break;
                    case 4:
                        System.out.println("Total: R$ " + itemService.getTotal());
                        break;
                        case 5:
                            running = false;
                            break;
                            default:
                                System.out.println("Opção invalida.");
            }
        }
        scanner.close();
    }
}
