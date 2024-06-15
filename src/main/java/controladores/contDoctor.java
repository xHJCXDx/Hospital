package controladores;

import entidades.Doctor;
import entidades.Especialidad;
import herramientas.Funciones;
import modelo.ModDoctor;
import modelo.ModEspecialidad;

import javax.swing.*;
import java.util.List;

public class contDoctor {
    ModDoctor controladorD = new ModDoctor();
    public void crearDoctor(){
        Doctor d = new Doctor();

        ModEspecialidad e = new ModEspecialidad();

        //crear doctor
        String lector = Funciones.InputDialogNoVacio("Ingrese Nombre del doctor:");
        d.setNombre(lector);
        int numero = Funciones.LimitacionNumericaInt("Ingrese numero de Lista de Paciente","Lista de Paciente",9999,1);
        d.setListaPacientes(numero);


        int num = Funciones.LimitacionNumericaInt("Ingrese id Especialidad:","id",999999,1);
        Especialidad especialidad = e.leerEspecialidad(num);

        if(especialidad != null){
            JOptionPane.showMessageDialog(null,"Doctor asignado");
            d.setEspecialidad(especialidad);

            controladorD.crearDoctor(d);
        }else {
            JOptionPane.showMessageDialog(null,"No se a encontrado Especialidad\nIntente nuevamente");
        }
    }

    public void leerDoctor(){
        int lector = Funciones.LimitacionNumericaInt("Ingrese id del doctor:","id",9999,1);
        controladorD.leerDoctor(lector);
    }

    public void actualizarDoctor(){
        int lector = Funciones.LimitacionNumericaInt("Ingrese id del doctor:","id",9999,1);
        Doctor d = controladorD.leerDoctor(lector);
        d.ObtenerDatos();
        d.setNombre(Funciones.InputDialogNoVacio("Ingrese Nombre del doctor:"));
        d.setListaPacientes(Funciones.LimitacionNumericaInt("Ingrese numero de Lista de Paciente","Lista de Paciente",9999,1));
        d.setEspecialidad(new Especialidad());
        d.getEspecialidad().setNombre(Funciones.InputDialogNoVacio("Ingrese Especialidad:"));
        controladorD.actualizarDoctor(d);
    }

    public void eliminarDoctor(){
        int lector = Funciones.LimitacionNumericaInt("Ingrese id del doctor:","id",9999,1);
        controladorD.eliminarDoctor(lector);

    }

    public void listarDoctor(){
        List<Doctor> lista = controladorD.listarDoctores();
        for (Doctor doctor : lista) {
            doctor.ObtenerDatos();
        }

    }
}
