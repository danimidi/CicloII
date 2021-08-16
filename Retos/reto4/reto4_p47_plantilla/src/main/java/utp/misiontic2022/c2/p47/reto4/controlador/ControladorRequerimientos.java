package utp.misiontic2022.c2.p47.reto4.controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.dao.Requerimiento_1Dao;
import utp.misiontic2022.c2.p47.reto4.modelo.dao.Requerimiento_2Dao;
import utp.misiontic2022.c2.p47.reto4.modelo.dao.Requerimiento_3Dao;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;

public class ControladorRequerimientos {
    private Requerimiento_1Dao req1;
    private Requerimiento_2Dao req2;
    private Requerimiento_3Dao req3;

    public ControladorRequerimientos(){
        this.req1 = new Requerimiento_1Dao();
        this.req2 = new Requerimiento_2Dao();
        this.req3 = new Requerimiento_3Dao();

    };

    // Su código
    
    public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
        // Su código
        return req1.requerimiento1();

    }
    
    public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
        return req2.requerimiento2();
    }
    
    public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
        return req3.requerimiento3();
    }
    
}
