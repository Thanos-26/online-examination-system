public class Login {
    public static boolean authenticate(String username, String password) {
        return username.equals("admin") && password.equals("admin123");
    }

    public static void main(String[] args) {
        System.out.println("Online Examination System - Login Module");
        
        if (authenticate("admin", "admin123")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
    }
}
