import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:-");
        System.out.print("1st number: ");
        int a = sc.nextInt();
        System.out.print("2nd number: ");
        int b = sc.nextInt();
        System.out.print("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Remainder\n");
        System.out.print("Enter the number corresponding to what operation you want to do: ");
        int o = sc.nextInt();
        if(o==1){
            System.out.println(add(a, b));
        }else if (o==2){
            System.out.println(subtract(a, b));
        }else if(o==3){
            System.out.println(multiply(a, b));
        }else if(o==4){
            System.out.println(divide(a, b));
        }else  if(o==5){
            System.out.println(remainder(a, b));
        }else {
            System.out.println("Operation not in the list. :))");
        }
    }
    private static int add(int a, int b){
        return a+b;
    }
    private static int subtract(int a, int b){
        return a-b;
    }
    private static int multiply(int a, int b){
        return  a*b;
    }
    private static int divide(int a, int b){
        if(b<a) {
            return  a/b;
        }else{
            return  b/a;
        }
    }
    private static int remainder(int a, int b){
        return  a%b;
    }
}