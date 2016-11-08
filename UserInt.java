//interface that acts like "component" from the composite design pattern
public interface UserInt {
    int generateID();
    int getID();
    void setName(String a);
    String getName();
    String getNewsFeed();
    String getFollowingList();
    String getFollowerList();
    
}
