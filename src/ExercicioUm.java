import java.util.Scanner;

/*
* Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda,
* que depende do salário bruto (conforme tabela abaixo) e 10% para o INSS e que o FGTS corresponde
* a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita).
* O Salário Líquido corresponde ao Salário Bruto menos os descontos.
* O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
Desconto do IR:
Salário Bruto até 900 (inclusive) - isento
Salário Bruto até 1500 (inclusive) - desconto de 5%
Salário Bruto até 2500 (inclusive) - desconto de 10%
Salário Bruto acima de 2500 - desconto de 20%
Imprima na tela as informações, dispostas conforme o exemplo abaixo.
* No exemplo o valor da hora é 5 e a quantidade de hora é 220.

* */
public class ExercicioUm {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);

    System.out.println("Informe o valor da hora de trabalho: ");
    double valorHora = inputUsuario.nextDouble();
    System.out.println("Informe a quantidade de horas trabalhadas: ");
    double horasTrabalhadas = inputUsuario.nextDouble();

    double inss = 10.0;
    double fgts = 11.0;
    double impostoRenda;
    double descontoImposto;
    double descontoInss;
    double descontoFgts;
    double salarioLiquido;
    double descontos;
    double salarioBruto = valorHora * horasTrabalhadas;

    if(salarioBruto <= 900) {
      System.out.println("Salário Bruto: " + "(" + valorHora + " * " + horasTrabalhadas + " : " + " R$" + salarioBruto);
      System.out.println("Não há descontos!");
    } else if (salarioBruto > 900 && salarioBruto <= 1500) {
      impostoRenda = 5.0;
      descontoImposto = salarioBruto * (impostoRenda / 100);
      descontoInss = salarioBruto * (inss / 100);
      descontoFgts = salarioBruto * (fgts / 100);

      descontos = descontoImposto + descontoInss;
      salarioLiquido = salarioBruto - descontos;

      System.out.println("Salário Bruto: " + "(" + valorHora + " * " + horasTrabalhadas + ") : " + "R$" + salarioBruto);
      System.out.println("(-) IR ("+ impostoRenda +"%)\t\t\t\t" + " : R$" + descontoImposto);
      System.out.println("(-) INSS (10%)\t\t\t\t" + " : R%" + descontoInss);
      System.out.println("FGTS (11%)\t\t\t\t\t" + " : R$" + descontoFgts);
      System.out.println("Total de descontos\t\t\t" + " : R$" + descontos);
      System.out.println("Salário Liquido\t\t\t\t" + " : R$" + salarioLiquido);

    } else if(salarioBruto > 1500 && salarioBruto <= 2500) {
      impostoRenda = 10.0;
      descontoImposto = salarioBruto * (impostoRenda / 100);
      descontoInss = salarioBruto * (inss / 100);
      descontoFgts = salarioBruto * (fgts / 100);

      descontos = descontoImposto + descontoInss;
      salarioLiquido = salarioBruto - descontos;

      System.out.println("Salário Bruto: " + "(" + valorHora + " * " + horasTrabalhadas + ") : " + "R$" + salarioBruto);
      System.out.println("(-) IR ("+ impostoRenda +"%)\t\t\t\t" + " : R$" + descontoImposto);
      System.out.println("(-) INSS (10%)\t\t\t\t" + " : R%" + descontoInss);
      System.out.println("FGTS (11%)\t\t\t\t\t" + " : R$" + descontoFgts);
      System.out.println("Total de descontos\t\t\t" + " : R$" + descontos);
      System.out.println("Salário Liquido\t\t\t\t" + " : R$" + salarioLiquido);
    } else if(salarioBruto > 2500) {
      impostoRenda = 20.0;
      descontoImposto = salarioBruto * (impostoRenda / 100);
      descontoInss = salarioBruto * (inss / 100);
      descontoFgts = salarioBruto * (fgts / 100);

      descontos = descontoImposto + descontoInss;
      salarioLiquido = salarioBruto - descontos;

      System.out.println("Salário Bruto: " + "(" + valorHora + " * " + horasTrabalhadas + ") : " + "R$" + salarioBruto);
      System.out.println("(-) IR ("+ impostoRenda +"%)\t\t\t\t" + " : R$" + descontoImposto);
      System.out.println("(-) INSS (10%)\t\t\t\t" + " : R%" + descontoInss);
      System.out.println("FGTS (11%)\t\t\t\t\t" + " : R$" + descontoFgts);
      System.out.println("Total de descontos\t\t\t" + " : R$" + descontos);
      System.out.println("Salário Liquido\t\t\t\t" + " : R$" + salarioLiquido);
    }
  }
}
