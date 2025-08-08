import java.util.Arrays;
import java.util.List;
//Count item matching a rul
public class matchingArule {
    public static void main(String[] args) {
    List<List<String>> items = Arrays.asList(
            Arrays.asList("phone", "blue", "pixel"),
            Arrays.asList("computer", "silver", "phone"),
            Arrays.asList("phone", "gold", "iphone"));        
         String ruleKey = "type";
        String  ruleValue = "phone";

        int count = 0;
        if(ruleKey.equalsIgnoreCase("type")){
            for(List<String> item:items){
                if(item.get(0).equalsIgnoreCase(ruleValue)){
                    count++;
                }
            }
        }
        else if(ruleKey.equalsIgnoreCase("color")){
            for(List<String> item:items){
                if(item.get(1).equalsIgnoreCase(ruleValue)){
                    count++;
                }
            }
        }
        else if(ruleKey.equalsIgnoreCase("name")){
            for(List<String> item:items){
                if(item.get(2).equalsIgnoreCase(ruleValue)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    
}
