package App;

import java.util.Scanner;
import Calculos.*;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        IRPF ir = new IRPF();
        INSS in = new INSS();
        HoraExtra hr = new HoraExtra();
        ValeTransporte vt = new ValeTransporte();
        ValeAlimentacao va  = new ValeAlimentacao();
        ValeRefeicao vr = new ValeRefeicao();
        ConvenioMedico cm = new ConvenioMedico();
        Vencimentos sl = new Vencimentos();
        Descontos ds = new Descontos();
        int op = 0, pHoraExtra = 0, pBonus = 0, horaExtra = 0, contagem = 1;
        double bruto, bonus1 = 0, bonus2 = 0, bonus3 = 0;
        String nBonus1 = null, nBonus2 = null, nBonus3 = null, nomeFuncionario;

        for (int i = 1; i <= 1; i++) {

            while (op != 2) {

                try {
                    System.out.printf("\t\t\t --Holerite %d-- ", contagem);
                    System.out.print("\nOpções:\n\n 1-[Novo Funcionário]\n 2-[Sair]\n\nDigite Aqui: ");
                    op = (int) sc.nextDouble();

                    if (op == 2) {
                        break;
                    } else if (op != 1) {
                        System.out.println("\nOpção Inválida!");
                        continue;
                    }
                    System.out.print("\nDigite o nome do Funcionário.: ");
                    sc.nextLine();
                    nomeFuncionario = sc.nextLine();
                } catch (InputMismatchException ex) {
                    System.out.println("\nÉ necessário digitar 1 ou 2.\n");
                    sc.nextLine();
                    continue;
                }

                do {

                    try {

                        System.out.print("\nHá adicional de hora extra?: \n\n1-[Sim] \n2-[Não]\n\nDigite Aqui: ");
                        pHoraExtra = (int) sc.nextDouble();

                        switch (pHoraExtra) {

                            case 1 -> {
                                System.out.println("\nDigite quantas horas extras o funcionário trabalhou este mês: ");
                                horaExtra = sc.nextInt();
                                break;
                            }
                            case 2 -> {
                                horaExtra = 0;
                                break;
                            }
                            default -> {
                                System.out.println("Opção inválida!\n");
                                break;
                            }
                        }
                    } catch (InputMismatchException ex) {
                        System.out.println("\nÉ necessário digitar 1 ou 2. \n");
                        sc.nextLine();
                    }

                } while (pHoraExtra != 1 && pHoraExtra != 2);

                do {

                    try {

                        System.out.print("\nHá mais algum bônus salarial?: \n\n1-[Sim, mais 1 bônus] \n2-[Sim, mais 2 bônus] \n3-[Sim, mais 3 bônus] \n4-[Não]\n\nDigite aqui: ");
                        pBonus = (int) sc.nextDouble();

                        switch (pBonus) {

                            case 1 -> {
                                System.out.println("\nDigite o nome do bônus.: ");
                                sc.nextLine();
                                nBonus1 = sc.nextLine();
                                System.out.println("\nDigite o valor do bônus.: ");
                                bonus1 = sc.nextDouble();
                                break;
                            }
                            case 2 -> {
                                System.out.println("\nDigite o nome do 1º bônus.: ");
                                sc.nextLine();
                                nBonus1 = sc.nextLine();
                                System.out.println("\nDigite o valor do 1º bônus.: ");
                                bonus1 = sc.nextDouble();
                                System.out.println("\nDigite o nome do 2º bônus.: ");
                                sc.nextLine();
                                nBonus2 = sc.nextLine();
                                System.out.println("\nDigite o valor do 2º bônus.: ");
                                bonus2 = sc.nextDouble();
                                break;
                            }
                            case 3 -> {
                                System.out.println("\nDigite o nome do 1º bônus.: ");
                                sc.nextLine();
                                nBonus1 = sc.nextLine();
                                System.out.println("\nDigite o valor do 1º bônus.: ");
                                bonus1 = sc.nextDouble();
                                System.out.println("\nDigite o nome do 2º bônus.: ");
                                sc.nextLine();
                                nBonus2 = sc.nextLine();
                                System.out.println("\nDigite o valor do 2º bônus.: ");
                                bonus2 = sc.nextDouble();
                                System.out.println("\nDigite o nome do 3º bônus.: ");
                                sc.nextLine();
                                nBonus3 = sc.nextLine();
                                System.out.println("\nDigite o valor do 3º bônus.: ");
                                bonus3 = sc.nextDouble();
                                break;
                            }
                            case 4 -> {
                                break;
                            }
                            default ->
                                System.out.println("\nOpção Inválida!\n");
                        }
                    } catch (InputMismatchException ex) {
                        System.out.println("\nÉ necessário digitar 1 ou 2. \n");
                        sc.nextLine();
                    }

                } while (pBonus != 1 && pBonus != 2 && pBonus != 3 && pBonus != 4);

                System.out.println("\nDigite o salário bruto do funcionário.: ");
                bruto = sc.nextDouble();

                System.out.println("-------------------------------------------------------");
                System.out.println("|\t\t\t = HOLERITE = \t\t\t|");
                System.out.println("-------------------------------------------------------");
                System.out.println("|\t\t\t\t\t\t\t|");
                System.out.printf("|Nome:\t\t\t %s\t\t\t|\n", nomeFuncionario);
                System.out.println("|\t\t\t\t\t\t\t|");
                System.out.println("|CRÉDITOS: - \t\t\t\t\t\t|");
                System.out.printf("|Salário Bruto:\t\t\t\t R$ %.2f\t|\n", bruto);
                System.out.printf("|Horas Extra:\t\t\t\t R$ %.2f\t|\n", hr.calcularHoraExtra(bruto, horaExtra));

                switch (pBonus) {
                    case 1 -> {
                        System.out.printf("|%s:\t\t\t\t R$ %.2f\t|\n", nBonus1, bonus1);
                    }
                    case 2 -> {
                        System.out.printf("|%s:\t\t\t\t R$ %.2f\t|\n", nBonus1, bonus1);
                        System.out.printf("|%s:\t\t\t\t R$ %.2f\t|\n", nBonus2, bonus2);
                    }
                    case 3 -> {
                        System.out.printf("|%s:\t\t\t\t R$ %.2f\t|\n", nBonus1, bonus1);
                        System.out.printf("|%s:\t\t\t\t R$ %.2f\t|\n", nBonus2, bonus2);
                        System.out.printf("|%s:\t\t\t\t R$ %.2f\t|\n", nBonus3, bonus3);
                    }
                }

                System.out.println("|\t\t\t\t\t\t\t|");
                System.out.printf("|TOTAL VENCIMENTOS:\t\t\t R$ %.2f\t|\n", sl.calcularVencimentos(bruto, horaExtra, bonus1, bonus2, bonus3));
                System.out.println("|\t\t\t\t\t\t\t|");
                System.out.println("|DÉBITOS: - \t\t\t\t\t\t|");
                System.out.printf("|Desconto INSS:\t\t\t\t R$ %.2f\t|\n", in.calcularINSS(bruto, horaExtra));
                System.out.printf("|Desconto IRPF:\t\t\t\t R$ %.2f\t|\n", ir.calcularIRPF(bruto, horaExtra));
                System.out.printf("|Desconto Vale Transporte:\t\t R$ %.2f\t|\n", vt.calcularVT(bruto));
                System.out.printf("|Desconto Vale Refeição:\t\t R$ %.2f\t|\n", vr.calcularVR(bruto));
                System.out.printf("|Desconto Vale Alimentação:\t\t R$ %.2f\t|\n", va.calcularVA(bruto));
                System.out.printf("|Desconto Convênio Médico:\t\t R$ %.2f\t|\n", cm.calcularCM(bruto));
                System.out.println("|\t\t\t\t\t\t\t|");
                System.out.printf("|TOTAL DESCONTOS:\t\t\t R$ %.2f\t|\n", ds.calcularDescontos(bruto, horaExtra));
                System.out.println("|\t\t\t\t\t\t\t|");
                System.out.println("-------------------------------------------------------");
                System.out.println("|\t\t\t\t\t\t\t|");
                System.out.printf("|Salário Líquido:\t\t\t R$ %.2f\t|\n", sl.calcularVencimentos(bruto, horaExtra, bonus1, bonus2, bonus3) - ds.calcularDescontos(bruto, horaExtra));
                System.out.println("|\t\t\t\t\t\t\t|");
                System.out.println("-------------------------------------------------------\n\n");
                contagem++;

            }
            System.out.println("\n\n\n\t --Código feito por:-- \nAdrian Piedade\nGabriel Pereira\nGuilherme Cunha\nMatheus Pinto\nRafaela Amaral \n\t--Obrigado por usar!--\t\n\n\n");
        }
    }

}
