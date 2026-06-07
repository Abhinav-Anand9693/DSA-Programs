public class function4 {
    public static void Swap(int a,int b){
        int temp=a;
         a=b;
         b=temp;
         System.out.println("this is a "+a);//**java always call by value
         System.out.println("this is b "+b);
    }
    public static void main(String[] args){
        int a=3;
        int b=5;
        Swap(a,b);
       // System.out.println("this is a "+a);//this return original value of a
        //System.out.println("this is b "+b);without swapping it.
        
    }
    
}
