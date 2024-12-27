import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int answer = 0;
        for (int i = 0;i<n ;i++){
            String a = sc.next();
            String b = sc.next();
            sc.nextLine();
            // System.out.println(a);
            // System.out.println(b);
            if(a.equals("G") & b.equals("C") || a.equals("C") & b.equals("P") || a.equals("P") & b.equals("G")){
            answer++;
        } 
        
    }
        System.out.println(answer);
}
}
