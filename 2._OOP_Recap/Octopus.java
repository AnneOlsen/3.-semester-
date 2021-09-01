import java.util.Scanner;

public class Octopus extends Animal {

    //implement a custom move method that returns the string "Swich Swosh"

    @Override
    public String move(){
        return "Swich Swosh";
    }

    // implement an activity method that when given a number from 1 - 6
    // returns a string of an activity that is does
    // you can make is repeat certain activities that is does more frequently
    // Make activitynumber a random number from 1-10

    public String activity(){


    String activity = " ";
    int activitynumber = 1;



        switch(activitynumber){
            case 1:
                activity = "sleep";
                break;

            case 2:
                activity = "Mate";
                break;

            case 3:
                activity = "Jet ink";
                break;
            case 4, 5:
                activity = "Eat";
                break;
            case 6:
                activity = "bevæger armene";
                break;

            default: activity = move();
    }
    return activity;

}
}

