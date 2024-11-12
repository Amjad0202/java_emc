import java.util.Scanner;
class compq1{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String RCB = scan.nextLine();



        if (RCB.equals("win")){
            System.out.println("cup namdhey");
        }


        if (RCB.equals("loose")){
            System.out.println("cup illa");
        }

        else {
            System.out.println("wrong input");
        }
    }
}