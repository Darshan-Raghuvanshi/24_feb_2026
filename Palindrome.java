import java.util.Scanner;
public class Palindrome {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check palindrome or not");
        int x = sc.nextInt();
        int ori= x; //121
        int rem = 0;
        int rev = 0;


        while(x!=0)
        {
            rem = x%10;
            rev = (rev*10)+rem;
            x = x/10;

         }
         if (rev == ori) {
            System.out.println(+rev +" is Palindrome number");
         }
         else {
            System.out.println(+ori +" is not palindrome number.");
         }
    }
}
