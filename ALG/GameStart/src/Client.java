public class Client {

    public static void searchCarParking() {

        for (int i = 1; i <= 121; i++) {
            if ((i * (i+1) / 2) % 5 == 0) {
                System.out.println("Lugares Disponiveis: " + i);
            }
        }
    }

}
