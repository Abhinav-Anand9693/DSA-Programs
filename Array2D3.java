public class Array2D3 {
    public static int diagonalsum(int a[][]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(i==j){
                    sum+=a[i][j];
                }
                else if(i+j==a.length-1){
                      sum+=a[i][j];
                    }
                }
            
            }
            return sum;
            
        }
        public static void main(String[] args){
            int a[][]={{1,2,3,4},
                       {2,3,5,6},
                       {2,3,4,5},
                       {2,2,3,4}};
             System.out.println(diagonalsum(a));
        }
       
        }
    
