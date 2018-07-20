package entity;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelsConsonant {

    public void countVowCons(String input) {
        int countChar = 0;
        int countVow = 0;
        String vowels = "аоэиуыеёюяaeiou";
        ArrayList<String> arrSent = new ArrayList<>();
        Matcher matcher = Pattern.compile("([^.!?]+)").matcher(input);{
            while (matcher.find()) {
                arrSent.add(matcher.group());
                System.out.println(matcher.group());
            }
            for (int i = 0; i < arrSent.size(); i++) {
                for (char symbol : arrSent.get(i).toLowerCase().toCharArray()) {
                    if (Character.isLetter(symbol)) {
                        countChar++;
                        if (vowels.indexOf(symbol) != -1) {
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
