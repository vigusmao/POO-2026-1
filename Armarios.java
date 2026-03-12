public class Armarios {

    public static final boolean ABERTO = true;
    public static final boolean FECHADO = false;

    public static int retornarArmariosAbertos(int n, boolean estadoInicial) {
 
        boolean[] armarios = new boolean[n+1];  // nao usaremos a pos zero
        for (int i = 1; i <= n; i++) {
	    armarios[i] = estadoInicial;
        }
        
        for (int crianca = 1; crianca <= n; crianca++) {
            for (int armario = 1; armario <= n; armario++) {
                if (armario % crianca == 0) {
                    armarios[armario] = !armarios[armario];
                }
            }       
        }
        
        int cont = 0;
        for (int armario = 1; armario <= n; armario++) {
            if (armarios[armario] == ABERTO) {
                cont++;
            }   
        }

        return cont;
    }

    public static void main(String[] args) {
        System.out.println("Abertos = " + 
            retornarArmariosAbertos(100, FECHADO));
    }
} 
