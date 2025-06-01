import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {

    static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    static final String NUMBERS = "0123456789";
    static final String SPECIALS = "!@#$%^&*()-_=+[]{};:<>?/";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        System.out.println("🔐 Password Generator");

        System.out.print("Enter desired password length: ");
        int length = scanner.nextInt();

        System.out.print("Include uppercase letters? (yes/no): ");
        boolean includeUpper = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include lowercase letters? (yes/no): ");
        boolean includeLower = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include numbers? (yes/no): ");
        boolean includeNumbers = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include special characters? (yes/no): ");
        boolean includeSpecials = scanner.next().equalsIgnoreCase("yes");

        if (!includeUpper && !includeLower && !includeNumbers && !includeSpecials) {
            System.out.println("❌ You must select at least one character type!");
            return;
        }

        String characterPool = "";
        if (includeUpper) characterPool += UPPERCASE;
        if (includeLower) characterPool += LOWERCASE;
        if (includeNumbers) characterPool += NUMBERS;
        if (includeSpecials) characterPool += SPECIALS;

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterPool.length());
            password.append(characterPool.charAt(index));
        }

        System.out.println("\n✅ Generated Password: " + password.toString());
        scanner.close();
    }
}
