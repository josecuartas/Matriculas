public class DerechosGrado extends Liquidacion{
    Liquidacion liquidacion;
    public DerechosGrado(Liquidacion nuevaLiquidacion) {
        liquidacion=nuevaLiquidacion;
        setTipo("DerchosGrado");
        liquidacion.setTipo("DerechosGrado");
    }
    //public String getUniversidad(){return liquidacion.getUniversidad();}
    public double getTotal(){return liquidacion.getTotal();}
}
