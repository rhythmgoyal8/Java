import java.util.Scanner;

class abc {
    int a;
    abc()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value of a:-");
        a = sc.nextInt();
        int b;
        System.out.println("enter the value of b:-");
        b = sc.nextInt();
        int c=a+b;
        System.out.println("sum:-:-"+c);
    }
    public static void main(String[] args) {
        abc o=new abc();
    }
    
}
