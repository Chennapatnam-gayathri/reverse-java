public class palindrome {

    public static void main(String[] args){
        String name="gayathri";
        String anw="";
        for(int i=7 ; i>=0 ; i--){
            anw=anw+name.charAt(i);
        }
        if(anw.equals(name)){
            System.out.println("yes it is a palindrome");

        }else{
            System.out.println("this is not a palindrome");
        }

    }
    
}
