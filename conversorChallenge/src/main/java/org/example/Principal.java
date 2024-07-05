package org.example;

import java.util.Scanner;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos convierteDatos = new ConvierteDatos();
    double cantidad = 0.0;
    public void muestraElMenu(){
        var opcion = -1;
        while (opcion != 0){
            var menu = """
                    Challenge - Conversor de moneda
                    
                    1 - Dólar a peso argentino
                    2 - Peso argentino a dólar
                    3 - Dólar a real brasileño
                    4 - Real brasileño a dólar 
                    5 - Dólar a peso colombiano
                    6 - Peso colombiano a dólar
                    0 - Salir
                    
                    Opción deseada: 
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    cantidad();
                    var conversion = consumoAPI.obtenerDatos("USD", "ARS", cantidad);
                    var resultado = convierteDatos.obtenerDatos(conversion, Resultado.class);
                    System.out.println(resultado + " ARS");
                    break;
                case 2:
                    cantidad();
                    conversion = consumoAPI.obtenerDatos("ARS", "USD", cantidad);
                    resultado = convierteDatos.obtenerDatos(conversion, Resultado.class);
                    System.out.println(resultado + " USD");
                    break;
                case 3:
                    cantidad();
                    conversion = consumoAPI.obtenerDatos("USD", "BRL", cantidad);
                    resultado = convierteDatos.obtenerDatos(conversion, Resultado.class);
                    System.out.println(resultado + " BRL");
                    break;
                case 4:
                    cantidad();
                    conversion = consumoAPI.obtenerDatos("BRL", "USD", cantidad);
                    resultado = convierteDatos.obtenerDatos(conversion, Resultado.class);
                    System.out.println(resultado + " USD");
                    break;
                case 5:
                    cantidad();
                    conversion = consumoAPI.obtenerDatos("USD", "COP", cantidad);
                    resultado = convierteDatos.obtenerDatos(conversion, Resultado.class);
                    System.out.println(resultado + " COP");
                    break;
                case 6:
                    cantidad();
                    conversion = consumoAPI.obtenerDatos("COP", "USD", cantidad);
                    resultado = convierteDatos.obtenerDatos(conversion, Resultado.class);
                    System.out.println(resultado + " USD");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
        teclado.close();
    }
    private void cantidad(){
        System.out.println("La cantidad a convertir es:");
        cantidad = teclado.nextDouble();
        teclado.nextLine();
    }
}
