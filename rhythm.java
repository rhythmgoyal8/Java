
// import java.util.Scanner;
// public class rhythm {
//     void display(){
        // try(Scanner sc = new Scanner(System.in)){
        //     int p;
        //     int r;
        //     int t;
        //     System.out.print("enter the value :-");
        //     p = sc.nextInt();
        //     System.out.print("enter rate of interest:-");
        //     r = sc.nextInt();
        //     System.out.print("enter the time:-");
        //     t= sc.nextInt();
        //     int amount=(p*r*t)/100;
        //     System.out.println("Simple interest:-"+amount);
//             for(int i=0;i<6;i++){
//                 for(int j=0;j<i;j++){
//                     System.out.print("* ");
//                 }
//                 System.out.println();
//             }
//         }
//     public static void main(String ar[]){
//         rhythm o = new rhythm();
//         o.display();
//     }
// }



// public class rhythm {
//     void display(){
//         for(int i=0;i<6;i++){
//             for(int j=0;j<i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String ar[]){
//         rhythm o = new rhythm();
//         o.display();
//     }
// }

import java.util.Scanner;
public class rhythm{
    void display(int c,int d){
        int e = c+d;
        System.out.println("sum:-" +e);
    }
    public static void main(String ar[]){
        try(Scanner sc = new Scanner(System.in)){
            int a;
            System.out.print("enter the value of a:-");
            a = sc.nextInt();
            int b;
            System.out.print("enter the value of b:-");
            b = sc.nextInt();
            rhythm o = new rhythm();
            o.display(a,b);
        }
    }
}
