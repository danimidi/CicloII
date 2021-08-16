package utp.misiontic2022.c2.p47.reto4.vista;

import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.controlador.ControladorRequerimientos;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        try {
            ArrayList<Requerimiento_1> registros1 = controlador.consultarRequerimiento1();
            for (Requerimiento_1 requerimiento : registros1) {
                System.out.printf("%s %s %d\n",
                requerimiento.getLider(),
                requerimiento.getCargo(),
                requerimiento.getnProyecto()
                );
            }
            // Su código
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2(){
        try {
            ArrayList<Requerimiento_2> registros2 = controlador.consultarRequerimiento2();
            for (Requerimiento_2 requerimiento : registros2) {
                System.out.printf("%s %s %d %d %d\n",
                requerimiento.getID_MaterialConstruccion(),
                requerimiento.getNombre_Material(),
                requerimiento.getCantidad(),
                requerimiento.getPrecio_Unidad(),
                requerimiento.getPrecio_Total()
                );
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        try {
            ArrayList<Requerimiento_3> registros3 = controlador.consultarRequerimiento3();
            for (Requerimiento_3 requerimiento : registros3) {
                System.out.printf("%d %s %s %d\n",
                requerimiento.getID_Proyecto(),
                requerimiento.getCiudad(),
                requerimiento.getClasificacion(),
                requerimiento.getCosto_Proyecto()
                );
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
}
