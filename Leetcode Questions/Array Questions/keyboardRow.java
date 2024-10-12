import java.util.ArrayList;
import java.util.List;

/**
 * keyboardRow
 */
public class keyboardRow {

    public String[] findWords(String[] words) {
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";

        List<String> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String[] a = words[i].toLowerCase().split("");
            boolean flag = true;
            String temp = "";

            if (s1.contains(a[0]))
                temp = s1;
            else if (s2.contains(a[0]))
                temp = s2;
            else 
                temp = s3;
            
            for (int j = 1; j < a.length; j++) 
                if (!temp.contains(a[j])) {
                    flag = false;
                    break;
                }
            
            if (flag) 
                list.add(words[i]);
        }

        return list.toArray(new String[list.size()]);  }

    public static void main(String[] args) {
        
    }
}