
package Calculos;

public class Vencimentos {
    
   
    public double calcularVencimentos(double bruto, int horaExtra, double bonus1, double bonus2, double bonus3){
        
        HoraExtra hr = new HoraExtra();
        
        double vencimentos = bruto + hr.calcularHoraExtra(bruto, horaExtra)+ bonus1 + bonus2 + bonus3;
                
        return vencimentos;
    }
    
}
