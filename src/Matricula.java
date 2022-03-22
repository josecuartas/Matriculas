public class Matricula extends Liquidacion {
    Liquidacion liquidacion;
    public Matricula(Liquidacion nuevaLiquidacion) {
        liquidacion=nuevaLiquidacion;
        setTipo("Matricula");
        liquidacion.setTipo("Matricula");
    }
    //public String getUniversidad(){return liquidacion.getUniversidad();}
    public double getTotal(){
        return liquidacion.getTotal();
    }
}