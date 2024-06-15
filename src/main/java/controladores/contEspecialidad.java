package controladores;

import entidades.Doctor;
import entidades.Especialidad;
import herramientas.Funciones;
import modelo.ModEspecialidad;

import java.util.List;

public class contEspecialidad {
    ModEspecialidad e = new ModEspecialidad();
    public void crearEspecialidad(){
        Especialidad especialidad = new Especialidad();

        //crear especialidad
        String lector = Funciones.InputDialogNoVacio("Ingrese nombre Especialidad:");
        especialidad.setNombre(lector);

        e.crearEspecialidad(especialidad);
    }

    public void leerEspecialidad(){
        int lector = Funciones.LimitacionNumericaInt("Ingrese id del especialidad:","id",9999,1);
        e.leerEspecialidad(lector);

    }

    public void actualizarEspecialidad(){

    }

    public void eliminarEspecialidad(){
        int lector = Funciones.LimitacionNumericaInt("Ingrese id del Especialidad:","id",9999,1);
        e.eliminarEspecialidad(lector);
    }

    public void listarEspecialidad(){
        List<Especialidad> lista = e.listarEspecialidades();
        for (Especialidad especialidad : lista) {
            especialidad.getNombre();
        }
    }
}
