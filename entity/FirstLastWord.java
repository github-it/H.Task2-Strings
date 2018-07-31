package entity;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class FirstLastWord {

    public void swapSentenceFirstLastWord() throws IOException {
        FileWriter fileClear = new FileWriter("WriteFile.txt");
        fileClear.close();

        String txtFileRead;
        txtFileRead = new String(Files.readAllBytes(Paths.get("ReadFile.txt")));

        String[] sentenceArray = txtFileRead.split("(?<=[.!?])");
        for (String str : sentenceArray) {
            String newSentence = str.trim().replaceAll("(?U)^(\\w+)(.*)(\\b\\w+)([.?!]?$)", "$3$2$1$4");
            try (FileWriter txtFileWrite = new FileWriter("WriteFile.txt", true)) {
                txtFileWrite.write(newSentence);
                txtFileWrite.append('\n');
                txtFileWrite.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
