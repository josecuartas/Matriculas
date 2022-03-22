import javax.swing.*;
public class LiquidacionEAFIT extends Liquidacion implements LiquidacionServicio{
    //String universidad="EAFIT";
    //public String getUniversidad() { return this.universidad; }
    private String tipo;
    public void setTipo(String nuevoTipo){tipo=nuevoTipo;}
    public String getTipo(){return tipo;}
    private final double matricula=100;
    public double getTotal() {
        switch (getTipo()) {
            case "Matricula":
                return matricula;
            case "Inscripcion":
                int certificado= JOptionPane.showConfirmDialog(null,"Tiene certificado electoral para Inscripción en EAFIT");
                return (certificado==0) ? 40 : 50;
            case "DerechosGrado":
                return matricula*0.15;
            default:
                return 0;
        }
    }
}
