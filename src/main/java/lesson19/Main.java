package lesson19;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream<User> userStream = Stream.generate(User.UserGenerator::generateRandomUser);

        Map<String, List<User>> usersByGender = userStream
                .filter(user -> user.getAge() > 18)
                .filter(user -> user.getEmail() != null && !user.getEmail().isEmpty())
                .limit(20)
                .collect(Collectors.groupingBy(User::getGender));

        usersByGender.forEach((gender, userList) -> {
            System.out.println("Gender: " + gender);
            userList.forEach(user -> System.out.println(user));
        });
    }

}