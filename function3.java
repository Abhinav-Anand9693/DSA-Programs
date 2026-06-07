import java.util.*;
public class function3 {

    public static int Sumof2Numbers(int num1,int num2){//Formal parameters
        int sum=num1+num2;
    
      return sum;
    }    public static void main(String[] args){
        Scanner SC=new Scanner(System.in);

      int a=SC.nextInt();
      int b=SC.nextInt();
      int sum=Sumof2Numbers(a,b);//Arguments or Actual Paramerters
      System.out.println("sum of the number is "+sum);
      SC.close();
    }
    
}
