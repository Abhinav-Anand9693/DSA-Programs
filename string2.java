public class string2 {
    public static void Palidromecheck(String a){
        String b=new String();
        for(int i=a.length()-1;i>=0;i--){
            b+=a.charAt(i);
        }
            if(a.equals(b)){
                System.out.print("this is Palindrome");
                

            }
            else{
                System.out.println("this is not palindrome");
            }

        
    }
    public static void main(String[] args){
        String a="madam";
        Palidromecheck(a);
    }
    
}
