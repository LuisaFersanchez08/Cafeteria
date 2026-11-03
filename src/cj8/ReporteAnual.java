package cj8;

public class ReporteAnual {

    public static void main(String[] args) {
        int cajasDelDia = 10;
        int pedidosDelDia = 4;

        // Convertimos a double uno de los enteros para evitar la división entera (resultado 2.5)
        double promedioCajas = (double) cajasDelDia / pedidosDelDia;
        System.out.println("Promedio de cajas por pedido: " + promedioCajas);

        final int TARIFA_POR_KILO = 4200;
        String campoPeso = "2.014";
        String campoCajas = "3";

        double pesoKg = Double.parseDouble(campoPeso);
        int cajas = Integer.parseInt(campoCajas);

        double costo = pesoKg * TARIFA_POR_KILO;
        System.out.println("Costo calculado: " + costo);

        int gramos = (int) Math.round(pesoKg * 1000);
        System.out.println("Peso en la guía: " + gramos + " g en " + cajas + " cajas");

        long costoCobrado = Math.round(costo);
        System.out.println("Costo a cobrar: $" + costoCobrado);
    }
} // <- Aquí termina correctamente la clase (eliminamos la tercera llave sobrante)
