import entity.User;
import lombok.var;

public class Main {
    public static void main(String[] args) {
        User user = new User("Alex", 18);
        user.setAge(22);

        var userVar = new User();
//        userVar = "str";
        System.out.println(user);
    }
}
