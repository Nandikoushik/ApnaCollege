public class DiagonalSum {
    public static int Diagonal_sum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum=sum+matrix[i][i];
            if(i!=matrix.length-1-i){
                sum=sum+matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={ {1,2,3},{5,4,8},{4,8,7}};
        System.out.println(Diagonal_sum(matrix));
        
    }
    
}
