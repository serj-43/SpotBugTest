public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
        int expected = 300;
        long actual = service.calculate(amount, registered);

        System.out.println("ОР: " + expected + " ФР: " + actual);
    }
}

