public class array4 {
    public static int LargestNumber(int a[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(largest<a[i]){
                largest=a[i];
            }
            
        }
        return largest;
    }
    public static void main(String[] args){
        int a[]={1,4,7,5,9,10};
       System.out.println(LargestNumber(a));
    }
    
}
