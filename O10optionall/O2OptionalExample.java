package O10optionall;

import java.util.Optional;

class User {
    private String email;

    public String getEmail() {
        return email;
    }
}

public class O2OptionalExample {
    public static void main(String[] args) {
        User user = new User(); // email is null

        String email = Optional.ofNullable(user.getEmail())
                .orElse("no-reply@example.com");

        System.out.println("Send email to: " + email);
    }
}
