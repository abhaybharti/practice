package June_13;

public class StringsExample {
    public static void main(String[] args) {

        String str1 = "Welcome";
        String str2 = "welcome|To|India";

        System.out.println("Equals : "+str1.equals(str2));
        System.out.println("Equal Ignore Case : "+str1.equalsIgnoreCase(str2));
        System.out.println("Get character from String : "+str1.charAt(3));
        System.out.println("Join two strings: "+str1+str2);
        System.out.println("Substring : "+str1.substring(3,5));
        System.out.println("Contains : "+str1.contains(str2));
        String replacedString = str2.replace("|","-");
        System.out.println("Replace : "+replacedString);
        System.out.println("Trim : "+str1.trim());

        //Reverse a string
        for (int i = str1.length()-1; i >=0;i--){
            System.out.print(str1.charAt(i));
        }
        System.out.println();

        //Split String value using Pipe operator
        String [] splitedValue = str2.split("\\|");
        for (int i =0; i <splitedValue.length;i++){
            System.out.println(splitedValue[i]);
        }
    }
}
