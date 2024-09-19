import java.util.ArrayList;
import java.util.List;

public class findWordsContaining {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<words.length; i++){
            int k = 0;
            for(int j = 0; j<words[i].length(); j++){
                if(words[i].charAt(j) == x && k == 0){
                    list.add(i);
                    k++;
                }
            }
            k = 0;
        }
        return list;
    }
    public static void main(String[] args) {
        // Input: words = ["leet","code"], x = "e"
        // Output: [0,1]

        String words[] =  {"leet","code"};
        char x = 'e';
        System.out.println(findWordsContaining(words, x));

    }
}
