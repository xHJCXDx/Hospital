package Menu;

import herramientas.Funciones;

import java.awt.*;

public class MenuPrincipal {
    public void mostrarMenuPrincipal() {

        int opcion = -2; //Opcion a elegir
        String[] Botones = new String[] {"Doctor", "Ingresar", "Pago P", "Consulta", "Balance", "Comanda", "Pago C", "Información" };
        String mensaje = "Doctor: Abrir menu del doctor\nIngresar:Ingreso de mercadería\nPago:Pago a proveedor\nPago P: Pago a proveedor\nConsulta:Consulta de ventas\nBalance:Balance (mostrar ganancias y pérdidas)\nComanda:Solicitar una comanda a la cocina.\nPago C: Pagar cuenta\n Información: Informacion estadística de platos más pedidos.";
        String titulo ="MENU GENERAL";

        //------------------------------------OPCIONES-------------------------------------------
        do{
            opcion = Funciones.OpcionesMenu(Botones, mensaje, titulo)+1;
            switch (opcion) {
                case 1:
                    MenuDoctor md = new MenuDoctor();
                    md.menuDoctor();
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
