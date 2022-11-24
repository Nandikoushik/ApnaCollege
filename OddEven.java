public class OddEven {
    public static void Odd_Even(int no){
        int bitmask=1;
        if((no & bitmask)==1){
            System.out.println("Given no is a Odd No");
        }else{
            System.out.println("Given No is a Odd No");
        }
    }
    // GET Ith BIT 
    public static int GetIthBit(int no,int i){
        int bitmask=i<<i;
        if((no&bitmask)==0){
            return 0;
        }else{
            return 1;
        }

    }
 
    public static void main(String[] args) {
        
        int no=1001101;
        int key=3;
        //Odd_Even(no);
        System.out.println(GetIthBit(no, key));
    }
    
}
