package Hospital;
import java.util.*;
public class Registro {
    private List<Paciente> pacientes;
    public Registro() {
        this.pacientes = new ArrayList<Paciente>();
    }
    public boolean agregarPacientes (String nombre, String edad,  String rut){
        if(ValidarRut.validarDigito(rut)){
            Paciente paciente = new Paciente(nombre, edad, rut);
            this.pacientes.add(paciente);
            return true;
        }
        return false;
    }
    public boolean removerPaciente(String nombre, String edad,  String rut){
        for(Paciente paciente : this.pacientes) {
            if (paciente.getNombre().equals(nombre) && paciente.getEdad().equals(edad) && paciente.getRut().equals(rut)){
                this.pacientes.remove(paciente);
                return true;
            }
        }
        return false;
    }
    public ArrayList<Paciente> pacientesMayores(){
        ArrayList<Paciente> pacientesMayores = new ArrayList<>();
        for(int i=0; i <pacientes.size(); i++){
            if(this.pacientes.get(i).getEdad() > 60){
                pacientesMayores.add(pacientes.get(i));
            }
        }

    }

    public Paciente buscarPaciente(String nombre){
        for(Paciente paciente : this.pacientes) {
            if (paciente.getNombre().equals(nombre)) {
                return paciente;
            }
        }
        return null;
    }
    
}
