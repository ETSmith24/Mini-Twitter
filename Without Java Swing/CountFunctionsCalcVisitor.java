//class for visitor pattern
public class CountFunctionsCalcVisitor implements CountFunctionsVisitor{
    //visit method which is supposed to count the total users and messages, doesnt work
    @Override
    public void visit(User root) {
        int users = 0;
        int messages = 0;
        for (int i = 0; i < root.getFollowers().size(); i++) {
            for (int j = 0; j < root.getFollowers().get(i).getFeed().size(); j++) {
                messages++;
            }
            users++;
        }
        System.out.println("Number of users: " + users);
        System.out.println("Number of messages: " + messages);
        
    }
    

}
