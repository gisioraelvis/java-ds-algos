import java.util.Arrays;

public class StringUtils {

    public static int vowelCount(String str){
        if(str == null || str == " "){
            return 0;
        }

        String vowels = "aeiou";
        int count = 0;
        for(char v: vowels.toCharArray()){
            for(char c: str.toLowerCase().toCharArray()){
                if(v==c){
                    count++;
                }
            }
        }
        return count;
    }

    public static String reverseStr(String str){
        if(str == null || str == " "){
            return "";
        }

        StringBuilder reversed = new StringBuilder();
        for(int i = str.length()-1; i >= 0; i--){
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
