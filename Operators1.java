// Arithmatic - An array is a fixed-size collection of elements of the same type
// arithmatic have 5 opertaors :- addition, subtration, multiplication, division, modulos

// import java.util.*;
// public class Operators{ 
    
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         // System.out.println(a+b);
//         // System.out.println(a-b);
//         // System.out.println(a*b);
//         // System.out.println(a/b);
//         System.out.println(a%b);

//     }
// }

// import java.util.*;
// public class Operators{
//     public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     System.out.println(a+b);
// }
// }

// import java.util.*;
// public class Operators{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println(a%b);
//     }
// }

// Assignment Operators - are used to assign values to variables.
// =, +=, -=, *=, 


// public class Operators{
//     public static void main(String[] args){
//         int a = 3;
//         b += 2;
//         System.out.println(a);
//         System.out.println(b);
//     }
// } 

// import java.util.*;
// public class Operators{
//     public static void main(String[] args){
        // int a = 3;
//         a *= 2;
//         System.out.println(a);
//         System.out.println(b);
//     }
// } 

// public class Operators{
//     public static void main(String[] args){
//         int a = 4;
//         a /= 2;
//         System.out.println(a);
//         System.out.println(b);
//     }
// } 

// public class Operators{
//     public static void main(String[] args){
//         // Scanner sc = new Scanner(System.in);
       // // int a = 2;
//         int b = 4;
//         b *= 2;
//         System.out.println(a);
//         System.out.println(b);
//     }
// } 

// public class Operators{
//     public static void main(String[] args){
//         // Scanner sc = new Scanner(System.in);
//         int b = 7;
//         b -= 2;
//         System.out.println(b);
//     }
// } 


// == equal to, != not equal to, > greater than, < lesser than, >= greater or equal to, <= less or equal to

// public class Operators{
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 6;
//            System.out.println(a = b); 
//         System.out.println(a == b);  
//         System.out.println(a != b);
//         System.out.println(a > b);
//         System.out.println(a < b);
//         System.out.println(a >= b);
//         System.out.println(a <= b);
//     }
// }

// = .... assign krta hai
// == ...compare krna hota h
// or = dono condition false h toh false dega

// Logical Operators
// boolean c = true, d = false;
// System.out.println(c && d);  // false
// System.out.println(c || d);  // true
// System.out.println(!c);      // false

// Unary Operators
// int x = 5;
// System.out.println(+x);   // 5
// System.out.println(-x);   // -5
// System.out.println(++x);  // 6 (pre-increment)
// System.out.println(x--);  // 6 (post-decrement, then x=5)
// int num = 8;
// System.out.println(++num); // Pre → 9 (increase first, then print)
// System.out.println(num++); // Post → 9 (print first, then increase to 10)
// int num = 8;
// System.out.println(--num); // Pre → 7 (decrease first, then print)
// System.out.println(num--); // Post → 8 (print first, then decrease to 7)


// Reversed
// import java.util.Scanner;
// public class Operators {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int num1 = sc.nextInt();
//         int rev = 0;

//         while (num1 != 0) {
//             int num2 = num1 % 10;         
//             rev = rev * 10 + num2; 
//             num1 = num1 / 10;                
//         }
//         System.out.println(rev);
//     }
// }

// import java.util.*;
// public class Operators{
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in); {
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         a = a+b;
//         b = a-b;
//         a = a-b;
//         System.out.print("a = " + a + " b = " + b);
//   }
//  }
// }

// 8421
// and = 1&1 = 1 and all are zero's
// 0101 = 5
// 0110 = 6
// 0100 = 4
// 0011 = 3

// public class Operators{
    // public static void main(String[] args) {
    //     int a = 5;
    //     int b = 6;
    //        System.out.println(a ^ b); } }
// xor = 0 ^ 0 = 0
// 1 ^ 1 = 0
// 0 ^ 1 = 1
// 1 ^ 0 = 1

// public class Operators{
//     public static void main(String[] args) {
//         int a = 5;
//         // int b = 6;
//            System.out.println(~a); 
//         } 
//     }


//     int x = 5;       // 0101 in binary
// int result = ~x; // 1010 in binary (in 32 bits, result is -6)
// System.out.println(result); // Output: -6


    // public class Operators{
    // public static void main(String[] args) {
    //     int a = 5;
    //     int b = 1;
    //        System.out.println(a<<b); 
    //     } 
    // }

//     public class Operators {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 2;
//         System.out.println(a >> b); // Right shift
//     }
// }


    // *    *
    // ******
    // *    *


    public class Operators {
    public static void main(String[] args) {
        if (2 == 3)
            System.out.println("2");
        else {
            System.out.println("3");
        }
    }
}


// // IF-ELSE
// import java.util.*;
// public class Operators{
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();

//        if (age > 1 && age <= 14) {
//            System.out.println("Child");
//        } else if (age >= 15 && age <= 20) {
//            System.out.println("Teenager");
//        } else if (age >= 27 && age <= 45) {
//            System.out.println("Big");
//        } else {
//            System.out.println("Old");
//        }
//    }
// }

// Switch condition

// public class Operators{
//    public static void main(String args[]) {
// int day = 3;
// switch (day) {
//     case 1: System.out.println("Monday"); break;
//     case 2: System.out.println("Tuesday"); break;
//     case 3: System.out.println("Wednesday"); break;
//     default: System.out.println("Invalid day");
// }
//    }
//      }

    //  Question - Even and Odd
//     import java.util.*;
// public class Operators{
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();

//       if(x % 2 == 0) {
//           System.out.println("Even");
//       } else {
//           System.out.println("Odd");
//       }
//    }
// }

// *               *
// *               * *
// * * * * * * * * * * * 
// *               * *
// *               *


// import java.util.Scanner;

// public class Operators{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter an odd number: ");
//         int n = scanner.nextInt();
//         scanner.close();

//         // Upper half
//         for (int j = 0; j < n / 2; ++j) {
//             System.out.print(" * ");
//             for (int k = 0; k < n + 2; ++k) {
//                 System.out.print("   ");
//             }
//             for (int m = 1; m <= j + 1; ++m) {
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }

//         // // Middle line
//         for (int i = 0; i < 1 + n + 2; ++i) {
//             System.out.print(" * ");
//         }
//         for (int i = 0; i < n / 2 + 1; ++i) {
//             System.out.print(" * ");
//         }
//         System.out.println();

//         // // Lower half
//         for (int j = n / 2; j > 0; --j) {
//             System.out.print(" * ");
//             for (int k = 0; k < n + 2; ++k) {
//                 System.out.print("   ");
//             }
//             for (int m = 1; m < j + 1; ++m) {
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }
// }


// import java.util.*;
// public class Main {
//    public static void main(String args[]) {
//        int n = 4;

//        //outer loop
//        for (int i = 1; i <= n; i++) {
//            //inner loop
//            for (int j = 1; j <= n-i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//            }
//        }
//    }

//    initilization, condition, execute, check

// public class Main {
//    public static void main(String args[]) {
// int i = 1;
// while(i <= 5){
//     System.out.println("Count: " + i);
//     i++;
// }
//    System.out.println("Value of i: "+ i);
//    }
//      } 
//  Final value of i = 6

// reverse, palindrome, if odd no


// import java.util.*;
// public class Operators {
//    public static void main(String args[]) {
// for(int i = 0; i <= 5; i++) {
//     System.out.println("hello");
//      }
//    }
// }

// condition - execute
// public class Operators {
//    public static void main(String args[]) {
// int i = 1;
// while(i <= 5) {
//     System.out.println("Count: "+ i);

//      }
//    }
// }

// write a program to print 1 to 100 number but skip the 45-60 number
// public class Operators{
//     public static void main(String[] args) {
//         for (int i = 1; i <= 100; i++) {
//             if (i >= 45 && i <= 60) {
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }
