//composite pattern
//this class is part of the observer pattern and visitor pattern
import java.util.ArrayList;
import java.util.List;

public class User implements CountFunctions {
    private String name;
    private List<User> followers;
    private List<User> following;
    private List<String> feed;
    private Observer observer;
    
    //constructor for User objects
    public User(String name) {
        this.name = name;
        followers = new ArrayList<User>();
        following = new ArrayList<User>();
        feed = new ArrayList<String>();
    }
    
    //adds User u to the following List
    public void subscribe(User u) {
        following.add(u);
    }
    
    //posts tweet to feed and calls notifyFollowers method
    public void tweet(String s) {
        feed.add(name + ": " + s);
        notifyFollowers(s);
    }
    
    //supposed to iterate through follower list and update their feeds, not working
    public void notifyFollowers(String s) {
        for (int i = 0; i < followers.size(); i++) {
            observer.update(s);
        }
    }
    
    //append method for update method in FeedUpdater class
    public void append(String s) {
        feed.add(s);
    }
    
    //get method for following List
    public List<User> getFollowing() {
        return following;
    }
    
    //prints following List
    public void printFollowing() {
        System.out.println("Following: ");
        for (int i = 0; i < following.size(); i++) {
            System.out.println(following.get(i).getName());
        }
    }
    
    //get method for followers List
    public List<User> getFollowers() {
        return followers;
    }
    
    //prints follower List
    public void printFollowers() {
        System.out.println("Followers: ");
        for (int i = 0; i < followers.size(); i++) {
            System.out.println(followers.get(i).getName());
        }
    }
    
    //get method for the news feed
    public List<String> getFeed() {
        return feed;
    }
    
    //prints news feed
    public void printFeed() {
        System.out.println("News Feed: ");
        for (int i = 0; i < feed.size(); i++) {
            System.out.println(feed.get(i));
        }
    }
    
    //get method for the user's name
    public String getName() {
        return name;
    }

    //count method, used in visitor pattern
    @Override
    public void count(CountFunctionsVisitor visitor) {
        visitor.visit(this);
    }
}
