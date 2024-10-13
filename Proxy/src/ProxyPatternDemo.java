public class ProxyPatternDemo {
    public static void main(String[] args) {
        Document documentUser = new DocumentProxy("Confidential Content", "USER");
        Document documentAdmin = new DocumentProxy("Confidential Content", "ADMIN");

        System.out.println("User actions:");
        documentUser.view();
        documentUser.edit();

        System.out.println("\nAdmin actions:");
        documentAdmin.view();
        documentAdmin.edit();
    }
}