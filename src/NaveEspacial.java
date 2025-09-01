public class NaveEspacial {
    String nombre;
    int combustible;
    int maxCombustible = 100;

    void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado.");
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    void avanzar(int distancia) {
        int consumo = distancia * 2; // Por ejemplo, 1 distancia consume 2 de combustible
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzo " + distancia + " unidades.");
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " unidades.");
        }
    }

    void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= maxCombustible) {
            combustible += cantidad;
            System.out.println("Recargaste " + cantidad + " unidades de combustible.");
        } else {
            combustible = maxCombustible;
            System.out.println("Recargaste al máximo (" + maxCombustible + ").");
        }
    }

    void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible);
    }
}
