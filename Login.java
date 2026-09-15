public class Login {

    public static boolean authenticate(String username, String password) {
        return username.equals("admin") && password.equals("admin123");
    }

    public static void main(String[] args) {
        System.out.println(authenticate("admin", "admin123"));
    }
}
