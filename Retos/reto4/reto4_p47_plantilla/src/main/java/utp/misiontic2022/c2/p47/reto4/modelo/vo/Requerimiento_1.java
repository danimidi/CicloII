package utp.misiontic2022.c2.p47.reto4.modelo.vo;

public class Requerimiento_1 {
    // Su código
    private String Lider;
    private String Cargo;
    private int nProyecto;
    
    public Requerimiento_1(){}

    public Requerimiento_1(String lider, String cargo, int nProyecto) {
        this.Lider = lider;
        this.Cargo = cargo;
        this.nProyecto = nProyecto;
    }

    public String getLider() {
        return Lider;
    }

    public void setLider(String lider) {
        Lider = lider;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public int getnProyecto() {
        return nProyecto;
    }

    public void setnProyecto(int nProyecto) {
        this.nProyecto = nProyecto;
    }
    
    
}
