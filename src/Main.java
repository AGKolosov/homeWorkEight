import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int[] massOne = new int[3];
        massOne[0] = 1;
        massOne[1] = 2;
        massOne[2] = 3;
        double[] massTwo = {1.57d, 7.654d, 9.986d};
        int[] massThree = {-3, -2, -1, 0, 1, 2, 3};
        System.out.println("Task 2");

        for (int i = 0; i < massOne.length; i++) {
            System.out.print(massOne[i]);
            if (i < massOne.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < massTwo.length; i++) {
            System.out.print(massTwo[i]);
            if (i < massTwo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < massThree.length; i++) {
            System.out.print(massThree[i]);
            if (i < massThree.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Task 3");
        for (int i = massOne.length - 1; i >= 0; i--) {
            System.out.print(massOne[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = massTwo.length - 1; i >= 0; i--) {
            System.out.print(massTwo[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = massThree.length - 1; i >= 0; i--) {
            System.out.print(massThree[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Task 4");
        //int[] code = {1, 2, 3};
        for (int i = 0; i < massOne.length; i++) {
            if (massOne[i] % 2 != 0) {
                massOne[i] = massOne[i] + 1;
            }
        }
        System.out.print(Arrays.toString(massOne));
    }
}
