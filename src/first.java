import java.util.Scanner;

import javax.xml.transform.SourceLocator;

// public class first {
//     public static void main(String[] args) {
//         System.out.println("Hello World !");
//     }
// }





// public class first {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int a = input.nextInt();
//         System.out.println(a);
//     }
// }






// public class first {
//     public static void main(String[] args) {
//         System.out.println("Data types");
//         int a=10;
//         float b= 10.5f;
//         long c = 9784655654684L;
//         boolean d = false;
//         char e = 'A';
//         double f = 78987465268.46566;
//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(c);
//         System.out.println(d);
//         System.out.println(e);
//         System.out.println(f);
//     }
// }







//assigments
// 1. Write a program to print whether a number is even or odd, also take input from the user.
/**
 * first
 */
// public class first {
//     public static void main(String[] args) {
//         System.out.print("Enter  a number:");
//         Scanner input = new Scanner(System.in);
//         int num=input.nextInt();
//         if(num%2==0){
//             System.out.println(num + " Is even");
//         }
//         else{
//             System.out.println(num +" Is odd");
//         }
//     }
// }







// 2. Take name as input and print a greeting message for that particular name.
/**
 * first
 */
// public class first {

//     public static void main(String[] args) {
//         System.out.print("Enter you Name :");
//         Scanner input = new Scanner(System.in);
//         String name = input.nextLine();
//         System.out.print("Hello " + name);
        
//     }
// }








// 3. Write a program to input principal, time, and rate (P, T, R) from the user and  find Simple Interest.
/**
 * first
 */
// public class first {
//     public static void main(String[] args) {
//         System.out.print("Enter principal amout : ");
//         Scanner input = new Scanner (System.in);
//         float Principal = input.nextFloat();
//         System.out.print("Enter Time : ");
//         float  time= input.nextFloat();
//         System.out.print("Enter Rate : ");
//         float rate = input.nextFloat();
//         System.out.println("Simple interest : "+(Principal*time*rate)/100);
//     }
// }









// 4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
/**
 * first
 */
// public class first {
//     public static void main(String[] args) {
//         System.out.print("Enter a operator +,-,*,/ :");
//         Scanner input = new Scanner(System.in);
//         String operator = input.next();
//         if (operator.charAt(0)=='+'){
//             System.out.println("Enter two number of addition:");
//             int num1 = input.nextInt();
//             int num2 = input.nextInt();
//             System.out.println(num1 + " + " + num2 + " = " +(num1+num2) );
//         }
//         else if (operator.charAt(0)=='-'){
//             System.out.println("Enter two number of sub:");
//             int num1 = input.nextInt();
//             int num2 = input.nextInt();
//             System.out.println(num1 + " - " + num2 + " = " +(num1-num2) );
//         }
//         else if (operator.charAt(0)=='*'){
//             System.out.println("Enter two number of mul:");
//             int num1 = input.nextInt();
//             int num2 = input.nextInt();
//             System.out.println(num1 + " * " + num2 + " = " +(num1*num2) );
//         }
//         else if (operator.charAt(0)=='/'){
//             System.out.println("Enter two number of div:");
//             int num1 = input.nextInt();
//             int num2 = input.nextInt();
//             System.out.println(num1 + " / " + num2 + " = " +(num1/num2) );
//         }
//         else {
//             System.out.println("invalid input");
//         }
//     }
// }









// 5. Take 2 numbers as input and print the largest number.
/**
 * first
 */
// public class first {
//     public static void main(String[] args) {
//         System.out.print("Enter two number:");
//         Scanner input = new Scanner(System.in);
//         int a =input.nextInt();
//         int b =input.nextInt();
//         if(a>b){
//             System.out.println(a + " A is largest number");
//         }
//         else if(a<b){
//             System.out.println(b +" B is largest number");
//         }
//         else{
//             System.out.println("invalid number:");
//         }
//     }
// }










// 6. Input currency in rupees and output in USD.
/**
 * first
 */
// public class first {
//     public static void main(String[] args) {
//         System.out.println("Enter Rupees");
//         //81.57
//         Scanner input = new Scanner(System.in);
//         float rs = input.nextFloat();
//         System.out.println(rs +" In USD "+(rs*81.57f));
//     }
// }










// 7. To calculate Fibonacci Series up to n numbers.
/**
 * first
 */
// public class first {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter a number for fibonacci ");
//         int n=in.nextInt();
//         int a=0;
//         int b=1;
//         int fib=0;
//         for(int i=2; i<=n-1; i++) {
//             fib=a+b;
//             a=b;
//             b=fib;
//         }
//         System.out.println(fib);
//     }
// }






// 8. To find out whether the given String is Palindrome or not.
/**
 * first
 */
// public class first {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter a string:");
//         String intput = in.nextLine().trim();
//         System.out.println(intput);
//         String rev=" ";
//         for(int i=intput.length()-1; i>=0; i--){
//             rev+=intput.charAt(i);
//         }
//         System.out.println(rev);
//         if(intput.equals(rev)){
//             System.out.println("palindrome");
//         }
//         else{
//             System.out.println("not palindrome");
//         }
//     }
// }








// 9. To find Armstrong Number between two given number.
/**
 * first
 */
// public class first {
//     public static void main(String[] args) {
//         Scanner in= new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int n=in.nextInt();
//         for(int i=n; i>0; i++){
//             if
//         }
//     }
// }