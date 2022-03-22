public class GenerarLiquidacion {
    public static void main(String[] args) {
        Liquidacion liquidacionMatriculaEAFIT=new Matricula(new LiquidacionEAFIT());
        System.out.println("El valor de su liquidación de " + liquidacionMatriculaEAFIT.getTipo() + " en EAFIT es " + liquidacionMatriculaEAFIT.getTotal());
        Liquidacion liquidacionInscripcionEAFIT=new Inscripcion(new LiquidacionEAFIT());
        System.out.println("El valor de su liquidación de " + liquidacionInscripcionEAFIT.getTipo() + " en EAFIT es " + liquidacionInscripcionEAFIT.getTotal());
        Liquidacion liquidacionDerechosGradoEAFIT=new DerechosGrado(new LiquidacionEAFIT());
        System.out.println("El valor de su liquidación de " + liquidacionDerechosGradoEAFIT.getTipo() + " en EAFIT es " + liquidacionDerechosGradoEAFIT.getTotal());

        Liquidacion liquidacionMatriculaUNAULA=new Matricula(new LiquidacionUNAULA());
        System.out.println("El valor de su liquidación de " + liquidacionMatriculaUNAULA.getTipo() + " en UNAULA es " + liquidacionMatriculaUNAULA.getTotal());
        Liquidacion liquidacionInscripcionUNAULA=new Inscripcion(new LiquidacionUNAULA());
        System.out.println("El valor de su liquidación de " + liquidacionInscripcionUNAULA.getTipo() + " en UNAULA es " + liquidacionInscripcionUNAULA.getTotal());
        Liquidacion liquidacionDerechosGradoUNAULA=new DerechosGrado(new LiquidacionUNAULA());
        System.out.println("El valor de su liquidación de " + liquidacionDerechosGradoUNAULA.getTipo() + " en UNAULA es " + liquidacionDerechosGradoUNAULA.getTotal());
    }
}
