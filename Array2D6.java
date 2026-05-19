public class Array2D6 {
    public static void main(String[] args){
        int a[][]={ {1, 2, 4},
            {4, 5, 6},
            {7, 8, 4} };
            int target=4;
            int no=0;
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[0].length;j++){
                    if(a[i][j]==target){
                        no++;
                    }

                }
            }
             System.out.println(no);
    }
   
    
}
