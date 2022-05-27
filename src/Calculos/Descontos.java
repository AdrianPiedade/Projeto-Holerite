
package Calculos;

public class Descontos {
    
    public double calcularDescontos(double bruto, int horaExtra) {
        
        IRPF ir = new IRPF();
        INSS in = new INSS();
        ValeTransporte vt = new ValeTransporte();
        ValeAlimentacao va = new ValeAlimentacao();
        ValeRefeicao vr = new ValeRefeicao();
        ConvenioMedico cm = new ConvenioMedico();
        double descontos = ir.calcularIRPF(bruto, horaExtra)+ in.calcularINSS(bruto, horaExtra)+ vt.calcularVT(bruto) + va.calcularVA(bruto) + vr.calcularVR(bruto) + cm.calcularCM(bruto);
        return descontos;
    }
    
}
