import java.util.Scanner;

public class TCSExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++){

            int D[] = new int[3];
            int S[] = new int[3];
            for(int i=0; i<3; i++){
                D[i] = sc.nextInt();
            }

             for(int i=0; i<3; i++){
                S[i] = sc.nextInt();
            }

            int Dragon = 0;
            int Sloth = 0;

            for(int i=0; i<3; i++){
               Dragon += D[i];
               Sloth += S[i];
            }

            if(Dragon > Sloth){
                System.out.println("DRAGON");
            }
            else if(Sloth > Dragon){
                System.out.println("SLOTH");

            }
            else {
                if(D[0] > S[0]){
                System.out.println("DRAGON");

                }
                else if(D[0] < S[0]){
                System.out.println("SLOTH");

                }
                else {
                     if(D[1] > S[1]){
                System.out.println("DRAGON");

                }
                else if(D[1] < S[1]){
                System.out.println("SLOTH");

                }
                else{
                    if(D[2] > S[2]){
                System.out.println("DRAGON");

                }
                else if(D[2] < S[2]){
                System.out.println("SLOTH");

                }
                else System.out.println("TIE");
                }
                }
            }
        }
    }
}
