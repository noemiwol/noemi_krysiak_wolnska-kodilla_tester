import java.util.ArrayList;
import java.util.List;

public class UsersRepository {
    public static List<User> getUsersList(){
        List<User> users = new ArrayList<>();
        users.add(new User("Jan Kowalski", 40, 8,"Basic"));
        users.add(new User("Maja Kaja", 29, 75,"Medium"));
        users.add(new User("Ivan Komorenko", 65, 528,"Advanced"));
        users.add(new User("Joey Postman", 62, 52,"Medium"));
        users.add(new User("Antonina Kruk", 15, 742,"Advanced"));
        users.add(new User("Ludwik Kwiatkowski", 36, 12,"Basic"));

        return users;
    }

}

