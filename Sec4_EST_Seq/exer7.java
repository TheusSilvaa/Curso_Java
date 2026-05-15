import java.util.Scanner;

public class exer7 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int inteiro;

        System.out.println("Numero inteiro?");
        inteiro = sc.nextInt();

        if (inteiro >= 0){
            System.out.println("Não negativo");
        }
        else if (inteiro < 0){
            System.out.println("Negativo");
        }




        sc.close();
    }
}
