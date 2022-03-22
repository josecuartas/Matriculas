public class Inscripcion extends Liquidacion{
    Liquidacion liquidacion;
    public Inscripcion(Liquidacion nuevaLiquidacion) {
        liquidacion=nuevaLiquidacion;
        setTipo("Inscripcion");
        liquidacion.setTipo("Inscripcion");
    }
    //public String getUniversidad(){return liquidacion.getUniversidad();}
    public double getTotal(){return liquidacion.getTotal();}
}

