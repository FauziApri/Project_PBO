package pkg1_project;

public class Main {
    public static void main(String[] args) {
        AppContext ctx = new AppContext();
        MenuRouter router = new MenuRouter();

        router.start(ctx);
    }
}
