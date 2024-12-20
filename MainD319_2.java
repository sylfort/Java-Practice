import java.util.*;
public class MainD319_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        double num = Double.parseDouble(line);
        
        System.out.println((int)Math.ceil(num/6));
    }
}
