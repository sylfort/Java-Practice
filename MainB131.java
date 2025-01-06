import java.util.*;
public class MainB131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numLines = sc.nextInt();
        int numStations = sc.nextInt();
        sc.nextLine();
        int[][] arrLine = new int[numLines][numStations];
        for(int i=0;i< numLines; i++){
         for(int j=0;j< numStations; j++){
             arrLine[i][j] = sc.nextInt();
         }
        }

        int numStationsFinal = sc.nextInt();
        
        sc.nextLine();
        
        int[][] arrTrip = new int[numStationsFinal][2];
        for(int i=0;i< numStationsFinal; i++){
         for(int j=0;j< 2; j++){
             if(j==0){
                 arrTrip[i][j] = sc.nextInt() - 1;
             } else {
                 arrTrip[i][j] = sc.nextInt() - 1;
             }
         }
        }
        int curr = arrLine[0][0];
        int goal = arrLine[arrTrip[0][0]][arrTrip[0][1]];
        // System.out.println(curr);
        
        int acc = 0;

        for(int i = 0;i < numStationsFinal - 1; i++){
            acc += Math.abs(goal - curr);
            // System.out.println(acc);

            if(arrTrip[i][0] != arrTrip[i + 1][0]){
                curr = arrLine[arrTrip[i + 1][0]][arrTrip[i][1]];
                goal = arrLine[arrTrip[i + 1][0]][arrTrip[i + 1][1]];
                
            } else {
                curr = goal;
                goal = arrLine[arrTrip[i + 1][0]][arrTrip[i + 1][1]];
            }
            // System.out.println(curr + " " + goal);
            
         }
        acc += Math.abs(goal - curr);
        System.out.println(acc);
    }
}
