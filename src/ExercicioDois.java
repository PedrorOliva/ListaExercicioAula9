import java.text.DecimalFormat;
import java.util.Scanner;

/*
* Um posto está vendendo combustíveis com a seguinte tabela de descontos:
Álcool:
até 20 litros, desconto de 3% por litro
acima de 20 litros, desconto de 5% por litro
Gasolina:
até 20 litros, desconto de 4% por litro
acima de 20 litros, desconto de 6% por litro
 Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível
* (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente
* sabendo-se que o preço do litro da gasolina é R$ 2,50 e o preço do litro do álcool é R$ 1,90.

* */
public class ExercicioDois {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);
    DecimalFormat fomatter = new DecimalFormat("#.##");

    double qtdLitros;
    double totalSemDesconto;
    double totalComDesconto;
    double desconto;

    System.out.println("Escolha o tipo de combústivel: ");
    System.out.println("G - gasolina");
    System.out.println("A - álcool");
    String escolha = inputUsuario.next().toUpperCase();

    switch(escolha) {
      case "A":
        System.out.println("Informe a quantidade de litros que deseja comprar: ");
        qtdLitros = inputUsuario.nextFloat();
        totalSemDesconto = qtdLitros * 1.90;
        System.out.println(totalSemDesconto);
        if (qtdLitros <= 20) {
          desconto = totalSemDesconto * (3.0 / 100);
          totalComDesconto = totalSemDesconto - desconto;
          System.out.println("Total a pagar: R$" + (fomatter.format(totalComDesconto)));
        } else if (qtdLitros > 20) {
          desconto = totalSemDesconto * (6.0 / 100);
          totalComDesconto = totalSemDesconto - desconto;
          System.out.println("Total a pagar: R$" + (fomatter.format(totalComDesconto)));
        }
        break;
      case "G":
        System.out.println("Informe a quantidade de litros que deseja comprar: ");
        qtdLitros = inputUsuario.nextFloat();
        totalSemDesconto = qtdLitros * 2.50;

        if (qtdLitros <= 20) {
          desconto = totalSemDesconto * (4.0 / 100);
          totalComDesconto = totalSemDesconto - desconto;
          System.out.println("Total a pagar: R$" + (fomatter.format(totalComDesconto)));
        } else if (qtdLitros > 20) {
          desconto = totalSemDesconto * (6.0 / 100);
          totalComDesconto = totalSemDesconto - desconto;
          System.out.println("Total a pagar: R$" + (fomatter.format(totalComDesconto)));
        }
        break;
      default:
        System.out.println("Escolha uma opção válida!!");
    }
  }
}
