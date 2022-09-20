import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        pilas pila = new pilas(5);
        var opcion = 0;
        var comida = "";
        var buscado = "";
        do {
            System.out.println("==============================================");
            System.out.println("=================Menù de opciones=============");
            System.out.println("=================1. (Llenar Pila)===============");
            System.out.println("=================2. (Mostrar pila)==============");
            System.out.println("=================3. (Buscar)==============");
            System.out.println("=================5. (Salir)=====================");
            System.out.println("=================Elija una opción ===========");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa la comida");
                    comida = sc1.nextLine();
                    pila.agregarComida(comida);

                    break;
                case 2:
                    pila.mostrar();
                    break;

                case 3:
                    System.out.println("Ingresa la comida a buscar");
                    buscado = sc2.nextLine();
                    System.out.println(pila.encontrar(buscado));
                    break;

            }

        } while (opcion != 5);

        sc1.close();
        sc2.close();
        sc.close();

    }
}
