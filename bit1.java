public class bit1 {
    public static void evenodd(int n){
       int BitMask=1;
       if((n & BitMask)==0){
        System.out.println("This is even");
       }
        else{
            System.out.println("This is odd");
        }
       

    }
    public static void main(String[] args){
        
        evenodd(6);
    }

    
}
