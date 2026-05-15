package application;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        aluno.name = sc.nextLine();
        aluno.grade1 = sc.nextDouble();
        aluno.grade2 = sc.nextDouble();
        aluno.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", aluno.finalGrade());

        if (aluno.finalGrade() < 60.0){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", aluno.missingPoints());
        }
        else {
            System.out.println("PASS");
        }

        sc.close();
    }
}
