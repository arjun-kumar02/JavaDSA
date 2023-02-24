import java.util.Scanner;


// 1. [Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.](https://www.java67.com/2019/05/how-to-find-largest-and-smallest-of-three-numbers-in-java.html
/**
 * function
 */
// public class function {

//     public static int lar(int n1,int n2,int n3){
//         int max=0;
//         if(n1>n2 && n1n3){
//             max=n1;
//               System.out.println(n1+"*");
//         }
//         else if(n2<n1 && n2<n3){
//             max=n2;
//             System.out.println(n2+"*");
//         }
//         else{
//             max=n3;
//             System.out.println(n3+"*");
//         }
//         return max;
//     }
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("number:");
//         int num1=in.nextInt();
//         int num2=in.nextInt();
//         int num3=in.nextInt();
//         int largest=lar(num1, num2, num3);
//         System.out.println(largest);

//         //function

//     }
// }











// 2. [Define a program to find out whether a given number is even or odd.](https://www.geeksforgeeks.org/java-program-to-check-if-a-given-integer-is-odd-or-even/)
/**
 * function
 */
// public class function {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("number");
//         int n=in.nextInt();
//         String num_ber =evenodd(n);
//         System.out.println(num_ber);
//     }
//     static String evenodd(int num){
//         String number ="";
//         if(num%2==0){
//             number="even";
//             return number;
//         } 
//         else{
//             number ="odd";
//             return number;
//         }
//     }
// }







// 3. [A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.](https://www.efaculty.in/java-programs/voting-age-program-in-java/)
/**
 * function
 */
// public class function {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("age");
//         int age=in.nextInt();
//         String Vote=vote(age);
//         System.out.println(Vote);
//     }
//     static String vote(int age){
//         String Vote = " ";
//         if(age>=18){
//             Vote="eligible";
//         }
//         else if(age<18){
//             Vote ="not eligible";
//         }
//         return Vote;
//     }
// }











// 4. [Write a program to print the sum of two numbers entered by user by defining your own method.](https://code4coding.com/addition-of-two-numbers-in-java-using-method/)
/**
 * function
 */
// public class function {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("number");
//         int num1=in.nextInt();
//         int num2=in.nextInt();
//         sum(num1,num2);
//     }
//     static void sum(int a,int b){
//         System.out.println(a+b);
//     }
// }






// 5. [Define a method that returns the product of two numbers entered by user.](https://code4coding.com/java-program-to-multiply-two-numbers-using-method/)
/**
 * function
 */
// public class function {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("number");
//         int num1=in.nextInt();
//         int num2=in.nextInt();
//         sum(num1,num2);
//     }
//     static void sum(int a,int b){
//         System.out.println(a*b);
//     }
// }








// 6. [Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.](https://beginnersbook.com/2014/01/java-program-to-calculate-area-and-circumference-of-circle/)





// 7. [Define a method to find out if a number is prime or not.](https://www.geeksforgeeks.org/java-program-to-check-if-a-number-is-prime-or-not/)
/**
 * function
 */
// public class function {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("number");
//         int n=in.nextInt();
//         prime(n);
//     }
//     static void prime(int n){
//         for(int i=2;i<=n; i++){
//             if(n%i==0){
//                 System.out.println(i);
//             }
//         }
//     }
// }















// 8. [Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:](https://www.techcrashcourse.com/2017/02/java-program-to-calculate-grade-of-students.html) <br/>
// <pre> 
// Marks        Grade 
// 91-100         AA 
// 81-90          AB 
// 71-80          BB 
// 61-70          BC 
// 51-60          CD 
// 41-50          DD 
// <=40          Fail 
// </pre>
/**
 * function
 */
// public class function {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter marks:");
//         int marks = in.nextInt();
//         marks(marks);
//     }
//     static void marks(int m){
//         if(m>91 || m<100){
//             System.out.println("AA");
//         }
//         else if(m>81 || m<90){
//             System.out.println("AB");
//         }
//         else if(m>71 || m<80){
//             System.out.println("BB");
//         }
//        else  if(m>61 || m<70){
//             System.out.println("BC");
//         }
//         else if(m>51 || m<60){
//             System.out.println("CC");
//         }
//         else if(m>41 || m<50){
//             System.out.println("CD");
//         }
//         else if(m>31 || m<40){
//             System.out.println("DD");
//         }
//         else{
//             System.out.println("fail");
//         }
//     }
// }











// 9. [Write a program to print the factorial of a number by defining a method named 'Factorial'.](https://www.javatpoint.com/factorial-program-in-java)
// Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.- <br/>
// <pre>
// 4! = 1 * 2 * 3 * 4 = 24 
// 3! = 3 * 2 * 1 = 6 
// 2! = 2 * 1 = 2 
// Also, 
// 1! = 1 
// 0! = 1
// </pre>
/**
 * function
 */
// public class function {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter number:");
//         int n=in.nextInt();
//         factorial(n);
//     }
//     static void factorial(int n){
//         int temp=1;
//         for(int i=1; i<=n; i++){
//             temp*=i;
//             System.out.println(temp);
//         }
//     }
// }








// 10. [Write a function to find if a number is a palindrome or not. Take number as parameter.](https://www.geeksforgeeks.org/check-if-a-number-is-palindrome/)
/**
 * function
 */
// public class function {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("String");
//         String name = in.nextLine().trim();
//         boolean palindrome =palindrome(name);
//         if(palindrome){
//             System.out.println("A palindrome");
//         }
//         else{
//             System.out.println("Not a palindrome");
//         }
//     }

//     static boolean palindrome(String name){
//         String temp="";
//         for(int i=name.length()-1; i>=0; i--){
//             temp+=name.charAt(i);
//         }
//         System.out.println(temp);
//         if(temp.equals(name)){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
// }








// 11. Convert the programs in [flow of program](01-flow-of-program.md), [first java](02-first-java.md), [conditionals & loops](03-conditionals-loops.md) assignments into functions.











// 12. [Write a function to check if a given triplet is a Pythagorean triplet or not.](https://www.geeksforgeeks.org/find-pythagorean-triplet-in-an-unsorted-array/) (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
/**
 * function
 */
// public class function {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter three number:");
//         int a = in.nextInt();
//         int b = in.nextInt();
//         int c = in.nextInt();
//         boolean triplet = pythagorean(a,b,c);
//         System.out.println(triplet);
//     }
//     static boolean pythagorean(int a, int b,int c){
//         int  temp=c;
//         if(a>b && a>c){
//             temp=a;
//             System.out.println("a");
//         }
//         else if(b>a && b>c){
//             temp =b;
//             System.out.println("b");
//         }
//         if(temp==a){
//             if(a*a==b*b+c*c){
//                 return true;
//             }
//         }
//         else if (temp==b){
//             if(b*b==a*a+c*c){
//                 return true;
//             }
//         }
//         else{
//             if(c*c==a*a+b*b){
//                 return true;
//             }
//         }
//         return false;
//     }
// }








// 13. [Write a function that returns all prime numbers between two given numbers.](https://www.geeksforgeeks.org/program-to-find-prime-numbers-between-given-interval/)
/**
 * function
 */
// public class function {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Number");
//         int n=in.nextInt();
//         prime(n);
//     }
//     static void prime(int n){
//         int temp=0;
//         for(int i=2; i<=n; i++){
//             for(int j=2; j<=i-1; j++){
//                 if(i%j==0){
//                     temp++;
//                 }
//             }
//             if(temp==0){
//                 System.out.println(i);
//             }
//             else{
//                 temp=0;
//             }
//         }
//     }
// }








// 14. [Write a function that returns the sum of first n natural numbers.](https://www.geeksforgeeks.org/program-find-sum-first-n-natural-numbers/)
/**
 * function
 */
// public class function {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("number:");
//         int n=in.nextInt();
//         natural(n);
//     }
//     static void natural(int n){
//         int temp=0;
//         for(int i=1; i<=n; i++){
//             temp+=i;
//         }
//         System.out.println(temp);
//     }
// }