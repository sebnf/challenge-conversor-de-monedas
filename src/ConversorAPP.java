import java.util.Scanner;

public class ConversorAPP {

    public static void convertir (String monedaBase, String monedaTarget, ConsultaAPI consultar, Scanner lectura){
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consultar.buscarMonedas(monedaBase, monedaTarget);
        System.out.println("\n"+"La tasa de conversion de hoy es:\n1 "+monedaBase+"= " +monedas.conversion_rate()+" "+monedaTarget+"\n");
        System.out.println("Ingresa la cantidad "+monedaBase+":");
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad+" "+monedaBase + "= " + cantidadConvertida+" Tasa de conversión: "+ monedas.conversion_rate());
    }
    public static  void convertirOtraMoneda(ConsultaAPI consultar, Scanner lectura){
        System.out.println("Ingrese el codigo de la moneda base: ");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la Moneda objetivo: ");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consultar,lectura);
    }
}