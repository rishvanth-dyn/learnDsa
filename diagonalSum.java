package learning;

public class diagonalSum {
    public static void main(String[] args){
        int[][] mat ={{1,2,3},
                      {4,5,6},
                      {7,8,9}};
        System.out.println(DiagonalSum(mat));
    }
    public static int DiagonalSum(int[][] mat) {
        int sum = 0;
        for( int i=0,j=0 ; i<mat.length ; i++,j++ ) {
            sum+=mat[i][j];
        }
        for( int i=0,j=mat[i].length-1 ; i<mat.length && j>=0 ; i++,j--) {
            if( i==j )
                continue ;
                sum+=mat[i][j];
        }
        return sum;
    }
}
