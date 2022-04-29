
public class App {
    public static void main(String[] args) {
        
        try {

            Lista<Integer> lista = new Lista<>(5);

            lista.adiciona(1);
            lista.adiciona(2);
            lista.adiciona(3);
            lista.adiciona(4);
            lista.adiciona(5);

            System.out.println(lista);
            lista.limpar();
            System.out.println(lista);

        } catch (Exception e) {			
			e.printStackTrace();
		}
        
       
    }
}