package Task12_abstractStacktrace;

import java.util.Scanner;

public class Main {
    public static User[] getUsers() {
        User user1 = new User("john", "pass1", "john@gmail.com", 24);
        User user2 = new User("anya", "pass2", "anya@gmail.com", 20);
        //
        return new User[]{user1, user2};
    }

    public static User getUserByLoginAndPassword(String plogin, String ppassword) throws UserNotFoundException {
        User[] users = getUsers();

        for (User user : users) {
            boolean eqLogin     = user.login.equals(plogin);
            boolean eqPassword  = user.password.equals(ppassword);
            if (eqLogin && eqPassword) {
                return user;
            }
        }
        System.out.println("user not found");
        throw new UserNotFoundException("User not found");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.age < 18) {
            throw new AccessDeniedException("User under 18");
        }
    }

    // main
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин");
        String newLogin = scanner.nextLine();
        System.out.println("Введите пароль");
        String newPassword = scanner.nextLine();

        // check login and password
        User us1 = getUserByLoginAndPassword(newLogin, newPassword);
        // validate user age
        validateUser(us1);

        System.out.println("Доступ предоставлен");
    }
}
