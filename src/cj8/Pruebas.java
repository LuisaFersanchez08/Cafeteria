package cj8;

public class Pruebas {
    public static void main(String[] args) {
        // Bloque 1
        String campo = " 3";
        int cajas1 = Integer.parseInt(campo.trim());
        System.out.println(cajas1 + 1);

        // Bloque 2 y 3
        final int TARIFA_POR_KILO = 4200;
        String campoPeso = "2.014";
        String campoCajas = "3";

        double pesoKg = Double.parseDouble(campoPeso);
        int cajas2 = Integer.parseInt(campoCajas);

        // Se agregó el operador '*' y se removió el guion extra
        double costo = pesoKg * TARIFA_POR_KILO;
        System.out.println("Costo calculado: " + costo);

        // Bloque 4
        int cajas3 = 3;
        long cajasLargo = cajas3;
        double cajasDecimal = cajas3;
        System.out.println(cajasLargo);
        System.out.println(cajasDecimal);
    }
}
