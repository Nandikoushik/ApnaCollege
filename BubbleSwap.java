public class BubbleSwap {
    public static void  Bubble_swap(int number[]){
        for(int i=0;i<number.length-1;i++){
            for(int j=0;j<number.length-1-i;j++){
                //swap
                if(number[j]>number[j+1]){
                    int temp=number[j];
                number[j]=number[j+1];
                number[j+1]=temp;
                }
                
            }
        }
       for(int i=0;i<number.length;i++){
        System.out.print(number[i]+" ");
       } System.out.println();


    }
    public static void main(String[] args) {
        int number[]={1,5,7,3,4,48,-1,8,45,75,26,19};
        Bubble_swap(number);
    }
}
