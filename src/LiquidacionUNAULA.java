import javax.swing.*;
public class LiquidacionUNAULA extends Liquidacion implements LiquidacionServicio{
    private String tipo;
    public void setTipo(String nuevoTipo){tipo=nuevoTipo;}
    public String getTipo(){return tipo;}
    private static double matricula=80;
    public double getTotal() {
        switch (getTipo()) {
            case "Matricula":
                int certificado= JOptionPane.showConfirmDialog(null,"Tiene certificado electoral para Matrícula en UNAULA");
                if (certificado==0){
                    matricula-=10;
                    return matricula;
                }else{
                    return matricula;
                }
            case "Inscripcion":
                return 40;
            case "DerechosGrado":
                return matricula*0.2;
            default:
                return 0;
        }
    }
}
