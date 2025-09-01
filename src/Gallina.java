public class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;

    void ponerHuevo() {
        huevosPuestos++;
    }

    void envejecer() {
        edad++;
    }

    void mostrarEstado() {
        System.out.println("Gallina " + idGallina + " | Edad: " + edad + " | Huevos puestos: " + huevosPuestos);
    }
}
