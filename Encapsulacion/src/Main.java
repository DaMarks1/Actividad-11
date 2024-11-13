import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Vehicle;
        String marca;
        String modelo;
        int anioFabricacion;
        int motores;

        System.out.println("Busca un vehiculo 1.Acuatico o 2.Terrestre?");
        Vehicle = scanner.nextInt();

        if (Vehicle == 1){
            System.out.println("Un vehiculo acuatico");
            scanner.nextLine();
            System.out.println("¿Que marca buscaba?");
            marca = scanner.nextLine();
            System.out.println("¿Que modelo?");
            modelo = scanner.nextLine();
            System.out.println("¿Cual es el año de fabricación?");
            anioFabricacion = scanner.nextInt();
            System.out.println("Cuantos motores?");
            motores = scanner.nextInt();
            Acuatico acuatico = new Acuatico(marca, modelo, anioFabricacion,motores);
            System.out.println(acuatico.mostrarInformacion());
        }else{
            System.out.println("Un vehiculo terrestre");
            scanner.nextLine();
            System.out.println("¿Que marca buscaba?");
            marca = scanner.nextLine();
            System.out.println("¿Que modelo?");
            modelo = scanner.nextLine();
            System.out.println("¿Cual es el año de fabricación?");
            anioFabricacion = scanner.nextInt();
            Terrestre terrestre = new Terrestre(marca, modelo, anioFabricacion);
            System.out.println(terrestre.mostrarInformacion());

        }
        scanner.close();
    }
}
