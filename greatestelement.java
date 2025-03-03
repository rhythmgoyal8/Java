import java.util.Scanner;
class a{
    int a1;
    void displaya(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter th value of a:-");
        a1 = sc.nextInt();
    }
}
class b extends a{
    int b1;
    void displayb(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter th value of b:-");
        b1 = sc.nextInt();
    }
}
public class greatestelement extends b {
    int c1;
    void displayc(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter th value of c:-");
        c1 = sc.nextInt();
        if(a1>b1 && a1>c1){
            System.out.println(+a1+" is greatest element");
        }
        else if(b1>a1 && b1>c1){
            System.out.println(+b1+" is greatest element");
        }
        else{
            System.out.println(+c1+" is greatest element");
        }
    }
    public static void main(String[] args) {
        greatestelement o = new greatestelement();
        o.displaya();
        o.displayb();
        o.displayc();
    }
}
