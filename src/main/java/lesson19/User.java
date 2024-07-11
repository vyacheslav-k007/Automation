package lesson19;

import java.util.Random;
import java.util.UUID;

public class User {
    private final String name;
    private final int age;
    private final String email;
    private final String gender;

    public User (String name, int age, String email, String gender) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    class UserGenerator {
        private static final Random RANDOM = new Random();
        private static final String[] MALE_NAMES = {"Bob", "Charlie", "Frank", "Hank", "Nick", "Ned"};
        private static final String[] FEMALE_NAMES = {"Alice", "Diana", "Eve", "Grace", "Amanda", "Omara"};
        private static final String[] GENDERS = {"Male", "Female"};

        public static User generateRandomUser() {
            String gender = GENDERS[RANDOM.nextInt(GENDERS.length)];
            String name = gender.equals("Male")
                    ? MALE_NAMES[RANDOM.nextInt(MALE_NAMES.length)]
                    : FEMALE_NAMES[RANDOM.nextInt(FEMALE_NAMES.length)];
            int age = RANDOM.nextInt(82) + 18;
            String email = UUID.randomUUID().toString() + "@example.com";
            return new User(name, age, email, gender);
        }
    }
}
