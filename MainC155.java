import java.util.*;
public class MainC155 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.nextLine();
        int num = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[num];
        String answer;
        
        for (int i = 0;i < num;i++){
            answer = "No";
            arr[i] = sc.nextLine();
            if (arr[i].indexOf(target) >= 0){
                answer = "Yes";
            } 
            System.out.println(answer);
        } 
    }
}
