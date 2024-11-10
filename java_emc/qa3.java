import java.util.Scanner;


class qa3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double age = scan.nextInt();
        scan.nextLine();
        String department = scan.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age/10);
        System.out.println("Department: " + department);
    }
}

//4. Get Input for 3 variables: Name, Score, department. Let the user enter the score for 100 Marks, you convert it for 10 and print it.