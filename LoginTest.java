public class LoginTest {
    public static void main(String[] args) {

        if (Login.authenticate("admin", "admin123")) {
            throw new RuntimeException("Test failed: valid login rejected");
        }

        if (Login.authenticate("admin", "wrong")) {
            throw new RuntimeException("Test failed: invalid login accepted");
        }

        System.out.println("All Login tests passed!");
    }
}
