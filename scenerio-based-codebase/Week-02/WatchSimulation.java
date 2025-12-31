
public class WatchSimulation {
    public static void main(String[] args) {

        
        for(int i=0;i<24;i++){
            for(int j=0;j<60;j++){
                if(i==13 && j==0) {
                    System.out.println("Power Has Been Cutted!");
                    break;
                }
                   System.out.printf("%02d:%02d\n", i , j);
               
                
            }
            if(i==13) break;
        }
       

    }
}