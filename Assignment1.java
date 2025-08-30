// 1. Sum of Natural Numbers
// Find the sum of first N natural numbers using a loop.
// Input: N = 5
// Output: 15

// public class Assignment1 {
//     public static void main(String[] args) {
//         int N = 5;  
//         int sum = 0;
//         for (int i = 1; i <= N; i++) {
//             sum += i;  
//         }
//         System.out.println("Output: "+ sum);  
//     }
// }

// 2. Multiplication Table
// Take a number from the user and print its multiplication table (up to 10).
// Input: N = 7
// Output:

// import java.util.Scanner;

// public class Assignment1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int N = sc.nextInt();
      
//         for (int i = 1; i <= 10; i++) {
//         System.out.println(N + " * " + i + " = " + (N*i));  
//         }
//     }
// }


// 3. Factorial of a Number
// Calculate the factorial of a number N using a loop.
// Input: N = 5
// Output: 120

// public class Assignment1 {
//     public static void main(String[] args) {
//         int N = 5;
//         int fact = 1;
//         for (int i = 1; i <= N; i++) {
//             fact = fact * i;
//         }
//         System.out.println("Factorial of " + N + " is: " + fact);  
//     }
// }


// 4. Count Digits in a Number
// Count the number of digits in an integer using a loop.
// Input: 98765
// Output: 5

// public class Assignment1 {
//     public static void main(String[] args) {
//         int N = 98765;
//         int count = 0;
//         while (N>0) {
//             N = N/10;
//             count++;
//         }
//         System.out.println(count);  
//     }
// }


// 5. Sum of Digits
// Input a number and find the sum of its digits.
// Input: 432
// Output: 9

// public class Assignment1 {
//     public static void main(String[] args) {
//         int n = 432;
//         int num = n;
//         int sum = 0;
//         while(num > 0) {
//         int digit = num % 10;
//         sum = sum + digit;
//         num = num/10;
//         }
//         System.out.println(sum);
//     }
// }

// 6. Palindrome Number
// Check if a given number is a palindrome (reads the same backward).
// Input: num = 121
// Output: Palindrome
// Input: num = 123
// Output: Not Palindrome

// public class Assignment1 {
//     public static void main(String[] args) {
//         int num = 121;
//         int org = num;
//         int rev = 0;
//         while(num>0) {
//             int digit = num % 10;
//             rev = rev * 10 + digit;
//             num = num/10;
//         }
//         if (org == rev) {
//             System.out.println(org + " Palindrome");
//         } else {
//             System.out.println(org + " Not Palindrome");
//         }
//     }
// }

// 7. Fibonacci Series
// Print the Fibonacci series up to N terms using a loop.
// Input: N = 7
// Output:

// public class Assignment1 {
//     public static void main(String[] args) {
//         int N = 7;   
//         int a = 0, b = 1;
        
//         System.out.print("Fibonacci Series: ");
//         for (int i = 1; i <= N; i++) {
//             System.out.print(a + " ");
//             int next = a + b;
//             a = b;
//             b = next;
//         }
//     }
// }

// 8. Prime Number Check
// Check if a number is prime using a loop.
// Input: num = 17
// Output: Prime
// Input: num = 20
// Output: Not Prime


// public class Assignment1 {
//     public static void main(String[] args) {
//         int num = 17;   
//         boolean isPrime = true;

//         if (num <= 1) isPrime = false;
//         else {
//             for (int i = 2; i <= num / 2; i++) {
//                 if (num % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }
//         System.out.println(isPrime ? "Prime" : "Not Prime");
//     }
// }


// 9. Armstrong Number
// Check if a number is an Armstrong number.
// An Armstrong number is a number that is equal to the sum of cubes of its digits.
// Input: num = 153
// Output: Armstrong
// Input: num = 123
// Output: Not Armstrong

// public class Assignment1 {
//     public static void main(String[] args) {
//         int num = 153, sum = 0, temp = num;
//         while (temp > 0) {
//             int d = temp % 10;
//             sum += d * d * d;  
//             temp /= 10;
//         }
//         System.out.println(sum == num ? "Armstrong" : "Not Armstrong");
//     }
// }


// 10. Strong Number
// Check if a number is a Strong number.
// A Strong number is a number whose sum of factorials of digits equals the number itself.
// Input: num = 145
// Output: Strong
// Input: num = 123
// Output: Not Strong

// public class Assignment1 {
//     public static void main(String[] args) {
//         int num = 145, sum = 0, temp = num;
//         while (temp > 0) {
//             int d = temp % 10, fact = 1;
//             for (int i = 1; i <= d; i++) fact *= i; 
//             sum += fact;
//             temp /= 10;
//         }
//         System.out.println(sum == num ? "Strong" : "Not Strong");
//     }
// }

// 11. Pythagorean Triplets
// Generate all Pythagorean triplets with values smaller than a given limit.
// Input: limit = 20
// Output:

// public class Assignment1 {
//     public static void main(String[] args) {
//         int limit = 20;
//         for (int a = 1; a < limit; a++) {
//             for (int b = a; b < limit; b++) {
//                 int c = (int)Math.sqrt(a*a + b*b);
//                 if (c < limit && a*a + b*b == c*c) {
//                     System.out.println(a + ", " + b + ", " + c);
//                 }
//             }
//         }
//     }
// }
