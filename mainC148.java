import java.util.*;
public class MainC148 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double battleNum = sc.nextDouble();
        double myLvl = sc.nextDouble();
        sc.nextLine();
        
        double enemyLvl;
        
        while(sc.hasNext()){
            enemyLvl = sc.nextDouble();
            if (enemyLvl > myLvl){
                myLvl = Math.floor(myLvl/2);
            }
            if (enemyLvl < myLvl){
                myLvl += Math.floor(enemyLvl/2);
            }
            
        }
        System.out.println((int)myLvl);
    }
}
