//two diffenrent comparisions in String. in the first one
//the data will store in stack and it state the value one time
//and point both refrerences to that one value
//but in secound comparision the value is saved in
//heap for both diffent address for the reference

public class difcomp {
    public static void main(String[] args) {
        String a =  "apple";
        String b =  "apple";
        System.out.println(a==b);

        String c = new String ("orange");
        String d = new String ("orange");
        System.out.println(c==d);
    }
}
