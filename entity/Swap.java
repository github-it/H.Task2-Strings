package entity;

public class Swap {

    public void swapSentence(String input) {
        String[] sentenses = input.split("(?<=[.!?])");
        for (String str : sentenses) {
            String newSentense = str.trim().replaceAll("(?U)^(\\w+)(.*)(\\b\\w+)([.?!]?$)", "$3$2$1$4");
            System.out.println(newSentense);
        }
    }
}
