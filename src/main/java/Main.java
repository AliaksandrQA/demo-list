import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Alex");
        User user2 = new User("Kate");
        User user3 = new User("John");
        User user4 = new User("John");


        ArrayList<User> array = new ArrayList();

        array.add(user1);
        array.add(user2);
        array.add(user3);

        System.out.println(array);

        Integer number1 = 1;
        Integer number2 = 2;
        Integer number3 = 3;


       /* ArrayList<Integer> integers = new ArrayList<>();
        integers.add(number1);
        integers.add(number2);
        integers.add(number3);
        System.out.println(integers);
        integers.add(3);
        System.out.println(integers);
        integers.add(2);
        integers.add(1);
        System.out.println(integers);*/


       /* HashSet<Integer> hashSetNumbers = new HashSet<>();
        hashSetNumbers.add(1);
        hashSetNumbers.add(2);
        hashSetNumbers.add(3);
        System.out.println(hashSetNumbers);
        hashSetNumbers.add(3);
        System.out.println(hashSetNumbers);
        hashSetNumbers.add(1);
        hashSetNumbers.add(2);
        System.out.println(hashSetNumbers);
        hashSetNumbers.add(4);
        System.out.println(hashSetNumbers);*/


        HashSet<User> setOfUsers = new HashSet<>();
        setOfUsers.add(user1);
        setOfUsers.add(user2);
        setOfUsers.add(user3);
        System.out.println(setOfUsers);
        setOfUsers.add(user4);
        System.out.println(setOfUsers);

    }
}
