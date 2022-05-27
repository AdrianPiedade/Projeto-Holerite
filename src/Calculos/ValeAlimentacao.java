
package Calculos;

public class ValeAlimentacao {
    
    public double calcularVA (double bruto){
        
        double valeAlimentacao;
        
        if (bruto > 3636){
            
            valeAlimentacao = bruto/100*2;
            return valeAlimentacao;
                    
        }else{
            
            valeAlimentacao = 0;
            return valeAlimentacao;
        }
    }
    
}
