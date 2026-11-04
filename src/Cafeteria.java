public class Cafeteria {

    public static void main (String [] args) {

        String nombreProducto = "Chocolisto";
        double precioUnitario = 2.50;
        int cantidadProducto = 40;
        boolean disponibleHoy = true;
        char codigoProducto = 's';

        // ejercicio descuento 15%
        double subtotal = 42500;
        double descuentoProducto = 0.15;
        double descuentoValor = subtotal * descuentoProducto;
        double pagoTotal = subtotal - descuentoValor;
        boolean aplicaDescuento = true;

        // while
        int inventarioCafe = 50;
        int consumoCafe = 1;

        // Do while
        int valorApertura = -10;
        int ingreso = 0;

        // Switch
        char categoriaProducto = 'B';

        switch (categoriaProducto) {
            case 'B':
                System.out.println("Bebida Caliente con descuento del 0%");
                break;

            case 'F':
                System.out.println("Bebida fría con descuento el 5%");
                break;

            case 'C':
                System.out.println("Comida con descuento el 8%");
                break;

            case 'P':
                System.out.println("Postre con descuento el 8%");
                break;

            default:
                System.out.println("Categoría no existente");
        }

        // While
        while (inventarioCafe >= 10) {
            inventarioCafe -= consumoCafe;
            System.out.println("El pedido ha sido exitoso, su inventario actual es de: " + inventarioCafe);
        }
        System.out.println("El inventario es menor a 10 unidades");

        // do-while
        do {
            System.out.println("El valor de apertura es " + (ingreso + valorApertura));

            if (valorApertura <= 0) {
                System.out.println("El valor ingresado no es correcto: " + valorApertura);
                ingreso++;
                valorApertura++;
            }
        } while (valorApertura <= 0);

        System.out.println("El valor ingresado es correcto: " + valorApertura);

        // Array

        String[] productos = {"Café americano", "Capuchino", "Jugo de naranja", "Tostada", "Brownie"};

        double[] precios = {3500, 5000, 4000, 4500, 6000};

        double sumaMenu = 0;


        for(int i = 0; i < productos.length; i++ ) {


            System.out.println((i + 1) + ". " + productos[i] + " - $" + precios[i]);

            sumaMenu += precios[i];
        }


        double promedio = sumaMenu / precios.length;

        System.out.println("Precio promedio del menú: $" + promedio);

        // Ejercicio 7

        int cantidadVendida = 5;

        precioUnitario = 4500;

        double total = cantidadVendida * precioUnitario;

        aplicaDescuento = (total > 20000);

        if (aplicaDescuento) {
            total = total - (total * 0.10);
        }

        System.out.println("Total caja registradora: " + total);


        System.out.println("Nombre del producto : " + nombreProducto);
        System.out.println("Precio del producto : " + precioUnitario);
        System.out.println("Cantidad : " + cantidadProducto);
        System.out.println("Disponible : " + disponibleHoy);
        System.out.println("Código : " + codigoProducto);

        // Impresión de resultados
        System.out.printf("El subtotal es : $%.2f%n", subtotal);
        System.out.printf("El valor del descuento es : $%.2f%n", descuentoValor);
        System.out.printf("El total es :  $%.2f%n", pagoTotal);
        System.out.printf("¿Aplica el descuento? : %b%n", aplicaDescuento);

    }
}






