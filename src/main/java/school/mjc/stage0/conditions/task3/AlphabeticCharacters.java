package school.mjc.stage0.conditions.task3;

import java.util.Locale;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        String s = Character.toString(character);
        s.toLowerCase();


        if (s.matches("^(?i:[aeiouy]).*")){
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");

        }

    }
}
