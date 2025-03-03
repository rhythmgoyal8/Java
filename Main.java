// import java.util.Scanner;
// class a{
//     int a1=2;
//     void displaya(){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the value of a1:- ");
//         a1 = sc.nextInt();
//         }    
//     }


// class b extends a {
//     int b1=3;
//     void displayb(){
//         Scanner sd = new Scanner(System.in);
//         System.out.print("en7ter the value of b1:- ");
//         b1 = sd.nextInt();
//         int c = b1+a1;
//         System.out.println("Sum:-"+c);
//     }


//     public static void main(String ar[]){
//         b o = new b();
//         o.displaya();
//         o.displayb();
//     }
// }
    import java.util.*;
    class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            String reverseStr = "";
            int strLength = str.length();
            for (int i = (strLength - 1); i >=0; --i) {
                reverseStr = reverseStr + str.charAt(i);
            }
            if (str.equals(reverseStr)) {
                System.out.println(str + " is a Palindrome String.");
            }
            else {
                System.out.println(str + " is not a Palindrome String.");
            }
        }
    }