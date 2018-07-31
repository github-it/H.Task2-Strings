package entity;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class LetterCounter {

    public void countVowelConsonant(String inputTxt) {
        int countChar = 0;
        int countVow = 0;
        String vowels = "аоэиуыеёюяaeiou";
        ArrayList<String> sentenceArray = new ArrayList<>();
        Matcher matcher = Pattern.compile("([^.!?]+)").matcher(inputTxt);{
            while (matcher.find()) {
                sentenceArray.add(matcher.group());
                System.out.println(matcher.group());
            }
            for (int i = 0; i < sentenceArray.size(); i++) {
                for (char currentSymbol : sentenceArray.get(i).toLowerCase().toCharArray()) {
                    if (Character.isLetter(currentSymbol)) {
                        countChar++;
                        if (vowels.indexOf(currentSymbol) != -1) {
                            countVow++;
                        }
                    }
                }
                System.out.println("№ " + (i + 1) + "." + " гласные: " + countVow + " согласные: " + (countChar - countVow));
                countChar = 0;
                countVow = 0;
            }

        }

    }
}
