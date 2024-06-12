package Menu;

import controladores.contDoctor;
import herramientas.Funciones;

public class MenuDoctor {
    public void menuDoctor(){
        int opcion = -2; //Opcion a elegir
        String[] Botones = new String[] {"Ingresar", "Leer", "Actualizar", "Eliminar", "Listar"};
        String mensaje = "Ingresar: Crear/IngresarDoctor\nLeer:Leer mercaderia\nActualizar:Actualizar doctor\nEliminar: Eliminar Doctor\nListar: Crear una lista de doctores";
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

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                default:
                    System.out.println("Cerrando la sistema...");
                    System.exit(0);
                    break;
            }
        }while(opcion != -1);//V
    }
}
