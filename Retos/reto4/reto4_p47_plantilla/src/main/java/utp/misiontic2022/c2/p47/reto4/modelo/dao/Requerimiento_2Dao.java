package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        // Su código
        ArrayList<Requerimiento_2> lista2 = new ArrayList<>();;
        Requerimiento_2 reque2 = null;
        String sql = "SELECT ID_MaterialConstruccion, Nombre_Material, Cantidad, Precio_Unidad, Cantidad*Precio_Unidad as Precio_Total "
        +" FROM MaterialConstruccion mc "+
        " join Compra c using(ID_MaterialConstruccion) "+
        " WHERE ID_Proyecto in(10,14,23,24,38,50,29) "+
        " ORDER by ID_Proyecto ASC , Precio_Unidad DESC ;";
        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ) {
            while(rs.next()){
                reque2 = new Requerimiento_2();
                reque2.setID_MaterialConstruccion(rs.getString("ID_MaterialConstruccion"));
                reque2.setNombre_Material(rs.getString("Nombre_Material"));
                reque2.setCantidad(rs.getInt("Cantidad"));
                reque2.setPrecio_Unidad(rs.getInt("Precio_Unidad"));
                reque2.setPrecio_Total(rs.getInt("Precio_Total"));

                lista2.add(reque2);
            }
            
        } 

        return lista2;
    }
    
}