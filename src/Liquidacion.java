public abstract class Liquidacion {
    private String tipoLiquidacion;
    public void setTipo(String nuevoTipoLiquidacion){tipoLiquidacion=nuevoTipoLiquidacion;}
    public String getTipo(){return tipoLiquidacion;}

    //public abstract String getUniversidad();
    public abstract double getTotal();
}
