/* input for Variable Mark. If mark > 35 print pass. Else Print fail.



import java.util.Scanner;

public class coding_challange1 {
    public static void main(String[] args) {
        Scanner mark = new Scanner(System.in);
        int mark1 = mark.nextInt();

        if (mark1>35){
            System.out.println("pass");

        }

        else{
            System.out.println("fail");
        }
    }
    
}

*/


/* 
Q2: Get input for Variable Income. if Income is
greater than 7000 scholarship is available.
Else not eligible for scholarship.
import java.util.Scanner;

class coding_challange1{
    public static void main(String[] args) {
        Scanner income = new Scanner(System.in);
        int income1 = income.nextInt();

        if (income1>7000){
            System.out.println("Scholarship is available");
        }

        else{
            System.out.println("not elidgible");
        }

    }
}
    */


/*Get input for a number and check whether it is
divisible by both 3 and 5 or not. if yes then
print, the number is divisible by 3 and 5 print
the number is not divisible by 3 and 5. */

/* 
import java.util.Scanner;

class coding_challange1{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();

        if (num1%3==0&&num1%5==0)
        
            System.out.println("divisable 3 and 5");
        


        else {
            System.out.println("not divisible by 3 and 5");
        }
    }
}
*/


/*
class coding_challange1{
    public static void main(String[] args) {
        
        boolean cricket = false;
        boolean football =false;

        if (cricket||football){
            System.out.println("play");
        }

        else {
            System.out.println("not playing");
        }
    }
}
     */


/* 
//check a number that can divisable 3
import java.util.Scanner;

class coding_challange1{
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        int num1=num.nextInt();

        if(num1%3==0){
            System.out.println("divisable");
        }
        else{
            System.out.println("not divisable");
        }
    }
}
    */

//get input for a number and find it is even or odd number

import java.util.Scanner;

class coding_challange1{
    public static void main(String[] args) {
        
        Scanner getting = new Scanner(System.in);
        int get1 = getting.nextInt();

        if (get1%2==0){
            System.out.println("an odd number");
        }
        else{
            System.out.println("its an odd");
        }
    }
}