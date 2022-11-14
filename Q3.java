import java.util.*;
public class Q3 {
    public static void findAvgTotal(){
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the mark of subject "+(i+1)+" :");
            int mark = sc.nextInt();
            total += mark;
        }
        System.out.println("Total : "+total);
        System.out.println("Average: "+(double)total/10);
        sc.close();
    }
    public static void main(String[] args) {
        findAvgTotal();
    }
}
