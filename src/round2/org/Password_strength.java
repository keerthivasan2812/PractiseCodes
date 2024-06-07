package round2.org;

public class Password_strength {
    public static void main(String[] args) {
        String password = "Qwerty@123"; // Example password

        // Define regex patterns for each rule
        String uppercasePattern = "[A-Z]";
        String lowercasePattern = "[a-z]";
        String numberPattern = "\\d";
        String specialCharPattern = "[^a-zA-Z0-9\\s]"; // Matches any character that is not alphanumeric or whitespace

        // Count the number of characters matching each rule
        int uppercaseCount = password.replaceAll(uppercasePattern, "").length();
        int lowercaseCount = password.replaceAll(lowercasePattern, "").length();
        int numberCount = password.replaceAll(numberPattern, "").length();
        int specialCharCount = password.replaceAll(specialCharPattern, "").length();

        // Count the total number of rules satisfied
        int totalRulesSatisfied = 0;
        if (uppercaseCount > 0) totalRulesSatisfied++;
        if (lowercaseCount > 0) totalRulesSatisfied++;
        if (numberCount > 0) totalRulesSatisfied++;
        if (specialCharCount > 0) totalRulesSatisfied++;

        // Determine password strength based on the number of rules satisfied
        String strength;
        switch (totalRulesSatisfied) {
            case 1:
                strength = "Weak";
                break;
            case 2:
                strength = "Medium";
                break;
            case 3:
                strength = "Good";
                break;
            case 4:
                strength = "Strong";
                break;
            default:
                strength = "Weak"; // If no rules are satisfied
                break;
        }

        // Output password strength
        System.out.println("Password strength: " + strength);
    }
}
