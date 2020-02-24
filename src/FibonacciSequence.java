import java.util.Scanner;

public class FibonacciSequence {

    static Scanner input;
    static int number;

    public static void main (String[] args) {
        input = new Scanner(System.in);
        System.out.println("Input an Integer Value: ");
        Scanner scanInput;
        number = input.nextInt();
        fibFunction(number);
    }

    public static void fibFunction(int val){
        int num;
        int first=0;
        int second=1;
        int upcoming;

        for (num=0;num<val;++num){
            if (num<=1){
                upcoming=num;
            }
            else{
                upcoming=first+second;
                first=second;
                second=upcoming;
            }

            System.out.println("Values: "+first+", "+second+"and "+upcoming);
            System.out.println("-->" +upcoming);
        }
    }

}