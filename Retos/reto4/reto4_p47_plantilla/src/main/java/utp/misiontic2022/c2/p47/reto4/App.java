package utp.misiontic2022.c2.p47.reto4;

import java.sql.SQLException;
import utp.misiontic2022.c2.p47.reto4.vista.Requerimientos_GUI;

//import utp.misiontic2022.c2.p47.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p47.reto4.vista.VistaRequerimientos;

/**
 * Esta clase solo se debe usar para hacer pruebas locales,
 * no se debe subir en iMaster
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {   /*
        System.out.println("Requerimiento 1");
        VistaRequerimientos.requerimiento1();
        
        //ControladorRequerimientos ejem = new ControladorRequerimientos();
        //System.out.println(ejem.consultarRequerimiento1());
        
        System.out.println("\nRequerimiento 2");
        VistaRequerimientos.requerimiento2();

        System.out.println("\nRequerimiento 3");
        VistaRequerimientos.requerimiento3();
        */
        Requerimientos_GUI.main(args);
        
    }
}
