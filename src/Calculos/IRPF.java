
package Calculos;

public class IRPF {
    
    public double calcularIRPF (double bruto, int horaExtra){
        
        INSS in = new INSS();
        HoraExtra he = new HoraExtra();
        double aliquotaIR, descontoIR;
        double baseIRPF = bruto + he.calcularHoraExtra(bruto, horaExtra) - in.calcularINSS(bruto, horaExtra);
        
        if (baseIRPF < 1903.99) {
            aliquotaIR = 0;
            descontoIR = baseIRPF/100*aliquotaIR;
            return descontoIR;
            
        } else if (baseIRPF< 2826.66) {
            aliquotaIR = 7.5;
            descontoIR = baseIRPF/100*aliquotaIR;
           return descontoIR;
            
        } else if (baseIRPF < 3751.07) {
            aliquotaIR = 15;
            descontoIR = baseIRPF/100*aliquotaIR;
            return descontoIR;
            
        } else if (baseIRPF < 4664.69) {
            aliquotaIR = 22.5;
            descontoIR = baseIRPF/100*aliquotaIR;
            return descontoIR;
            
        } else {
            aliquotaIR = 27.5;
            descontoIR = baseIRPF/100*aliquotaIR;
            return descontoIR;
        }
    }
}
