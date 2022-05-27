
package Calculos;

public class ValeRefeicao {
    
    public double calcularVR (double bruto){
        
        double valeRefeicao;
        
        if (bruto < 1213){
            
            valeRefeicao = 0;
            return valeRefeicao;
                    
        }else{
            
            valeRefeicao = bruto/100*3;
            return valeRefeicao;
        }
    }
    
}
