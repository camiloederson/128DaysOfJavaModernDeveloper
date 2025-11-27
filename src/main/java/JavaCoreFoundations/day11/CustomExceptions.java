package JavaCoreFoundations.day11;

import java.util.HashMap;
import java.util.Map;

public class CustomExceptions {
    public static void main(String[] args) {

        // mocks a user table.
        Map<Integer, String> users = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            users.put(i, String.valueOf(i));
        }

        try {
            findById(users, 8);
        } catch (UserNotFoundException e) {
            throw new RuntimeException("Oops! Something went wrong", e);
        }
    }

    public static void findById(Map<Integer, String> users, int id) {
        if (users.get(id) == null) {
            throw new UserNotFoundException("Id " + id + " doesn't exist" );
        }
    }
}
