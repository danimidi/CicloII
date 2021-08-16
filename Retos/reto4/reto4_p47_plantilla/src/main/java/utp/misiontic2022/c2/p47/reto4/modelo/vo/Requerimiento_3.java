package utp.misiontic2022.c2.p47.reto4.modelo.vo;

public class Requerimiento_3 {
    // Su código
    private int ID_Proyecto;
    private String Ciudad;
    private String Clasificacion;
    private int Costo_Proyecto;

    public Requerimiento_3(){};
    
    public Requerimiento_3(int iD_Proyecto, String ciudad, String clasificacion, int costo_Proyecto) {
        this.ID_Proyecto = iD_Proyecto;
        this.Ciudad = ciudad;
        this.Clasificacion = clasificacion;
        this.Costo_Proyecto = costo_Proyecto;
    }


    public int getID_Proyecto() {
        return ID_Proyecto;
    }
    public void setID_Proyecto(int iD_Proyecto) {
        ID_Proyecto = iD_Proyecto;
    }
    public String getCiudad() {
        return Ciudad;
    }
    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }
    public String getClasificacion() {
        return Clasificacion;
    }
    public void setClasificacion(String clasificacion) {
        Clasificacion = clasificacion;
    }
    public int getCosto_Proyecto() {
        return Costo_Proyecto;
    }
    public void setCosto_Proyecto(int costo_Proyecto) {
        Costo_Proyecto = costo_Proyecto;
    }
    
}
