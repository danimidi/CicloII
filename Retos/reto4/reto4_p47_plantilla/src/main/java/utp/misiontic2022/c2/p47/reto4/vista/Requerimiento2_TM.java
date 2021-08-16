/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p47.reto4.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;

/**
 *
 * @author NELSY MIRAMAG
 */
public class Requerimiento2_TM extends  AbstractTableModel{
private List<Requerimiento_2> requ2;
    
    public Requerimiento2_TM(){
        this(new ArrayList<>());
    }
    public Requerimiento2_TM(List<Requerimiento_2> requ2){
        this.requ2 = requ2;
    }
    

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "ID_MaterialConstruccion";
            case 1:
                return  "Nombre_Material";
            case 2:
                return  "Cantidad";
            case 3:
                return  "Precio_Unidad";
            case 4:
                return  "Precio_Total";
        }
        return super.getColumnName(column);
    }

    
    
    @Override
    public int getRowCount() {
        return requ2.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Requerimiento_2 req2 = requ2.get(row);
        switch(column){
            case 0:
                return req2.getID_MaterialConstruccion();
            case 1:
                return  req2.getNombre_Material();
            case 2:
                return  req2.getCantidad();
            case 3:
                return  req2.getPrecio_Unidad();
            case 4:
                return  req2.getPrecio_Total();    
        }
        return null;
    }
    
    
}
