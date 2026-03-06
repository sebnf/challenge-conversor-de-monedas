import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaAPI consulta = new ConsultaAPI();

        int opcion=0;
        while (opcion!=8){
            System.out.println("**********************\n\n"+
                    "Bienvenido usuario, este es el conversor de monedas\n\n"+
                    "Ingrese el número correspondiente a su consulta\n\n"+
                    "1. Dolar a peso Chileno\n"+
                    "2. Peso Chileno a Dolar\n"+
                    "3. Dolar a Real Brasilero\n"+
                    "4. Real Brasilero a Dolar\n"+
                    "5. Dolar a peso Argentino\n"+
                    "6. Peso Argentino a Dolar\n"+
                    "7. Convertir otra moneda\n"+
                    "8. Salir\n");
            opcion= lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    ConversorAPP.convertir("USD","CLP",consulta, lectura);
                    break;
                case 2:
                    ConversorAPP.convertir("CLP","USD", consulta, lectura);
                    break;
                case 3:
                    ConversorAPP.convertir("USD","BRL", consulta, lectura);
                    break;
                case 4:
                    ConversorAPP.convertir("BRL","USD", consulta, lectura);
                    break;
                case 5:
                    ConversorAPP.convertir("USD","ARS", consulta, lectura);
                    break;
                case 6:
                    ConversorAPP.convertir("ARS","USD", consulta, lectura);
                    break;
                case 7:
                    ConversorAPP.convertirOtraMoneda(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;


                default:
                    System.out.println("Opcion no valida!");
                    break;
            }
        }

    }
}