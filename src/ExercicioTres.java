import java.util.Scanner;

/*
* Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?"
O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
* Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
* entre 3 e 4 como "Cúmplice" e 5 como "Assassino".
* Caso contrário, ele será classificado como "Inocente".
* */

public class ExercicioTres {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);
    int contador = 0;
    int respostas;

    System.out.println("Responda as próximas perguntas com 1 para SIM e 0 para NÂO ");
    System.out.println("Telefonou para a vítima? ");
    respostas = inputUsuario.nextInt();
    contador += respostas;
    System.out.println("Esteve no local do crime? ");
    respostas = inputUsuario.nextInt();
    contador += respostas;
    System.out.println("Mora perto da vítima? ");
    respostas = inputUsuario.nextInt();
    contador += respostas;
    System.out.println("Devia para a vítima? ");
    respostas = inputUsuario.nextInt();
    contador += respostas;
    System.out.println("Já trabalhou com a vítima? ");
    respostas = inputUsuario.nextInt();
    contador += respostas;


    if(contador == 2) {
      System.out.println("Suspeita");
    } else if (contador >= 3 && contador <= 4) {
      System.out.println(" Cúmplice");
    } else if (contador == 5) {
      System.out.println("Assassino");
    } else if (contador == 0 || contador == 1) {
      System.out.println("Inocente");
    }
  }
}
