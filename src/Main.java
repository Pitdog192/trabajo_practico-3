public class Main {
    
    public static void ejercicio1(){
        Estudiante estudiante1 = new Estudiante();
        estudiante1.mostrarInfo();
        
        estudiante1.subirCalificacion(5);
        estudiante1.mostrarInfo();
        
        estudiante1.bajarCalificacion(3);
        estudiante1.mostrarInfo();
    }
        
    public static void ejercicio2(){
        Mascota mascota = new Mascota();
        mascota.mostrarInfo();
        mascota.cumplirAnos(15);
        mascota.mostrarInfo();
    }
            
    public static void ejercicio3(){
        Libro miLibro = new Libro();
        miLibro.titulo = "Asesinato en el Orient Express";
        miLibro.autor = "Agatha Christie";
        miLibro.setAnoPublicacion(1934);

        miLibro.mostrarInformacion();

        miLibro.setAnoPublicacion(2030);
        miLibro.mostrarInformacion();

        miLibro.setAnoPublicacion(1982);
        miLibro.mostrarInformacion();
    }
                
    public static void ejercicio4(){
        Gallina g1 = new Gallina();
        g1.idGallina = 1;
        g1.edad = 2;
        g1.huevosPuestos = 0;

        Gallina g2 = new Gallina();
        g2.idGallina = 2;
        g2.edad = 1;
        g2.huevosPuestos = 0;

        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();

        g2.ponerHuevo();
        g2.envejecer();
        g2.envejecer();

        g1.mostrarEstado();
    
        g2.mostrarEstado();
    }
                    
    public static void ejercicio5(){
        NaveEspacial nave = new NaveEspacial();
        nave.nombre = "Apolo";
        nave.combustible = 50;

        nave.mostrarEstado();

        nave.avanzar(20);       // intentar avanzar sin recargar -> debería fallar
        nave.despegar();        // gastar 10 en el despegue
        nave.mostrarEstado();

        nave.recargarCombustible(40); // recargar combustible
        nave.mostrarEstado();

        nave.avanzar(15);       // ahora sí puede avanzar
        nave.mostrarEstado();
    }
    
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
    }
}
