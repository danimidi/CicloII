package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_1Dao {

    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        // Su código
        Requerimiento_1 registro = null;
        ArrayList<Requerimiento_1> registros1 = new ArrayList<>();
        String sql = "SELECT Nombre || ' ' || Primer_Apellido as Lider, Cargo, count(ID_Proyecto) as '# Proyectos' from Lider join Proyecto p using (ID_Lider) WHERE Constructora like 'Arquitectura S.A.' group by Cargo, Lider;";
        
        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ) {
            while(rs.next()){
                //registro = new Requerimiento_1(rs.getString("Lider"), rs.getString("Cargo"), rs.getInt("# Proyectos"));
                registro = new Requerimiento_1();
                registro.setLider(rs.getString("Lider"));
                registro.setCargo(rs.getString("Cargo"));
                registro.setnProyecto(rs.getInt("# Proyectos"));
                
                registros1.add(registro);
            }    
        }

        return registros1;

    }
}