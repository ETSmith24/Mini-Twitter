/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ethan
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class User implements UserInt{
    Random rand = new Random();
    int ID;
    String tempName, newsFeed, tweet;
    List<String> followerList = new ArrayList<String>();
    List<String> followingList = new ArrayList<String>();
    
    public User() {

    }
    
    //uses rand to generate a random number from 0-999 as an ID
    public int generateID() {
        ID = rand.nextInt(1000);
        return ID;
    }
    //assorted setters and getters
    public void setName(String a) {
        tempName = a;
    }
    public String getName() {
        return tempName;
    }
    public int getID() {
        return ID;
    }
    public String getNewsFeed() {
        return newsFeed;
    }
    //iterates through followerList and and puts the contents in a
    //String, organized as a vertical list
    public String getFollowerList() {
        String list = "";
        for (String temp : followerList) {
            list = list + temp + "\n";
        }
        return list;
    }
    public void setFollower(String b) {
        followerList.add(b);
    }
    //iterates through followingList and and puts the contents in a
    //String, organized as a vertical list
    public String getFollowingList() {
        String list = "";
        for (String temp : followingList) {
            list = list + temp + "\n";
        }
        return list;
    }    
    public void setFollowing(String c) {
        followingList.add(c);
    }
    public String getTweet(User a) {
        return tweet;
    }
    //this should've acted like an "update" or "notify" method and
    //sent the String str to all members of followerList
    public void sendTweet(User a, String str) {
        for (String temp : a.followerList) {
            System.out.println("do something");
        }
    }
}
