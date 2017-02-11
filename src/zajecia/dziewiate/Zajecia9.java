package zajecia.dziewiate;

/**
 * Created by RENT on 2017-02-11.
 */
public class Zajecia9 {
    public static void main(String[] args) {
        User user = new User("Mateusz", "Janczak", "08.11.1986");
        Address address = new Address("Poznan", "Poznanska", 2, "60-401", "Polska");
        user.address = address;
        user.print();

    }

    public static void printUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            users[i].print();
        }
    }
}

