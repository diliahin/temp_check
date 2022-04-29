public class Food {
    public static void main(String[] args) {
        int money = 10000;
        if (money < 100) {
            System.out.println("Купуй мівіну");
            }
        else if (money > 100 && money < 499) {
            System.out.println("Подумай");
        }
        else {
            System.out.println("Купуй піццу");
        }
    }
}
