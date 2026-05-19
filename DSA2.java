public class DSA2 {
    public static void stockprblm(int a[]){
        int max=0;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                
                int b=a[j]-a[i];
                if(b>max){
                    max=b;

                }
               
            }
            
        }
        System.out.print(max);
       
    }
    public static void main(String [] args){
        int a[]={1,4,2,5,9,3};
        stockprblm(a);
    }
   
    
}
