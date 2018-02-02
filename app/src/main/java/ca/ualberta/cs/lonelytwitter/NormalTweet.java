/*
 *  Copyright 2018 Team X, CMPUT301, University of Alberta - All Rights Reserved.
 *  You may use, distribute or modify this code under terms and conditions of Student Behavior at
 *  University of Alberta
 *  You can find a copy of the license in this project. Otherwise, please
 *  contact @abc.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a normal tweet
 *
 * @author dezfuli
 *
 * @version 1.0
 */

public class NormalTweet extends Tweet {

    /**
     * Constructs a normal tweet instance using the given message
     *
     * @param message the message of the tweet
     */
    NormalTweet(String message){
        super(message);
    }

    /**
     * Constructs a normal tweet instance using the given message and date
     *
     * @param message the message of the tweet
     * @param date the date of the tweet
     */
    NormalTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Checks if the tweet is normal
     *
     * @return Boolean
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
