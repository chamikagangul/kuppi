import java.util.*;
public class Q5 {
    public static double findArea(double radius){
        return (3.14*radius*radius);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radi = sc.nextDouble();
        System.out.println(findArea(radi)); 
        sc.close();

    }
}
