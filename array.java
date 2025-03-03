import java.util.Scanner;
public class array {
    public static void main(String ar[]){
        try (Scanner o = new Scanner(System.in)) {
            int n;
            System.out.println("enter number of elements you want to enter:-");
            n=o.nextInt();
            int[] a = new int[n];
            System.out.println("enter elements");
            for(int i=0;i<n;i++){
                a[i]= o.nextInt();
            }
            System.out.println("elements are:-");
            for(int i=0;i<n;i++){
                System.out.print( a[i] +" ");
            }
        }
    }
}