package AvaliacaoGrupo;

import java.util.Scanner;

public class Imc {
    Scanner sc = new Scanner(System.in);
    public void Exercicio1() {
      
        System.out.println("digite seu nome");
        String nome = sc.nextLine();
        System.out.println("digite sua idade");
        double Idade = sc.nextDouble();
        System.out.println("digite sua Altura ");
        double altura = sc.nextDouble();
        System.out.println("digite seu sexo 1=m ou 2=F");
        double sexo = sc.nextDouble();
        System.out.println("informe seu peso");
        double pesoReal = sc.nextDouble();
        double pesoIdeal;

        if (sexo == 1) {
            pesoIdeal = (62.1 * altura) - 44.7;

        } else {
            pesoIdeal = (72.7 * altura) - 58;
        }
        double peso = pesoReal - (pesoIdeal);
        if (peso > 0) {
            System.out.println(nome + " Precisa Perder" + peso + "Kg");

        } else if (peso < 0) {
            System.out.println(nome + " Precisa Ganhar" + peso + "Kg");

        } else {
            System.out.println(nome + " Está no Peso Ideal");
        }
        System.out.println(nome + " Seu peso ideal deve ser " + pesoIdeal);

        double iMC = pesoReal / (altura * altura);
        if (iMC < 20) {
            System.out.println("necessario ganhar massa muscular");

        } else if (iMC >= 20 && iMC <= 27) {
            System.out.println("peso moderado");

        } else {
            System.out.println("perder peso");

        }

        if (Idade >= 16 && Idade <= 25) {
            System.out.println("Sugestão de Atividades: musculação moderada,musculação leve, luta, dança,ioga ");

        } else if (Idade >= 25 && Idade <= 35) {
            System.out.println(
                    "Sugestão de Atividades: musculação intensa,musculação moderada, luta, dança,ioga,corrida ");

        } else if (Idade >= 36 && Idade <= 45) {
            System.out.println(
                    "Sugestão de Atividades: musculação intensa,musculação moderada, luta, dança,ioga,corrida ");

        } else if (Idade >= 46 && Idade <= 55) {
            System.out.println(
                    "Sugestão de Atividades:musculação moderada,musculação leve, luta, dança,ioga,corrida,pilates ");

        } else if (Idade >= 56 && Idade <= 65) {
            System.out.println("Sugestão de Atividades:musculação leve, dança,ioga,corrida,pilates ");
        } else {
            System.out.println("Sugestão de Atividades:musculação leve, dança,ioga,pilates ");
        }
    }
}