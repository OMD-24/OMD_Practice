import java.util.Scanner;

public class InternationalGymDay {

    public static void check(int dis, int x, int y, int cnt){


          while(y>0){

              int mem = x-(((dis*x)*(cnt+1))/100);
              if(mem<=y){
                  System.out.println(cnt);
                  return;
              }
              else cnt++;

              y--;
          }
          if(y<=0) System.out.println(-1);

       

        
    }

   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

       

        check(d,x,y,0);

        
    }
}