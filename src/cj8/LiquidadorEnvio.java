import java.util.Scanner;

public class LiquidadorEnvio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de cajas: ");
        int cantidadCajas = sc.nextInt();
        System.out.println("Cajas en el envío: " + cantidadCajas);

        double[] pesosCajas = new double[cantidadCajas];
        double pesoTotal = 0;
        for (int i = 0; i < pesosCajas.length; i++) {
            System.out.printf("Peso caja %d (kg): ", i + 1);
            pesosCajas[i] = sc.nextDouble();
            pesoTotal += pesosCajas[i];
        }
        System.out.printf("Peso total: %.1f kg%n", pesoTotal);

        final int RECARGO_CARGA_PESADA = 18000;
        String tipoCarga;
        int recargoPeso;
        if (pesoTotal > 50) {
            System.out.println("Envío no recibido: pasa de 50 kg. Se programa camión.");
            return;
        } else if (pesoTotal > 30) {
            tipoCarga = "PESADA";
            recargoPeso = RECARGO_CARGA_PESADA;
        } else {
            tipoCarga = "NORMAL";
            recargoPeso = 0;
        }
        System.out.printf("Carga: %s, recargo $%,d%n", tipoCarga, recargoPeso);

        System.out.print("¿Es frágil? (true/false): ");
        boolean esFragil = sc.nextBoolean();
        sc.nextLine();
        String textoFragil = esFragil ? "Sí" : "No";
        System.out.println("Frágil: " + textoFragil);

        final int RECARGO_EXPRESS = 9000;
        System.out.print("Servicio (normal/express): ");
        String campoServicio = sc.nextLine();
        String servicio = campoServicio.toUpperCase();
        int recargoServicio = 0;
        if (servicio.equals("EXPRESS")) {
            recargoServicio = RECARGO_EXPRESS;
        }
        System.out.printf("Servicio: %s, recargo $%,d%n", servicio, recargoServicio);

        char zona;
        int tarifaPorKilo;
        do {
            System.out.print("Zona (A, B o C): ");
            zona = sc.next().charAt(0);
            tarifaPorKilo = switch (zona) {
                case 'A', 'a' -> 3200;
                case 'B', 'b' -> 4200;
                case 'C', 'c' -> 5900;
                default -> 0;
            };
            if (tarifaPorKilo == 0) {
                System.out.println("Zona no válida: " + zona + ". Intenta de nuevo.");
            }
        } while (tarifaPorKilo == 0);
        System.out.printf("Tarifa zona %c: $%,d por kg%n", zona, tarifaPorKilo);

        long total = Math.round(pesoTotal * tarifaPorKilo) + recargoPeso + recargoServicio;
        System.out.printf("Total a pagar: $%,d%n", total);

        final double CAPACIDAD_MOTO_KG = 25.0;
        double cargaMoto = 0;
        int cajasEnMoto = 0;
        while (cajasEnMoto < pesosCajas.length
                && cargaMoto + pesosCajas[cajasEnMoto] <= CAPACIDAD_MOTO_KG) {
            cargaMoto += pesosCajas[cajasEnMoto];
            cajasEnMoto++;
        }
        System.out.printf("Cajas en moto: %d (%.1f kg)%n", cajasEnMoto, cargaMoto);
        System.out.println("Cajas para camión: " + (pesosCajas.length - cajasEnMoto));

        sc.close();
    }
}