import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

       Systemos.out.println("hello");
       Systemos.out.println(6);
       Systemos.out.println(6.8);

       //implement word , give it content that you
       //think makes sense and allow it to be printed out with Systemos

       Systemos.out.println(new Word("Hej"));

       //make an array of 5 words and implement a method in Systemos that prints them out

        Word[] words = new Word[]{
                new Word("Hej"),
                new Word("med"),
                new Word("dig"),
                new Word("!"),
                new Word("!!"),
        };

        Systemos.out.println(words);


        // create an arrayList of several Words and
        // implement a way to print them out with Systemos

        ArrayList<Word> wordlist = new ArrayList<>(){{
            add(new Word("bord"));
            add(new Word("TV"));
            add(new Word("seng"));
            add(new Word("stol"));
            add(new Word("hej"));
        }};
        Systemos.out.println(wordlist);



    }



}
