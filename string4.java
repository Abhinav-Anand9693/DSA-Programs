public class string4 {
    public static void substring(String a,int si,int ei){
        String substring="";
        for(int i=si;i<ei;i++){
            substring+=a.charAt(i);
        }
        System.out.println(substring);

    }
    public static void main(String[] args){
        String a="Hello Abhinav";
        substring(a, 1, 7);
    }
}
/*
public static void main(String[] args){
    String str="Hello Abhinav";
    System.out.println(str.substring(3,5));

}
short form of above code*/
