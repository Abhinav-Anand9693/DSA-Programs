public class sortingbubble {
    public static void bubble(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
            if(a[j]>a[j+1]){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }

}
    public static void printarr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");

        }
        System.out.println();
    

    }
    public static void main(String[] args){
        int a[]={21,534,8,3,111,93};
        bubble(a);
        printarr(a);
    }

    
}
