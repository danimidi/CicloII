package utp.misiontic2022.c2.p47.reto2;

public class Reto2borrador {
    
   
    public static class PrecioTotal {
        private Double totalCafe = 0.0;
        private Double totalCafeExportacion = 0.0;
        private Double totalCafeNacional = 0.0;
        private Cafe[] listaCafe;

        // Constructor
        PrecioTotal(Cafe[] pElectrodomesticos) {
            this.listaCafe = pElectrodomesticos;
        }

        public void mostrarTotales() {
            for (int i = 0; i < listaCafe.length; i++) {

                if (listaCafe[i] instanceof Cafe) {
                    totalCafe += listaCafe[i].calcularPrecio();
                }
                if (listaCafe[i] instanceof CafeNacional) {
                    totalCafeNacional += listaCafe[i].calcularPrecio();
                }
                if (listaCafe[i] instanceof CafeExportacion) {
                    totalCafeExportacion += listaCafe[i].calcularPrecio();
                }
            }

            // Mostramos los resultados
            System.out.println("La suma del precio de los electrodomésticos es de " + totalCafe);
            System.out.println("La suma del precio de las lavadoras es de " + totalCafeNacional);
            System.out.print("La suma del precio de las televisiones es de " + totalCafeExportacion);
        }
    }

    public static class Cafe {
        protected final static char CALIDAD_C='F';
        protected final static Double PRECIO_BASE=100.0;
        protected final static Integer PESO_BASE=5;
        
        protected Double precioBase;
        protected char calidadC;
        protected Integer peso;

        //Constructores
        public Cafe(){
            this(PRECIO_BASE, PESO_BASE, CALIDAD_C);
        }
    
        public Cafe(Double precioBase, Integer peso){
            this(precioBase, peso, CALIDAD_C);
        }
    
        public Cafe(Double precioBase, Integer peso, char calidadC){
            this.precioBase=precioBase;
            this.peso=peso;
            comprobarCalidadC(calidadC);
        }
    
        // Metodos
        public void comprobarCalidadC(char calidadC){
            if(calidadC>=65 && calidadC<=70){
                this.calidadC=calidadC;
            }else{
                this.calidadC=CALIDAD_C;
            }
        }

        public Double calcularPrecio(){
            Double adicion=0.0;
            switch(calidadC){
                case 'A':
                    adicion+=10.0;
                    break;
                case 'B':
                    adicion+=8.0;
                    break;
                case 'C':
                    adicion+=6.0;
                    break;
                case 'D':
                    adicion+=5.0;
                    break;
                case 'E':
                    adicion+=3.0;
                    break;
                case 'F':
                    adicion+=1.0;
                    break;
            }
    
            if(peso>=0 && peso<19){
                adicion+=10.0;
            }else if(peso>=20 && peso<49){
                adicion+=50.0;
            }else if(peso>=50 && peso<=79){
                adicion+=80.0;
            }else if(peso>=80){
                adicion+=100.0;
            }
    
            return precioBase+adicion;
        }

        public Double getPrecioBase() {
            return precioBase;
        }

        public char getCalidadC() {
            return calidadC;
        }

        public Integer getPeso() {
            return peso;
        }
    
    }

    public static class CafeNacional extends Cafe{
        private final static boolean TOSTADO = false;

        private boolean tostado;

        //Constructor
        public CafeNacional(){
            this(PRECIO_BASE, PESO_BASE, CALIDAD_C, TOSTADO);
        }
    
        public CafeNacional(Double precioBase, Integer peso){
            this(precioBase, peso, CALIDAD_C, TOSTADO);
        }
    
        public CafeNacional(Double precioBase, Integer peso, char calidadC, boolean tostado){
            super(precioBase, peso, calidadC);
            this.tostado=tostado;
        }
    
        // Métodos
        public Double calcularPrecio(){
            Double adicion=super.calcularPrecio();
            if (tostado==true){
                adicion+=50.0;
            }
    
            return adicion;
        }

        public boolean getTostado() {
            return tostado;
        }
    }

    public static class CafeExportacion extends Cafe{
        private final static Integer CIF_BASE=20;
        
        private Integer cif;
        private boolean verde;

        //Constructor
        public CafeExportacion(){
            this(PRECIO_BASE, PESO_BASE, CALIDAD_C, CIF_BASE, false);
        }
    
        public CafeExportacion(Double precioBase, Integer peso){
            this(precioBase, peso, CALIDAD_C, CIF_BASE, false);
        }
    
        public CafeExportacion(Double precioBase, Integer peso, char calidadC, Integer cif, boolean verde){
            super(precioBase, peso, calidadC);
            this.cif=cif;
            this.verde=verde;
        }
    
        // Métodos
        public Double calcularPrecio(){
            Double adicion=super.calcularPrecio();
            if (cif>40){
                adicion+=precioBase*0.3;
            }
            if (verde){
                adicion+=50.0;
            }
    
            return adicion;
        }
    }

    public static void main( String[] args )
    {   //PRUEBA CAFE
        /*
        Cafe cafe[]=new Cafe[5];
        cafe[0]=new Cafe(250.0, 50, 'D'); //335
        cafe[1]=new CafeNacional(180.0, 30);  //231
        cafe[2]=new CafeExportacion(550.0, 80, 'B', 42, false);  //823
        cafe[3]=new Cafe();  //111
        cafe[4]=new Cafe(550.0, 20, 'D');  //605
        PrecioTotal solucion1 = new PrecioTotal(cafe);
        solucion1.mostrarTotales();
        System.out.println("\n----------------------------------------");
        */
        
        //PRUEBA CAFE2
        Cafe cafe2[]=new Cafe[1];
        //cafe2[0]=new Cafe(250.0, 50, 'D');  //335  b
        //cafe2[1]=new CafeNacional(180.0, 30);   //231 b
        //cafe2[2]=new CafeExportacion(550.0, 80, 'B', 42, false);  //823 b
        //cafe2[3]=new Cafe();  //111 
        //cafe2[4]=new Cafe(550.0, 20, 'D');  //605 
        //cafe2[5]=new CafeNacional(300.0, 40, 'c', true);  //406 deberia ser ->401   ver c minuscula
        //cafe2[6]=new CafeExportacion(250.0, 70); //351  deberia ser -> 331 cif base no se tuvo en cuenta
        //cafe2[7]=new CafeNacional(400.0, 100, 'B', true); //558 b 
        //cafe2[8]=new CafeExportacion(250.0, 50, 'D', 30, true);  //405   deberia ser -> 385 ya me da pero...
        //cafe2[9]=new Cafe(50.0, 10); //61 b
        PrecioTotal solucion2 = new PrecioTotal(cafe2);
        solucion2.mostrarTotales();
        System.out.println();
        
    }
}
