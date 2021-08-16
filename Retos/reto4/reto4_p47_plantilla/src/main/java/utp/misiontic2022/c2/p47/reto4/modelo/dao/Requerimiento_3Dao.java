package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {
    
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        // Su código
        ArrayList<Requerimiento_3> lista3 = new ArrayList<>();
        Requerimiento_3 reque3 = null;
        String sql = "SELECT ID_Proyecto, Ciudad, Clasificacion, Costo_Proyecto "+ 
        " from ( "+
        " SELECT ID_Proyecto, sum(Cantidad*Precio_Unidad) as Costo_Proyecto "+
        " FROM MaterialConstruccion mc "+ 
        " join Compra c using(ID_MaterialConstruccion) "+
        " group by ID_Proyecto "+
        " ) join Proyecto using(ID_Proyecto) "+
        " where Costo_Proyecto > 70000 and ID_Proyecto in (SELECT ID_Proyecto FROM Proyecto where Ciudad in ('Monteria', 'Santa Marta')) "+
        " order by Ciudad, Clasificacion;";
        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ) {
            while(rs.next()){
                reque3 = new Requerimiento_3();
                reque3.setID_Proyecto(rs.getInt("ID_Proyecto"));
                reque3.setCiudad(rs.getString("Ciudad"));
                reque3.setClasificacion(rs.getString("Clasificacion"));
                reque3.setCosto_Proyecto(rs.getInt("Costo_Proyecto"));

                lista3.add(reque3);
            }
        } 

        return lista3;

    }  
}