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
 * Represents a tweet
 *
 * @author dezfuli
 *
 * @version 1.0
 */

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    /**
     * Constructs a tweet instance using the given message
     *
     * @param message the message of the tweet
     */
    Tweet(String message){

        this.message = message;
        date = new Date();
//        message = message;
    }

    /**
     * Contructs a tweet instance using a given message and date
     *
     * @param message the message of the tweet
     * @param date the date of the tweet
     */
    Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * Returns the message
     *
     * @return String
     */
    public String getMessage(){
        return message;
    }

    /**
     * Sets the message of the tweet
     *
     * @param message the new message of the tweet
     * @throws TweetTooLongException is thrown when the message is over 140 characters
     *
     * @see ImportantTweet
     * @see NormalTweet
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() < 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    /**
     * Returns the date
     *
     * @return Date
     */
    public Date getDate(){
        return date;
    }

    /**
     * Sets the date of the tweet
     *
     * @param date the date of the tweet
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Checks if the tweet is important
     *
     * @return Boolean
     */
    public abstract Boolean isImportant();

    /**
     * Generates a string with the tweet's date and message
     *
     * @return String
     */
    public String toString() {
        return date.toString() + " | " + message;
    }
}
