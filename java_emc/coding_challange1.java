//Get input for Variable Mark. If mark > 35 print pass. Else Print fail.


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
