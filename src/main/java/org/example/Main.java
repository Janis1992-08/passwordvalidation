package org.example;

public class Main {
    private final String password;
    private final String[] commonPasswords = {"Password1", "Aa345678"};

    public Main(String password) {
        this.password = password;
    }

    public String validate() {
        if (isPasswordLongEnough() && containsUpperAndLowerCase() && containsDigit() && !isCommonPassword()) {
            return "Your password is valid";
        } else {
            return "Your password is invalid";
        }
    }

    public String generatePassword() {
        return "Not implemented yet";
    }

    private boolean isPasswordLongEnough() {
        return password.length() >= 8;
    }

    private boolean containsUpperAndLowerCase() {
        return password.matches(".*[A-Z].*") && password.matches(".*[a-z].*");
    }

    private boolean containsDigit() {
        return password.matches(".*\\d.*");
    }

    private boolean isCommonPassword() {
        for (String commonPassword : commonPasswords) {
            if (password.equals(commonPassword)) {
                return true;
            }
        }
        return false;
    }
}
