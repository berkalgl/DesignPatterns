package p_4_structural_patterns.p_18_flyweight;

import java.util.ArrayList;
import java.util.List;

public class WordManager {
    private static final WordManager _wordManager = new WordManager();

    public WordManager() {
    }

    public static WordManager instance(){
        return _wordManager;
    }

    private static List<Word> wordList = new ArrayList<>();

    private static Word[][] document = new Word[20][20];

    public static Word getWord(String word){
        Word w = null;
        boolean status = false;
        for(Word item: wordList)
        {
            if(item.getWord().equals(word)){
                w = item;
                status = true;
            }
        }

        if(!status)
        {
            w = new Word(word);
            wordList.add(w);
        }
        return w;
    }

    public void addLine(String line, int indexLine) {
        for(int i = 0; i < line.length(); i++){
            String word = line.substring(i, i + 1);
            document[indexLine][i] = getWord(word);
        }
    }

    public static void getAllWord(){
        for(int i=0; i < document.length; i++)
        {
            if(document[i] == null)
                continue;

            for(Word word : document[i])
                if (word != null)
                    System.out.println(word.getWord() + "-" + word.hashCode());
        }
    }

}
