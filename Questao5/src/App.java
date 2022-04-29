import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        PilhaPar<Integer> piPar = new PilhaPar<>();
        PilhaImpar<Integer> piImpar = new PilhaImpar<>();


        System.out.println("Digite dez valores diferentes: ");
        System.out.println();
        for (int i = 0; i < 10; i++) {
        int x = scanner.nextInt();
           lista.add(x); 
           if (x%2 == 0){
               piPar.empilha(x);
           }
           else{
               piImpar.empilha(x);
           }
        }

        System.out.println("\n-------------------------\n");
        System.out.println("Valores inseridos na lista: " + lista);
        System.out.println("\n-------------------------\n");
        System.out.println("Valores que foram empilhados na pilha impar: " + piImpar);
        System.out.println("\n-------------------------\n");
        System.out.println("Valores que foram empilhados na pilha par: " +piPar);
        System.out.println("\n-------------------------\n");




    }
}
