public class Cafeteria {

    public static void main (String [] args) {

        String nombreProducto = "Chocolisto";
        double precioUnitario = 2.500;
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

        //Do while
         int valorApertura = -10;
         int ingreso = 0;




    //Switch


        char categoriaProducto = 'B';

        switch (categoriaProducto) {

            case 'B':
                System.out.println("Bebida Caliente con descuento del 0%");
                break;

            case 'F' :
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


        };

        //While

        while (inventarioCafe >= 10) {
            inventarioCafe -= consumoCafe;

            System.out.println("El pedio ha sido exitoso, su inventario actual es de: " + inventarioCafe);

        }
        System.out.println("El inventario es menor a 10 uniades");


// ejercicio do while

        do {
            System.out.println("El valor de apertura es " + ingreso + valorApertura);

            if (valorApertura <= 0) {
                System.out.println("El valor ingresado no es correcto" + valorApertura);

                ingreso++;


        }

            while (valorApertura > 0);
                System.out.println("El valor ingresado es correcto : " + valorApertura);







        System.out.println(String.format("Nombre del producto : " + nombreProducto));
        System.out.println(String.format("Precio del producto : " + precioUnitario));
        System.out.println(String.format("Cantidad : " + cantidadProducto));
        System.out.println(String.format("Disponible : " + disponibleHoy));
        System.out.println(String.format("Código : " + codigoProducto));

        //impresión del resultado
        System.out.printf("El subtotal es : $%.2f%n ", subtotal);
        System.out.printf("El valor del descuento es : $%.2f%n ", descuentoValor);
        System.out.printf("El total es :  $%.2f%n", pagoTotal);
        System.out.printf("¿Aplica el descuento? :%b%n ", aplicaDescuento);


    }




    }






