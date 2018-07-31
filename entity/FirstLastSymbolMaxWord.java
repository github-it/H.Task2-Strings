package entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstLastSymbolMaxWord {

    public void findFirstLastSymbol(char inputChar, String inputTxt) {
        Pattern p = Pattern.compile("((\\A|\\s)["+inputChar+"]\\S*["+inputChar+"])");
        Matcher m = p.matcher(inputTxt);
        String longWord = "";
        while (m.find()) {
            String findWord = m.group().trim();
            if (findWord.length() > longWord.length()) {
                longWord = findWord;
            }
        }
        System.out.println(inputTxt);
        System.out.println("Самое длиное слово в формате ("+inputChar+"..."+inputChar+"): " + longWord);
        System.out.println(inputTxt.replace(" "+longWord,""));

        }
    }