package casovotantes;

public class Casovotantes {
    public static void main(String[] args) {

      int n = (int)Math.floor(Math.random()*(100-500)+500);
      String [][] votantes = new String [n][2];
      for(int i=0; i<n;i++){
          for(int j=0;j<2;j++){
          int z = (int)Math.floor(Math.random()*(0-3)+3);
          while (z<0 && z>2){
              z = (int)Math.floor(Math.random()*(0-3)+3);
          }
              if(z==2){
                  votantes[i][j]= ("n");
              }
              if(z==1){
                  votantes[i][j]= Integer.toString(z);
              }              
              if(z==0){
                  votantes[i][j]= Integer.toString(z);
              }             
              
              
              System.out.println("creo que vamos bien :v " +votantes[i][j]);
          }
      }
          for(int i=0; i<n;i++){
          for(int j=0;j<2;j++){
              
          }
          }
      System.out.println("vamos bien creo :v " +n);
        
    }
    
}