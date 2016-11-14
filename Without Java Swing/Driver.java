//driver class
public class Driver {
    public static void main(String[] args) {
        //obtain single instance of Menu
        Menu temp = Menu.getInstance();
        temp.display();
    }

}
