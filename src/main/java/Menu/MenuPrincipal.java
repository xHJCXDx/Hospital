package Menu;

import controladores.contDoctor;
import controladores.contEspecialidad;
import controladores.contHospital;
import controladores.contPaciente;
import herramientas.Funciones;

import java.awt.*;

public class MenuPrincipal {
    public void mostrarMenuPrincipal() {

        int opcion = -2; //Opcion a elegir
        String[] Botones = new String[] {"Doctor", "Especialidad", "Hospital", "Paciente"};
        String mensaje = "Doctor: Abrir menu de doctor\nEspecialidad: menu de especialidad\nHospital: menu de hospital\nPaciente: menu de paciente";
        String titulo ="MENU GENERAL";

        //------------------------------------OPCIONES-------------------------------------------
        do{
            opcion = Funciones.OpcionesMenu(Botones, mensaje, titulo)+1;
            switch (opcion) {
                case 1:
                    menuDoctor();
                    break;
                case 2:
                    menuEspecialidad();
                    break;
                case 3:
                    menuPaciente();
                    break;
                case 4:
                    menuHospital();
                    break;
                default:
                    System.out.println("Cerrando la sistema...");
                    System.exit(0);
                    break;
            }
        }while(opcion != -1);//V
    }

    public void menuDoctor(){
        int opcion = -2; //Opcion a elegir
        String[] Botones = new String[] {"Ingresar", "Leer", "Actualizar", "Eliminar", "Listar"};
        String mensaje = "Ingresar: Crear/Ingresar Doctor\nLeer: Leer doctor\nActualizar: Actualizar doctor\nEliminar: Eliminar doctor\nListar: Crear una lista de doctores";
        String titulo ="MENU DOCTOR";
        contDoctor controlador = new contDoctor();

        //------------------------------------OPCIONES-------------------------------------------
        do{
            opcion = Funciones.OpcionesMenu(Botones, mensaje, titulo)+1;
            switch (opcion) {
                case 1:
                    controlador.crearDoctor();
                    break;
                case 2:
                    controlador.leerDoctor();
                    break;
                case 3:
                    controlador.actualizarDoctor();
                    break;
                case 4:
                    controlador.eliminarDoctor();
                    break;
                case 5:
                    controlador.listarDoctor();
                    break;
                case 6:
                    mostrarMenuPrincipal();
                    break;
                default:
                    System.out.println("Cerrando la sistema...");
                    System.exit(0);
                    break;
            }
        }while(opcion != -1);//V
    }

    public void menuEspecialidad(){
        int opcion = -2; //Opcion a elegir
        String[] Botones = new String[] {"Ingresar", "Leer", "Actualizar", "Eliminar", "Listar"};
        String mensaje = "Ingresar: Crear/Ingresar especialidad\nLeer: Leer especialidad\nActualizar: Actualizar especialidad\nEliminar: Eliminar especialidad\nListar: Crear una lista de especialidad";
        String titulo ="MENU ESPECIALIDAD";
        contEspecialidad controlador = new contEspecialidad();

        //------------------------------------OPCIONES-------------------------------------------
        do{
            opcion = Funciones.OpcionesMenu(Botones, mensaje, titulo)+1;
            switch (opcion) {
                case 1:
                    controlador.crearEspecialidad();
                    break;
                case 2:
                    controlador.leerEspecialidad();
                    break;
                case 3:
                    controlador.actualizarEspecialidad();
                    break;
                case 4:
                    controlador.eliminarEspecialidad();
                    break;
                case 5:
                    controlador.listarEspecialidad();
                    break;
                case 6:
                    mostrarMenuPrincipal();
                    break;
                default:
                    System.out.println("Cerrando la sistema...");
                    System.exit(0);
                    break;
            }
        }while(opcion != -1);//V
    }

    public void menuPaciente(){
        int opcion = -2; //Opcion a elegir
        String[] Botones = new String[] {"Ingresar", "Leer", "Actualizar", "Eliminar", "Listar"};
        String mensaje = "Ingresar: Crear/Ingresar paciente\nLeer: Leer paciente\nActualizar: Actualizar paciente\nEliminar: Eliminar paciente\nListar: Crear una lista de paciente";
        String titulo ="MENU PACIENTE";
        contPaciente controlador = new contPaciente();

        //------------------------------------OPCIONES-------------------------------------------
        do{
            opcion = Funciones.OpcionesMenu(Botones, mensaje, titulo)+1;
            switch (opcion) {
                case 1:
                    controlador.crearPaciente();
                    break;
                case 2:
                    controlador.leerPaciente();
                    break;
                case 3:
                    controlador.actualizarPaciente();
                    break;
                case 4:
                    controlador.eliminarPaciente();
                    break;
                case 5:
                    controlador.listarPaciente();
                    break;
                case 6:
                    mostrarMenuPrincipal();
                    break;
                default:
                    System.out.println("Cerrando la sistema...");
                    System.exit(0);
                    break;
            }
        }while(opcion != -1);//V
    }

    public void menuHospital(){
        int opcion = -2; //Opcion a elegir
        String[] Botones = new String[] {"Ingresar", "Leer", "Actualizar", "Eliminar", "Listar"};
        String mensaje = "Ingresar: Crear/Ingresar hospital\nLeer: Leer hospital\nActualizar: Actualizar hospital\nEliminar: Eliminar hospital\nListar: Crear una lista de hospital";
        String titulo ="MENU HOSPITAL";
        contHospital controlador = new contHospital();

        //------------------------------------OPCIONES-------------------------------------------
        do{
            opcion = Funciones.OpcionesMenu(Botones, mensaje, titulo)+1;
            switch (opcion) {
                case 1:
                    controlador.crearHospital();
                    break;
                case 2:
                    controlador.leerHospital();
                    break;
                case 3:
                    controlador.actualizarHospital();
                    break;
                case 4:
                    controlador.eliminarHospital();
                    break;
                case 5:
                    controlador.listarHospital();
                    break;
                case 6:
                    mostrarMenuPrincipal();
                    break;
                default:
                    System.out.println("Cerrando la sistema...");
                    System.exit(0);
                    break;
            }
        }while(opcion != -1);//V
    }
}
