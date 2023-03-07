public class Main {
    public static void main(String[] args) {
        add();
        subtract();
        divide();
        multiply();

    }

        public static void add() {
            int number1 = 10;
            int number2 = 17;

            int result = number1 + number2;
            System.out.println(result);

        }

        public static void subtract() {
            int number1 = 55;
            int number2 = 35;

            int result = number1 - number2;
            System.out.println(result);
        }

        public static void divide() {
            int number1 = 44;
            int number2 = 2;

            int result = number1 / number2;
            System.out.println(result);
        }

        public static void multiply() {
            int number1 = 12;
            int number2 = 7;

            int result = number1 * number2;
            System.out.println(result);
        }
}