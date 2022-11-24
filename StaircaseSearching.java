public class StaircaseSearching {
    public static boolean Staircase_Searching(int matrix[][],int key){
        int col=0,row=matrix[0].length-1;
        while(col<matrix.length && row>=0){
            if(key==matrix[row][col]){
                System.out.println("Element found "+"("+ row +","+ col +")");
                return true;
            }
            else if(key<matrix[row][col]){
                row--;
            }
            else if(key>matrix[row][col]){
                col++;
            }
        }
        System.out.println("Element not found");
        return false;

    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int key=10;
        Staircase_Searching(matrix, key);

        
    }
    
}

