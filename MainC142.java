import java.util.*;
public class MainC142 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String food = sc.nextLine();
        int num = sc.nextInt();
        sc.nextLine();
        String menu = sc.nextLine();
        String[] menuArr = menu.split(" ");
        // System.out.println(food);
        // System.out.println(num);
        // System.out.println(menu);
        
        String answer = "No";
        
        for (int i=0;i< menuArr.length;i++){
            // System.out.println(menuArr[i]);
            // System.out.println(food);
            if(Objects.equals(menuArr[i],food)){
            answer = "Yes";
            }
        } 
        System.out.println(answer);
    }
}
