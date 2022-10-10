package Hospital;

public class Paciente {
    private String nombre;
    private String edad;
    private String rut;
//contructor
    public Paciente(String nombre, String edad, String rut){
        this.nombre = nombre;
        this.edad = edad;
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    public String getNombre(){
        return nombre;
    }
    public String getRut(){
        return rut;
    }
    public String getEdad(){
        return edad;
    }
}
