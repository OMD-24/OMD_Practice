public class q_6 {

    public static void TB(String s,char[][] A, int m, int n, int i, int j, int idx){
        if(idx == s.length()){
            return;
        }
        while(i<m && idx < s.length()){
            
            A[i][j] = s.charAt(idx);
            i++;
            idx++;
            
        }

        if(i-2 >= 0){
        Dia(s,A,m,n,i-2,j+1,idx);}

    }


    public static void Dia(String s,char[][] A, int m, int n, int i, int j, int idx){

        if(idx == s.length()){
            return;
        }
        while(i>0 && idx < s.length()){
            A[i][j] = s.charAt(idx);
            i--;
            j++;
            idx++;
        }
        TB(s,A,m,n,i,j,idx);

    }


    public static String convert(String s, int numRows) {

        if(numRows == 1){
            System.out.println(s);
        }


        int m = numRows;
        int n = (s.length() / numRows) + numRows;

        char A[][] = new char[m][n];

        TB(s,A,m,n,0,0,0);
        
        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i<m; i++){
            for(int j=0; j<n; j++){
                if(A[i][j] != '\u0000'){
                    sb.append(A[i][j]);
                }
            }
            
        }
        System.out.println(sb);

        return "";
    }

    public static void main(String[] args) {
        String s = "AB";
        int row = 1;

        convert (s,row);
    }
}