import java.util.Scanner;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String nome, tel , email;
        int posicao;
        int opcao;


        System.out.println("Agenda Digital");
        LinkedList<Contato> agenda = new LinkedList<>();
        do {
        System.out.println();
        System.out.println("------Menu------");
        System.out.println();
        System.out.println("1- Inserir contato");
        System.out.println("2- Buscar contato");
        System.out.println("3- Remover contato");
        System.out.println("4- Imprimir todos os contatos");
        System.out.println("0- Fechar agenda");
        System.out.println();
        System.out.print("Digite a opção desejada: ");
        opcao = scanner.nextInt();
        scanner.nextLine();
        switch (opcao){
            case 1:

                System.out.print("Digite o nome do Contato: ");
                nome = scanner.nextLine();
                System.out.print("Digite o telefone do contato: ");
                tel = scanner.nextLine();
                System.out.print("Digite o email do contato: ");
                email = scanner.nextLine();
                Contato contato= new Contato(nome,tel,email);
                agenda.add(contato);

            break;
            
            case 2:

                System.out.print("Digite o contato a ser buscado: ");
                posicao = scanner.nextInt();
                
                System.out.println(agenda.get(posicao));

                break;
            
            case 3:
                System.out.print("Digite o contato a ser removido: ");
                posicao = scanner.nextInt();
                agenda.remove(posicao);

                break;
            
            
            case 4:
                System.out.println("------Lista de Contatos------");
                System.out.println(agenda);
                break;
            
            case 0:
                System.out.println("Agenda fechada");
                break;

            default:
                System.out.println("Opção invalida");


        }
    
     } while (opcao != 0);       
        }
    

    }

