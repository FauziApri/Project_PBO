package pkg1_project;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n========== TUGAS PBO ===============");
        System.out.println("========== KELOMPOK 3 R5P ==========");
        System.out.println("1. Muhamad Farahim                  (202343501348)");
        System.out.println("2. Fauzi Apri Diyanarta             (202343501334)");
        System.out.println("3. Muhammad Razan Athaya Hartawan   (202343501327)");
        System.out.println("4. Hanifah Tasya Rona Suprawiro     (202343501313)");
        System.out.println("5. Kevin Wijaya                     (202443570087)");
        System.out.println("----------------------------------------------");

        AppContext ctx = new AppContext();
        MenuRouter router = new MenuRouter();

        router.start(ctx);
    }
}
