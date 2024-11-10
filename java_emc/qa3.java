
//4. Get Input for 3 variables: Name, Score, department. Let the user
//enter the score for 100 Marks, you convert it for 10 and print it.

import java.util.Scanner;

public class qa3 {
    public static void main (String[]args){
        Scanner var = new Scanner(System.in);

        String name = var.nextLine();


        double score = var.nextInt();
        var.nextLine();

        String department = var.nextLine();

        System.out.println(name);
        System.out.println(score);
        System.out.println(department);
        System.out.println(score/10);
    }
}
