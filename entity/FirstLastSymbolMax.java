package entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstLastSymbolMax {

    public void firstLastS() {
        String str = "каыаф вавуц лпавдлил лыдавал ываывавы лваыл";
        Pattern p = Pattern.compile("((\\A|\\s)[л]\\S*[л])");
        Matcher m = p.matcher(str);
        String longWord = "";
        while (m.find()) {
            String findWord = m.group().trim();
            if (findWord.length() > longWord.length()) {
                longWord = findWord;
            }
        }
            System.out.println(String.format("Самое длиное слово: %s", longWord));


        }
    }