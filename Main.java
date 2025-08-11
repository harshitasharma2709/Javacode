// public class Main1 {
//     public static void main(String[] args) {
//        int _p = 2;
//        float $r = 5.3f;
//        System.out.println(_p);
//        System.out.println($r);
//     }
// }

// TYPES OF VARIABLES:-  1- LOACAL 2-STATIC 3-INSTANCE

// public class Main1 {
//     static int a = 5;
//     public static void main(String[] args) {
//         // int b = 10; // local variable
//        System.out.println(a);
//     }
// }

// DATA TYPES:- 1- PRIMITIVE 2- NON-PRIMITIVE
// 1- PRIMITIVE HAVE 8 TYPES...:- INT, OAT, CHAR, SORT, DOUBLE, BOOLEAN, LONG, BYTE
// 2- NON-PRIMITIVE..:- STRING, CLASS, ARRAY

// PRIMITIVE
// public class Main1{ //Here we declared the class
    
//     public static void main(String[] args){
//         int a = 9; 
//         float b = 9.5f;
//         String name = "Harshita";
//         boolean c = true;
//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(name);
//         System.out.println(c);
//     }
// }

// MULTIPLE DECLARATION - DECLARE MORE THAN ONE VARIABLE LIKE:- int a=5, b=6, c=10


// INT

// import java.util.*;
// public class Main1{ //Here we declared the class
    
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println(a+b);
//     }
// }

// BYTE
// import java.util.*;
// public class Main1{ //Here we declared the class
    
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         byte a = sc.nextByte();
//         byte b = sc.nextByte();
//         System.out.println(a+b);
//     }
// }


// FLOAT
// import java.util.*;
// public class Main1{ //Here we declared the class
    
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         float a = sc.nextFloat();
//         float b = sc.nextFloat();
//         System.out.println(a+b);
//     }
// }


import java.util.*;

public class Main1 {    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
    }
}
