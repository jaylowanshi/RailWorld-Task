import java.util.Scanner;

public class IntToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("Binary representation: " + toBinaryString(number));
    }

    public static String toBinaryString(int number) {
        if (number == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            binary.insert(0, number % 2);
            number = number / 2;
        }

        return binary.toString();
    }
}

