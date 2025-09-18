import java.util.ArrayList;
import java.util.Scanner;

public class Lists {
    String header = """
            ==== Menu ====
             1 - Adicionar nome
              2 - Remover nome
              3 - Lista de nomes
               4 - Sair
            """;
    public void Escolhas () {

        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println(header);
        while (true) {
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Qual nome quer adicionar?");
                    String newUser = scan.next();
                    list.add(newUser);
                    System.out.println(newUser + " adicionado");
                    System.out.println(header);
                    break;
                case 2:
                    System.out.println("Qual nome quer remover?");
                    String remove = scan.next();
                    list.remove(remove);
                    System.out.println(remove + " removido");
                    System.out.println(header);
                    break;
                case 3:
                    System.out.println(list);
                    System.out.println(header);
                    break;
                case 4:
                    scan.close();
                    System.out.println("Lista finalizada");
                    break;
                default:
                    System.out.println("Opção invalida");
                    System.out.println(header);
                    break;
            }

        }
    }
}


