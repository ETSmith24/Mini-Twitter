//observer pattern
//updates the feed for the user when a user they are following posts, doesnt work
public class FeedUpdater extends Observer{
    public FeedUpdater(User user) {
        this.user = user;
    }
    
    public void update(String s) {
        user.append(user.getName() + ": " + s);
    }

}
