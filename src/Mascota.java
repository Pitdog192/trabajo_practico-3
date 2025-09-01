public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    
    void mostrarInfo(){
        nombre = "Firu";
        especie= "Caniche";
        System.out.println(nombre + " " + especie + " " + edad);
    }
    
    void cumplirAnos(int anos){
         if(anos > 0 || anos != 0){
             edad += anos;
         }
    }
}
