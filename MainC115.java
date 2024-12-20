import java.util.*;
public class MainC115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int numberOfCars = sc.nextInt();
        //  System.out.println(numberOfCars);
         int limit = sc.nextInt();
        //  System.out.println(limit);
         int distance;
         int sum = 0;
         
         for (int i = 1; i <= numberOfCars - 1;i++) {
             distance = sc.nextInt();
             if(distance <= limit){
                sum += distance; 
             }
         }
          System.out.println(sum);
    }
}
