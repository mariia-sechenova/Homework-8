public class Main {
public static void main(String[] args) {
        // Task 1. Array: 1,2,3
        System.out.println("Task 1. Array Initialization");

        int[] numbers = new int[]{1, 2, 3};
        double[] fractionalNumbers = new double[]{1.57, 7.654, 9.986};
        String[] seasons = new String[4];
        seasons[0] = "Winter";
        seasons[1] = "Spring";
        seasons[2] = "Summer";
        seasons[3] = "Autumn";

        // Task 2. Print each element of an array.
        System.out.println("\nTask 2. Array Print");
        for (int i = 0; i < numbers.length - 1; i++) {
        System.out.printf("%d, ", numbers[i]);
        }
        System.out.printf("%d\n", numbers[numbers.length - 1]);

        for (int i = 0; i < fractionalNumbers.length - 1; i++) {
        System.out.printf("%.3f, ", fractionalNumbers[i]);
        }
        System.out.printf("%.3f\n", fractionalNumbers[fractionalNumbers.length - 1]);

        for (int i = 0; i < seasons.length - 1; i++) {
        System.out.printf("%s, ", seasons[i]);
        }
        System.out.printf("%s\n", seasons[seasons.length - 1]);

        // Task 3. Print each element of an array backward.
        System.out.println("\nTask 3. Array Print backward");

        for (int i = numbers.length - 1; i > 0; i--) {
        System.out.printf("%d, ", numbers[i]);
        }
        System.out.printf("%d\n", numbers[0]);

        for (int i = fractionalNumbers.length - 1; i > 0; i--) {
        System.out.printf("%.3f, ", fractionalNumbers[i]);
        }
        System.out.printf("%.3f\n", fractionalNumbers[0]);

        for (int i = seasons.length - 1; i > 0; i--) {
        System.out.printf("%s, ", seasons[i]);
        }
        System.out.printf("%s\n", seasons[0]);

        // Task 4. Print: odd elements -> even elements.
        System.out.println("\nTask 4. Odd -> Even");

        for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] % 2 != 0) {
        numbers[i] = numbers[i] + 1;
        }
        }
        for (int i = 0; i < numbers.length - 1; i++) {
        System.out.printf("%d, ", numbers[i]);
        }
        System.out.printf("%d\n", numbers[numbers.length - 1]);
        }
        }

