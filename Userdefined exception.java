package user;
public class User extends Exception {
    public User(String message) {
        super(message);
    }
}
 class AgeValidator {
    public static void main(String[] args) {
        int age = 200;

        try {
            if (age < 0 || age > 150) {
                throw new User("Invalid age: " + age);
            }
            System.out.println("Age is valid.");
        } catch (User e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
