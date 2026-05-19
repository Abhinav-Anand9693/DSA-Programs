public class sortingselection {
    public static void selection(int a[]){
        
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[min]>a[j]){
                    min=j;
                   
                }
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
    }
    public static void printarr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args){
        int a[]={1,4,2,55,6,7,88,33,11};
       
        selection(a);
        printarr(a);

    }
    
}
