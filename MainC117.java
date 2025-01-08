import java.util.*;
public class MainC117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stores = sc.nextInt();
        int months = sc.nextInt();
        sc.nextLine();
        int fixedCost = sc.nextInt();
        int monthCost = sc.nextInt();
        int ramenPrice = sc.nextInt();
        sc.nextLine();
        int unitsSold;
        int storesClosed = 0;
        for (int i=0;i<stores;i++) {
            unitsSold = sc.nextInt();
            if((unitsSold * ramenPrice) - fixedCost - (monthCost * months) < 0){
                storesClosed++;
            }
            
            sc.nextLine();
        }
        System.out.println(storesClosed);
    }
}
