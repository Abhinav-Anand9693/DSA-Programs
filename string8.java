public class string8 {
    public static String StringCompress(String a){
        String newStr="";
        for(int i=0;i<a.length();i++){
           Integer count=1;
        while(i<a.length()-1 && a.charAt(i)==a.charAt(i+1)){
            count++;
            i++;
        }
        newStr+=a.charAt(i);
        if(count>1){
            newStr+=count.toString();
        }
        }
        return newStr;
    }
    public static void main(String[] args){
        String a="aabbsss";
        System.out.println(StringCompress(a));
    }
    
}
