public class array7 {
    public static void subarrypairs(int a[]){
        for(int i=0;i<a.length;i++){
            int start=i;
            for(int j=i;j<a.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.err.print(a[k]+" ");
                }
                System.err.println();
            }
            System.err.println();
        }

    }
    public static void main(String [] args){
       int a[]={1,2,3,4,5,6,7};
       subarrypairs(a);
    }
    
}
