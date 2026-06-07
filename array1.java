public class array1 {
    public static void myindex(int a[]){
    int b=64;
        
        for(int i=0;i<a.length;i++){
           if(b==a[i]){
            System.out.print(i);
        
           }
        }
        
           }
    public static void main(String[] args){
        int a[]={1,4,2,8,64,4,2,8};
        myindex(a);

        
    }       
    
}
