//get input from out side and make the comparision whether the integers are equal or not


import java.util.Scanner;
public class scancomp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();


        if (num1==num2){
            System.out.println("number is equal");

        }
        else{
            System.out.println("number is not equal");
        }


    }
    
}
