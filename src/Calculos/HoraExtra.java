package Calculos;

public class HoraExtra {

    public double calcularHoraExtra(double bruto, int horaExtra) {

        double valorHora, valorHoraExtra, meio;

        valorHora = bruto / 220;
        meio = valorHora / 2;
        valorHoraExtra = (valorHora + meio)* horaExtra;
        return valorHoraExtra;

    }

}
