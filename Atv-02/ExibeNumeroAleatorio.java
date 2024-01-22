public class ExibeNumeroAleatorio {
    public static void main (String args[]){
        double numeroAleatorio = Math.random();
        numeroAleatorio *= 100;  
        System.out.println("O valor gerado foi " + numeroAleatorio);
    }
}

