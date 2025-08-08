import java.util.ArrayList;
import java.util.List;

public class checkPanagramString {
    public static void main(String[] args) {
        String sentence = "leetcode";
        char[] ch = sentence.toCharArray();
        List<Character> charList = new ArrayList<>();
        for(int i = 0;i<=ch.length-1;i++){
            if(ch[i]>='a' && ch[i]<='z'){
                if(!charList.contains(ch[i])){
                    charList.add(ch[i]);
                }
            }
        }
        if(charList.size() == 26){
                System.out.println(true);
        }
        else{
                System.out.println(false);
        }
    }
    
}
