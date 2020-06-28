package June20;

public class MethodExample {


    public static void main(String[] args) {
        printName();
        printName("Karun");

        printName("Java");
        int ageValue  = 0;
        ageValue = getAge(100);


        System.out.println(ageValue);

        if (ageValue < 30){
            System.out.println("Adult");
        }else{
            System.out.println("Young "+ageValue);
        }
    }

   public static void printName(){
        System.out.println("My name");
   }

   public static void printName(String name){
        System.out.println("My name : "+name);
   }

   public static int getAge(int age){
        return age+5*2;
   }



    //[Modifier] [static] , [return Type] [nameOfMethod] ([Paramters]){

        //Actual code


       //return "";
    //}


}
