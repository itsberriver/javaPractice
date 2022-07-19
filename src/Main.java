import java.util.Scanner;

class HelloWorld {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        String[] option = new String [3];
        option[0] = "0.comprar producto";
        option[1] = "1.añadir producto";
        option[2] = "2.eliminar producto";


        System.out.println("Digite el número de la opción que quiera realizar: " + option[0]+ "   "+ option[1]+ "   "+option[2]);
        int choosedOption;
        choosedOption = input.nextInt();

        System.out.println("tu decisión ha sido: " + choosedOption );

       /* System.out.println("tu decisión ha sido: " + option[0] );
        System.out.println("tu decisión ha sido: " + option[2] );
        System.out.println("tu decisión ha sido: " + option[3] );
        System.out.println("esta opción no existe, vuelva a intentarlo:");*/
        choosedOption = input.nextInt();






    }
}




