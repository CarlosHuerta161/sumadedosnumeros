public class person{
    String nombre;
    int edad;
    String correo;

    public person (String nombre, int edad, String correo){
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }
    public void informacion() {
        System.out.println("nombre: "+ nombre);
        System.out.println("edad: "+ edad);
        System.out.println("correo: "+ correo);
    }
}