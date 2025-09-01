public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    void mostrarInfo(){
        nombre = "Santiago";
        apellido = "Arroquigaray";
        curso = "Comision 16";
        System.out.println(nombre + " " + apellido + " " + curso + " " + calificacion);
    }
    
       void subirCalificacion(double nuevaCalificacion){
           if(nuevaCalificacion >= 0 || nuevaCalificacion <= 10){
               calificacion += nuevaCalificacion;
           }
       }
       
       void bajarCalificacion(double nuevaCalificacion){
           if(nuevaCalificacion >= 0 || nuevaCalificacion <= 10){
               calificacion -= nuevaCalificacion;
           }
       }
}
