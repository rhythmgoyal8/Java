import java.util.Scanner;
public class function {
    // static void display(){
    //     System.out.println("hello ");
    // }
    // static void display1(){
    //     System.out.println("hello everyone");
    // }
    static void display(int c,int d,int e){
        int amount=(c*d*e)/100;
        System.out.println("amount:-"+amount);
    }
    public static void main(String ar[]){
        try (Scanner o = new Scanner(System.in)) {
            int p;
            p=o.nextInt();
            int r;
            r=o.nextInt();
            int t;
            t=o.nextInt();
            
            display(p,r,t);
        }
    }
}
