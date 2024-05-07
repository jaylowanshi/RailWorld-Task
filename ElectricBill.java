public class ElectricBill {
        public static int calculateBill(int units) {
            return (units <= 100) ? units * 2 :
                    (units <= 200) ? (100 * 2) + (units - 100) * 3 :
                            (units <= 300) ? (100 * 2) + (100 * 3) + (units - 200) * 4 :
                                    (100 * 2) + (100 * 3) + (100 * 4) + (units - 300) * 5;
        }
        public static void main(String[] args) {
            int units = 301;

            System.out.println(calculateBill(units));
        }
    }



