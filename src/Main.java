class HelloWorld {
    public static void main (String[] args) {
        int[] numeros = {2,5,7,9,2};
        int suma = 0;

        for (int numero: numeros){
            suma+= numero;
        }
        System.out.println(suma);

        suma =0;
        for (int i=0;i<numeros.length;i++){
            suma+=numeros[i];
        }
        System.out.println(suma);
    }
}




