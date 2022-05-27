
package Calculos;

public class ConvenioMedico {
    
    public double calcularCM (double bruto) {
        
        double convenioMedico;
        
        if (bruto < 1213){
            
            convenioMedico = 0;
            return convenioMedico;
                    
        }else{
            
            convenioMedico = bruto/100*4;
            return convenioMedico;
        }
    }
    
}
