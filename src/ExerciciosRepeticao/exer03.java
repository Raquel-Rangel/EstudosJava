package ExerciciosRepeticao;

import java.util.Scanner;

public class exer03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i=1; i<=n; i++){
            if (n % 1 == 0){
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
