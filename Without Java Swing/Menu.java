//make getInstance method for singleton
public class Menu {
    private static Menu menu = new Menu();
    private static CountFunctions visitor = new User("root");
    
    //empty constructor
    private Menu() {
        
    }
    
    //getInstance method for singleton pattern
    public static Menu getInstance() {
        return menu;
    }
    
    //displays text
    public void display() {
        System.out.println("Mini Twitter Program");
        System.out.println("Some 'users' are created for testing purposes.");
        
        //create a few test users
        User john = new User("john");
        User bob = new User("bob");
        User steve = new User("steve");
        
        //bob subscribes to john and steve subscribes to bob
        bob.subscribe(john);
        steve.subscribe(bob);
        
        //create a few initial tweets
        john.tweet("hello world!");
        bob.tweet("I'm bob!");
        steve.tweet("I'm steve!");
        
        //print out the users' data
        System.out.println("\nJohn's Data");
        john.printFollowing();
        john.printFollowers();
        john.printFeed();
        
        System.out.println("\nBob's Data");
        bob.printFollowing();
        bob.printFollowers();
        bob.printFeed();
        
        System.out.println("\nSteve's Data");
        steve.printFollowing();
        steve.printFollowers();
        steve.printFeed();
        
        //prints the results of the count method, incorrect output
        System.out.println("\nCount Functions");
        visitor.count(new CountFunctionsCalcVisitor());
    }

}
