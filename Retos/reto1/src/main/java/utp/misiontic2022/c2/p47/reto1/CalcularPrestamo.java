package utp.misiontic2022.c2.p47.reto1;


public class CalcularPrestamo {
    // Atributos
    // static int estatico = 10;  //Compartido
    // final String CONSTANTE = "Constante";  //HEREDABLE
    // static final String ESTATICO = "Estático y constante";  //HEREDABLE y compartido
    // public String publico = "el atributo es público";  //HEREDABLE
    // private String privado = "es un atributo privado";  //NO_heredable
    // protected String protegido = "protegido";

    private double pMonto;
    private double pInteres;
    private int pTiempo;
    private Double interesSimple;
    private Double interesCompuesto;

    //Constructores

    public CalcularPrestamo(){
        this.pMonto = 0.0;
        this.pInteres = 0.0;
        this.pTiempo = 0;
    }
    public CalcularPrestamo(int pTiempo, double pMonto, double pInteres){
        this.pMonto = pMonto;
        this.pInteres = pInteres;
        this.pTiempo = pTiempo;
        
    }

    //Métodos
   
    public double calcularInteresSimple(){
        this.interesSimple = pMonto * (pInteres/100) * pTiempo;
        return Math.round(interesSimple);
    }

    public double calcularInteresCompuesto(){
        this.interesCompuesto = pMonto * ((Math.pow(1+(pInteres/100), pTiempo))-1);
        return Math.round(interesCompuesto);
    }

    public double compararPrestamo( int pTiempo, double pMonto, double pInteres ) {
        this.pTiempo = pTiempo;
        this.pMonto = pMonto;
        this.pInteres = pInteres;
        this.calcularInteresSimple();
        this.calcularInteresCompuesto();
        Double comparar = interesCompuesto - interesSimple;
        //OTRA FORMA------------
        //Double comparar = (new CalcularPrestamo(pTiempo, pMonto, pInteres).calcularInteresCompuesto()) - (new CalcularPrestamo(pTiempo, pMonto, pInteres).calcularInteresSimple());
        //OTRA FORMA
        // CalcularPrestamo simple = new CalcularPrestamo();
        // CalcularPrestamo compuesto = new CalcularPrestamo();
        // Double comparar = compuesto.calcularInteresCompuesto() - simple.calcularInteresSimple();
        return Math.round(comparar);
    }

    public double compararPrestamo() {
        this.calcularInteresSimple();
        this.calcularInteresCompuesto();
        Double comparar = interesCompuesto - interesSimple;
        //OTRA FORMA
        //Double comparar = interesCompuesto - (new CalcularPrestamo(pTiempo, pMonto, pInteres).calcularInteresSimple() );
        //return "EL RESULTADO DE COMPARAR LA IVERSION ES: " + (double) Math.round(comparar) +" PARA TENER EN CUENTA";
        return Math.round(comparar);

    }  
     
    
    
   
    public static void main ( String[] args) {
        CalcularPrestamo resultadoInversion = new CalcularPrestamo();
        //CalcularPrestamo resultadoInversion = new CalcularPrestamo(24, 5000000.0, 4.2 );

        //resultadoInversion.calcularInteresCompuesto();
        //resultadoInversion.calcularInteresSimple();

        //System.out.println(resultadoInversion.compararPrestamo());
        System.out.println(resultadoInversion.compararPrestamo(24, 5000000.0, 4.2 ));  //3381321
        


        //System.out.println("el interes compuesto es:"+ (double) resultadoInversion.calcularInteresCompuesto()+" y el interes simple es de:" +resultadoInversion.calcularInteresSimple());
        
        System.out.println();

        }
       
        


}
