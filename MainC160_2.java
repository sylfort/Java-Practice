import java.util.*;
public class MainC160_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i = 0;i< N; i++){
            arr.add(sc.nextInt());
        }
        
        System.out.println(avgWater(N, arr));
    }
    
    public static int avgWater(int n, ArrayList<Integer> arr){
        double sum = 0;
        for (int i = 0;i< arr.size() ; i++){
            sum = sum + arr.get(i);
        }
        
        int avg = (int)Math.ceil(sum/n);

        return avg;
    }
}
