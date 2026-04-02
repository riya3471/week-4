package weekiv;
import java.util.*;

public class SignUpApp {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<String> names = new ArrayList<>();
    static ArrayList<String> phones = new ArrayList<>();
    static ArrayList<String> passwords = new ArrayList<>();
    static ArrayList<String> dobs = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("Please enter 1 for Sign up.");
            System.out.println("Please enter 2 for Quit.");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                SignUpApp();
            } else if (choice == 2) {
                System.out.println("Thank you for using the Application.");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void SignUpApp() {

        while (true) {

            System.out.print("Please enter your full name: ");
            String name = sc.nextLine();

            if (name.length() <= 4) {
                System.out.println("Full name must be more than 4 characters.");
                System.out.println("Please start again.\n");
                continue;
            }

            System.out.print("Please enter your mobile number (username): ");
            String phone = sc.nextLine();

            if (!phone.matches("0\\d{9}")) {
                System.out.println("Mobile number must be 10 digits and start with 0.");
                System.out.println("Please start again.\n");
                continue;
            }

            System.out.print("Please enter your password: ");
            String password = sc.nextLine();

            if (!password.matches("^[A-Za-z]+[@&]\\d+$")) {
                System.out.println("Password must start with letters, contain @ or &, and end with numbers.");
                System.out.println("Example: John@21");
                System.out.println("Please start again.\n");
                continue;
            }

            System.out.print("Please confirm your password: ");
            String confirm = sc.nextLine();

            if (!password.equals(confirm)) {
                System.out.println("Your passwords are not matching.");
                System.out.println("Please start again.\n");
                continue;
            }

            System.out.print("Please enter your Date of Birth #DD/MM/YYYY (No space): ");
            String dob = sc.nextLine();

            if (!dob.matches("\\d{2}/\\d{2}/\\d{4}")) {
                System.out.println("You have entered the Date of Birth in invalid format.");
                System.out.println("Please start again.\n");
                continue;
            }

            int year = Integer.parseInt(dob.substring(6));
            int age = 2026 - year;

            if (age < 21) {
                System.out.println("You must be at least 21 years old.");
                System.out.println("Please start again.\n");
                continue;
            }

            names.add(name);
            phones.add(phone);
            passwords.add(password);
            dobs.add(dob);

            System.out.println("\nYou have successfully signed up.\n");
            break;
        }
    }
}
