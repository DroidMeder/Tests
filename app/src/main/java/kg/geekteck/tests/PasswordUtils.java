package kg.geekteck.tests;

public class PasswordUtils {

    public boolean isPasswordStrong(String password){
        if (password.length()<7) return false;
        if (!password.matches(".*[A-Z].*")) return false;
        if (!password.matches(".*[0-9].*")) return false;

        return true;
    }
}
