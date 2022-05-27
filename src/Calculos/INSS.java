
package Calculos;

public class INSS {
    
    public double calcularINSS (double bruto, int horaExtra){
        
        HoraExtra hr = new HoraExtra();
        double aliquotaIN, descontoIN;
        double baseINSS = bruto + hr.calcularHoraExtra(bruto, horaExtra);
        
        if (baseINSS < 1212.01) {
            aliquotaIN = 7.5;
            descontoIN = baseINSS/100*aliquotaIN;
            return descontoIN;
            
        } else if (baseINSS < 2427.36) {
            aliquotaIN = 9;
            descontoIN = baseINSS/100*aliquotaIN;
           return descontoIN;
            
        } else if (baseINSS < 3641.04) {
            aliquotaIN = 12;
            descontoIN = baseINSS/100*aliquotaIN;
            return descontoIN;
             
        } else {
            aliquotaIN = 14;
            descontoIN = baseINSS/100*aliquotaIN;
            return descontoIN;
        }
    }
    
}
