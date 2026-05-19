public class array6 {
    public static void ArrayPairs(int a[]){
     for(int i=0;i<a.length;i++){
        int current=a[i];
        for(int j=i+1;j<a.length;j++){
            System.out.print("("+current+","+a[j]+")");
        }
    }
     System.out.println();
    }
    public static void main(String[] args){
        int a[]={1,2,3,4,5,6};
        ArrayPairs(a);
    }
}
