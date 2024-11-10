//3.Get input for 3 integer variables: a,b and c. Now multiply all varables and
//store it in d. Now add all variables and store it in e. Now divide d by e.

import java.util.Scanner;

class qa2 {
    public static void main (String[]args){
        Scanner inc = new Scanner(System.in);
        int a = inc.nextInt();
        int b = inc.nextInt();
        int c = inc.nextInt();
        int d = (a*b*c);
        int e = (a+b+c);
        System.out.println(d/e);
    }
}