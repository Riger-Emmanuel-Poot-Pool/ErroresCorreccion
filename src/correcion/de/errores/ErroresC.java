
package correcion.de.errores;

public class ErroresC {
    private double ValorReal, ValorAproximado;

    public ErroresC(double NumeroReal, double NumeroAproximado) {
        ValorReal = NumeroReal;
        ValorAproximado = NumeroAproximado;
    }
    
    public double ErrorAbsoluto(){
      double ErrorA = Math.abs(ValorReal - ValorAproximado);
      return ErrorA;  
    }
    
    public double ErrorRelativo(double ErrorA){
      double ErrorR = ErrorA/ValorReal;  
      return ErrorR;  
    }
    
    public double ErrorRelativoPorcentual(double ErrorR){
      double ErrorRP = ErrorR * 100;
      return ErrorRP;  
    }
}
