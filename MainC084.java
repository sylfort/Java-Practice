import java.util.*;
public class MainC084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        line = "+" + line + "+";
        int len = line.length();
        String plus = "";
        for (int i = 0;i < len; i++ ){
        plus = plus + "+";
        } 
        System.out.println(plus);
        System.out.println(line);
        System.out.println(plus);
    }
}
