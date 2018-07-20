import entity.FirstLastSymbolMax;
import entity.Swap;
import entity.VowelsConsonant;

public class Main {
    public static void main(String[] args) {
        String txt = new String("В этой группе представлены образцы шаблонов. " +
                "С их помощью вы можете увидеть, как можно использовать регулярные выражения в ежедневной практике. " +
                "Однако заметьте, что они не обязательно будут работать в любом языке программирования," +
                " поскольку каждый из них обладает индивидуальными особенностями и различным уровнем поддержки регулярных выражений.");
        Swap swap = new Swap();
        VowelsConsonant vowCon = new VowelsConsonant();
        FirstLastSymbolMax symbols = new FirstLastSymbolMax();

        //swap.swapSentence(txt);
        //vowCon.countVowCons(txt);
        //symbols.firstLastS();

    }
    }

