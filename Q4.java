import java.util.*;
public class Q4 {
    public static int findMax(int a,int b,int c){
        int temNumber = a;
        if (temNumber<b) {
            temNumber = b;
        }
        if(temNumber<c){
            temNumber=c;
        }
        return temNumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter number 3: ");
        int num3 = sc.nextInt();
        System.out.println(findMax(num1, num2, num3));
        sc.close();
    }
}
