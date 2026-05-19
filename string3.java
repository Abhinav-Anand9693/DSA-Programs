public class string3 {
    public static float Shortestpath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if(dir=='S'){
                y--;
            } 
            else if(dir=='N'){
            y++;
            }
            else if(dir=='W'){
                x--;  
            }
            else if(dir=='E'){
                x++;
            }
            
        }
        int x2=x*x;
            int y2=y*y;
            return (float)Math.sqrt(x2+y2);
       
    }
    public static void main(String[] args){
        String path="SNWESWWN";
        System.out.println(Shortestpath(path));
    }
    
}
