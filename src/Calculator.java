public class Calculator {
    public static int Add(String text){
        if(text.isEmpty()){
            return 0;
        } else {
            return Integer.parseInt(text);
        }
    }
}
