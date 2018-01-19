package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jng1 on 1/18/18.
 */

public class Sad extends Mood {

    public Sad() {
        super();
    }

    public Sad(Date date) {
        super(date);
    }

    public String getMood() {
        return "Sad";
    }
}
