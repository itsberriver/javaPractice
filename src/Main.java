import java.util.Scanner;
import java.util.Arrays;

class HelloWorld {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        String[] options = new String [3];
        options[0] = "0.Comprar producto";
        options[1] = "1.Añadir producto";
        options[2] = "2.Eliminar producto";

        String[] products = new String [3];
        products[0] = "0.aguacate-2€";
        products[1] = "1.leche-1€";
        products[2] = "2.mantequilla-3€";


        System.out.println("Digite el número de la opción que quiera realizar: ");
        System.out.println( options[0]);
        System.out.println( options[1]);
        System.out.println( options[2]);
        int choosedOption;
        choosedOption = input.nextInt();

        if ( choosedOption == 0){
            System.out.println("tu decisión ha sido: " + options[0] );
            System.out.println("Cuál de los siguientes productos quiere comprar?: " );
            System.out.println( products[0]);
            System.out.println( products[1]);
            System.out.println( products[2]);
            int choosedProduct;
            choosedProduct = input.nextInt();
            System.out.println("Producto comprado con éxito" );
        }

       if  ( choosedOption == 1){
            System.out.println("tu decisión ha sido: " + options[1] );
        }
        if  ( choosedOption == 2){
            System.out.println("tu decisión ha sido: " + options[2] );
        }
        if  ( choosedOption > 2){
            System.out.println("Cuidado! No exite esta opción, introduzca de nuevo la opción que desea: " );
            System.out.println( options[0]);
            System.out.println( options[1]);
            System.out.println( options[2]);
            choosedOption = input.nextInt();
        }








       /*
        System.out.println("esta opción no existe, vuelva a intentarlo:");*/





    }
}




