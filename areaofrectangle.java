import java.util.Scanner;
class l{
    int l1;
    void displayl(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the lenght of rectangle");
        l1 = sc.nextInt();
    }
}
class areaofrectangle extends l {
    int b1;
    void displayb(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the bredth of rectangle");
        b1 = sc.nextInt();
        int area = l1*b1;
        System.out.println("area" +area);
    }
    
    public static void main(String[] args) {
        areaofrectangle o = new areaofrectangle();
        o.displayl();
        o.displayb();
    }
}
