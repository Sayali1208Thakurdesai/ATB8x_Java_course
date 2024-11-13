package Sept20th_Homework;

public class maxnumber {
    public static void main(String[] args) {
        //By using Ternary Operators max between 3 numbers.
        //Input int - a,b,c - a = 10, b = 20, c = 45
        //Max → a,b,c → c

        int a= 10;
        int b= 20;
        int c= 45;
// a-b, b-c, a-c
        int max= (a>b)?((b>c) ? b:c):(a>c?a:c);
        System.out.println("Max number is:"+   max);

    }

}
