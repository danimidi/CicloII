/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p47.reto4.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;

/**
 *
 * @author NELSY MIRAMAG
 */
public class Requerimiento1_TM extends AbstractTableModel{
    
    private List<Requerimiento_1> requ1;
    
    public Requerimiento1_TM(){
        this(new ArrayList<>());
    }
    public Requerimiento1_TM(List<Requerimiento_1> requ1){
        this.requ1 = requ1;
    }
    

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "Lider";
            case 1:
                return  "Cargo";
            case 2:
                return  "# Proyectos";
        }
        return super.getColumnName(column);
    }

    
    
    @Override
    public int getRowCount() {
        return requ1.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Requerimiento_1 req1 = requ1.get(row);
        switch(column){
            case 0:
                return req1.getLider();
            case 1:
                return  req1.getCargo();
            case 2:
                return  req1.getnProyecto();
        }
        return null;
    }
    
   
    
}
