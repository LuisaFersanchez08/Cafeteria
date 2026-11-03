package cj8;

public class Main{

    public static void main (String [] args) {
        System.out.println("Hola");


        int cajas = 3;
        System.out.println("Cajas: " + cajas);

        double pesoKg = 2.75;
        System.out.println("Peso: " + pesoKg + " kg");

        long numeroGuia = 3_104_587_221L;
        System.out.println("Guía: " + numeroGuia);

        char zona = 'B';
        boolean esFragil = true;
        System.out.println("Zona: " + zona);
        System.out.println("Frágil: " + esFragil);

        int valorDeclarado = 350_000;
        System.out.println("Valor declarado: " + valorDeclarado);


        String destinatario = "Valentina Ríos";
        String ciudadDestino = "Tunja";
        System.out.println("Destinatario: " + destinatario.toUpperCase());
        System.out.println("Destino: " + ciudadDestino);

        System.out.print(destinatario.charAt(0));
    }
}
