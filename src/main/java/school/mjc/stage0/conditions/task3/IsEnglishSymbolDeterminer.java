package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {

        String s = Character.toString(symbol);

        if (Character.UnicodeBlock.of(symbol).equals(Character.UnicodeBlock.BASIC_LATIN)){
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }

}}
