public class StringReverse{
    public static void main(String[] args) {
        String str = "Hello";  //Original
        String reversed = "";    //Empty string to store result

        for(int i = str.length()-1; i >=0; i--){
            reversed += str.charAt(i);
        }
        System.out.println("Reversed String is : " +reversed);
    }
}