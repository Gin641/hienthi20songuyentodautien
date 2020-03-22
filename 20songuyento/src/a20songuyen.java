import java.util.Scanner;

public class a20songuyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen to ");
        int input = sc.nextInt();
        int count = 0;
        int number = 2;
        boolean isPrime = true;
        boolean isNewLine = false;

        while (count < input) {
            for (int index = 2; index <= Math.sqrt(number); index++) {
                if (number % index == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                count++;
                System.out.print(number + " ");
                if (count % 5 == 0) {
                    isNewLine = true;
                }
            }
            if (isNewLine) {
                System.out.println();
                isNewLine = false;
            }
            number++;
            isPrime = true;
        }
    }
}
