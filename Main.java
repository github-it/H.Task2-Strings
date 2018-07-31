import entity.FirstLastSymbolMaxWord;
import entity.FirstLastWord;
import entity.LetterCounter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String txt = new String("Регулярные выражения - образцы шаблонов. " +
                "С их помощью вы можете увидеть, как можно их использовать в ежедневной практике. " +
                "Не обязательно будут работать в любом языке программирования.");
        FirstLastWord swap = new FirstLastWord();
        LetterCounter vowCon = new LetterCounter();
        FirstLastSymbolMaxWord symbols = new FirstLastSymbolMaxWord();

        swap.swapSentenceFirstLastWord();
        //vowCon.countVowelConsonant(txt);
        //symbols.findFirstLastSymbol('о',txt);

    }
    }

