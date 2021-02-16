import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        BigInteger result=BigInteger.ONE;

        for(int i=1;i<=number;++i){
           result=result.multiply(BigInteger.ONE.valueOf(i));
        }
        System.out.println("Factorial of number is "+result);


    }
}
