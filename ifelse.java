// import java.util.Scanner;
// class ifelse{
//     public static void main(String ar[]){
//         Scanner ab = new Scanner(System.in);
//         int fact;
//         int n;
//         int i;
//         System.out.println("enter the value of a=");
//         fact =ab.nextInt();
//         System.out.println("enter the value of n=");
//         n =ab.nextInt();
//         for(i=1;i<=n;i++){
//             fact = fact*i;
//         }
//         System.out.println("factorial of " +n +"is" +fact);
//     }
// }

import java.util.Scanner;
class ifelse{
    public static void main(String ar[]){
        try (Scanner sc = new Scanner (System.in)) {
            int t;
            System.out.println("enter the value of t:-");
            t = sc.nextInt();
            int n;
            System.out.println("enter the value of n:-");
            n = sc.nextInt();
            for(int i=1;i<=n;i++){
                t *= i;
            }
            System.out.println(t);
        }
    }
}