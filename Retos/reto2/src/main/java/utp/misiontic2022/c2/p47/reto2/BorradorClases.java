package utp.misiontic2022.c2.p47.reto2;

public class BorradorClases {
    
}
//DESDE AQUI TOMAS EL CODIGO
/*
public class PrecioTotal{
    // Atributos
    Double totalCafe;
    Double totalCafeNacional;
    Double totalCafeExportacion;
    Cafe[] listaCafe;
    // Constructor
    PrecioTotal(){
        this.totalCafe = 0.0;
        this.totalCafeNacional = 0.0;
        this.totalCafeExportacion = 0.0;
        this.listaCafe = null;
    }
    PrecioTotal(Cafe[] listaCafe) {
        totalCafe = 0.0;
        totalCafeNacional = 0.0;
        totalCafeExportacion = 0.0;
        for(int i = 0; i < listaCafe.length; i++){
            totalCafe += listaCafe[i].calcularPrecio();
            if(String.valueOf(listaCafe[i].getClass().getSimpleName()).equals("CafeNacional")){
                totalCafeNacional += listaCafe[i].calcularPrecio();
            }else if(String.valueOf(listaCafe[i].getClass().getSimpleName()).equals("CafeExportacion")){
                totalCafeExportacion += listaCafe[i].calcularPrecio();
            }else{
                continue;
            }  
        }
    

    }
    public void mostrarTotales() {
        System.out.println("La suma del precio del café es de " + totalCafe);
        System.out.println("La suma del precio del café tipo nacional es de " + totalCafeNacional);
        System.out.print("La suma del precio del café tipo exportación es de " + totalCafeExportacion);
    }


}

public class Cafe {
    // Constantes y Atributos
    Integer PESO_BASE = 5;
    char CALIDAD_C_BASE = 'F';
    Double PRECIO_BASE = 100.0;
    Integer peso;
    char calidadC;
    Double precioBase;
    int adicion;
  

    //Constructores
    public Cafe(){
    this.calidadC = CALIDAD_C_BASE;
    this.peso = PESO_BASE;
    this.precioBase = PRECIO_BASE;
    }
   
    public Cafe(Double precioBase, Integer peso){
        this.calidadC = CALIDAD_C_BASE;
        this.precioBase = precioBase;
        this.peso = peso;
    }
   
    public Cafe(Double precioBase, Integer peso, char calidadC){
        this.precioBase = precioBase;
        this.peso = peso;
        this.calidadC = calidadC;
    }
   
    // Metodos
    public void comprobarCalidadC(char calidadC){
        if(calidadC == 'A') 
        {
            this.adicion = 10;
        }else if(calidadC == 'B'){
            this.adicion = 8;
        }else if(calidadC == 'C'){
            this.adicion = 6;
        }else if(calidadC == 'D'){
            this.adicion = 5;
        }else if(calidadC == 'E'){
            this.adicion = 3;
        }else if(calidadC == 'F'){
            this.adicion = 1;
        }else{
            this.adicion = 1;
        }
    }

    //tener en cuenta el mayor igual 19
    public void comprobarPeso(Integer peso){
        if(peso >= 0 & peso < 19){
            this.adicion = adicion + 10;
        }else if(peso >= 19 & peso < 49){
            this.adicion = adicion + 50;
        }else if(peso >= 49 & peso < 80){
            this.adicion = adicion + 80;
        }else{
            this.adicion = adicion + 100;
        }
    }


    public Double calcularPrecio(){
        this.comprobarCalidadC(calidadC);
        this.comprobarPeso(peso);
        return precioBase + adicion;
    }
}

public class CafeNacional extends Cafe{
    // Constantes y Atributos
    boolean TOSTADO = false;
    boolean tostado;
    //Constructor
    public CafeNacional(){
        this.peso = PESO_BASE;
        this.precioBase = PRECIO_BASE;
        this.calidadC = CALIDAD_C_BASE;
        this.tostado = TOSTADO;
    }
    
    public CafeNacional(Double precioBase, Integer peso){
        this.calidadC = CALIDAD_C_BASE;
        this.precioBase = precioBase;
        this.peso = peso;
        this.tostado = TOSTADO;
    // Código
    }
    public CafeNacional(Double precioBase, Integer peso, char calidadC, boolean tostado){
        this.precioBase = precioBase;
        this.peso = peso;
        this.calidadC = calidadC;
        this.tostado = tostado;
        // Código
    }
    
    // Métodos
    public Double calcularPrecio(){
        this.comprobarCalidadC(calidadC);
        this.comprobarPeso(peso);
        if(tostado){
            return precioBase + adicion + 50;
        }else{
            return precioBase + adicion;
        }
    }
}

public class CafeExportacion extends Cafe{
    // Constantes y Atributos
    Integer CIF_BASE = 20;
    Integer cif;
    boolean verde;
    double adicionV;
    double adicionC;
    //Constructor
    public CafeExportacion(){
        this.peso = PESO_BASE;
        this.precioBase = PRECIO_BASE;
        this.calidadC = CALIDAD_C_BASE;
        this.cif = CIF_BASE;
        this.verde = false;
    }
   
    public CafeExportacion(Double precioBase, Integer peso){
        this.calidadC = CALIDAD_C_BASE;
        this.precioBase = precioBase;
        this.peso = peso;
        this.cif = CIF_BASE;
        this.verde = false;
    }
   
    public CafeExportacion(Double precioBase, Integer peso, char calidadC, Integer cif, boolean verde){
        this.precioBase = precioBase;
        this.peso = peso;
        this.calidadC = calidadC;
        this.cif = cif;
        this.verde = verde;
    }
   
    // Métodos
    public Double calcularPrecio(){
        this.comprobarCalidadC(calidadC);
        this.comprobarPeso(peso);
        if(verde){
            this.adicionV = 50.0;
        }else {
            this.adicionV = 0.0;
        }
        if(cif > 40){
            this.adicionC = precioBase * 30/100;
        }else{
            this.adicionC = 0.0;
        }
        return precioBase + adicionV + adicionC + adicion;
    }

}
   
public static void main( String[] args )
{   //PRUEBA CAFE
    
    Cafe cafe[]=new Cafe[5];
    cafe[0]=new Cafe(250.0, 50, 'D'); //335
    cafe[1]=new CafeNacional(180.0, 30);  //231
    cafe[2]=new CafeExportacion(550.0, 80, 'B', 42, false);  //823
    cafe[3]=new Cafe();  //111
    cafe[4]=new Cafe(550.0, 20, 'D');  //605
    PrecioTotal solucion1 = new PrecioTotal(cafe);
    solucion1.mostrarTotales();
    System.out.println("\n----------------------------------------");
    
    //PRUEBA CAFE2
    Cafe cafe2[]=new Cafe[10];
    cafe2[0]=new Cafe(250.0, 50, 'D');  //335 
    cafe2[1]=new CafeNacional(180.0, 30);   //231 
    cafe2[2]=new CafeExportacion(550.0, 80, 'B', 42, false);  //823  
    cafe2[3]=new Cafe();  //111 
    cafe2[4]=new Cafe(550.0, 20, 'D');  //605 
    cafe2[5]=new CafeNacional(300.0, 40, 'c', true);  //406
    cafe2[6]=new CafeExportacion(250.0, 70); //351  
    cafe2[7]=new CafeNacional(400.0, 100, 'B', true); //558  
    cafe2[8]=new CafeExportacion(250.0, 50, 'D', 30, true);  //405 pero da 385 ahora 
    cafe2[9]=new Cafe(50.0, 10); //61 
    PrecioTotal solucion2 = new PrecioTotal(cafe2);
    solucion2.mostrarTotales();
    System.out.println();
    
}

*/