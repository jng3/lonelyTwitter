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
 * Interface for Tweet
 *
 * @author dezfuli
 * @version 1.0
 * @see Tweet
 */
public interface Tweetable {

    /**
     * Get the tweet message
     *
     * @return String
     */
    public String getMessage();

    /**
     * Get the tweet date
     *
     * @return Date
     */
    public Date getDate();
}
