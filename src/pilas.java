public class pilas {

    int tope = 0, maximo;
    String pilaComida[];

    public pilas(int maximo) {
        this.maximo = maximo;
        this.pilaComida = new String[maximo];
    }

    public void agregarComida(String comida) {
        if (tope < maximo) {
            pilaComida[tope] = comida;
            tope++;
            System.out.println("El dato ha sido agregado");
        } else {
            System.out.println("La pila se encuentra llena");
        }
    }

    public void eliminarComida() {
        if (tope > 0) {
            System.out.println("El dato ha sido eliminado");
            tope--;
        } else {
            System.out.println("No hay datos en la pila");
        }
    }

    public boolean estavacia() {

        if (tope <= 0) {
            return true;
        } else {
            return false;
        }

    }

    public String encontrar(String comida) {
        var encontrado = "";
        if (!estavacia()) {
            for (int i = (tope - 1); i >= 0; i--) {
                if (pilaComida[i] == comida) {
                    encontrado = pilaComida[i];
                } else {
                    System.out.println("No existe el dato que ingresó");

                }
            }
        } else {
            System.out.println("La pila esta vacia");
        }

        return "El dato encontrado es: " + encontrado;
    }

    public void mostrar() {
        if (!estavacia()) {
            for (int i = (tope - 1); i >= 0; i--) {

                System.out.println("Datos: " + pilaComida[i]);

            }
        } else {
            System.out.println("La pila está vacía");
        }
    }
}
