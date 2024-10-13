class DocumentProxy implements Document {
    private RealDocument realDocument;
    private String userRole;

    public DocumentProxy(String content, String userRole) {
        this.realDocument = new RealDocument(content);
        this.userRole = userRole;
    }

    @Override
    public void view() {
        realDocument.view();
    }

    @Override
    public void edit() {
        if (userRole.equals("ADMIN")) {
            realDocument.edit();
        } else {
            System.out.println("Access denied. Only admins can edit.");
        }
    }
}