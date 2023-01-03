import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("introduzca el precio: ");
        float precio = scan.nextFloat();
        float total = precioTotal(precio);
        System.out.println("precio con IVA: "+total);

    }
    public static float precioTotal(float precio){
        return precio*1.12f;
    }
}