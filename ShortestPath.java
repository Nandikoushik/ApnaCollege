
public class ShortestPath {
    public static float Shortest_path(String str){
        int n = str.length();
        int x=0,y=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='E'){
                x++;
            }
            else if(str.charAt(i)=='N'){
                y++;
            }
            else if(str.charAt(i)=='W'){
                x--;
            }
            else{
                y--;
            }
        }
        System.out.println("Your Distence is found in "+"("+x+","+y+")");
        float no=(float)Math.sqrt((Math.pow(x, 2)+Math.pow(y, 2)));
        return no;
    }
    public static void main(String[] args) {
        
        String str="WNEENESENNN";
        System.out.println(Shortest_path(str));
    }
    
}
