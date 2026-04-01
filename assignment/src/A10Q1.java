import java.util.Scanner;

class Array {
    int arr[];
    int size;

    // Constructor: allocate memory and initialize to zero
    Array(int s) {
        size = s;
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 0;
        }
    }

    // Input elements
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Display elements
    void display() {
        System.out.println("Array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Sum and Average
    void sumAverage() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / size;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }

    // Swap max and min
    void swapMaxMin() {
        int maxIndex = 0, minIndex = 0;

        for (int i = 1; i < size; i++) {
            if (arr[i] > arr[maxIndex])
                maxIndex = i;
            if (arr[i] < arr[minIndex])
                minIndex = i;
        }

        int temp = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = temp;

        System.out.println("After swapping max and min:");
        display();
    }

    // Occurrence of unique elements
    void occurrence() {
        System.out.println("Occurrences of unique elements:");
        for (int i = 0; i < size; i++) {
            boolean visited = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    visited = true;
                    break;
                }
            }

            if (!visited) {
                int count = 1;
                for (int k = i + 1; k < size; k++) {
                    if (arr[i] == arr[k])
                        count++;
                }
                System.out.println(arr[i] + " occurs " + count + " times");
            }
        }
    }

    // Convert to single digit repeatedly
    int makeSingleDigit(int num) {
        while (num > 9) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    // Form three-digit numbers and find greatest
    void greatestThreeDigit() {
        int greatest = 0;

        for (int i = 0; i < size; i += 2) {

            int d1 = (i < size) ? makeSingleDigit(arr[i]) : 0;
            int d2 = (i + 1 < size) ? makeSingleDigit(arr[i + 1]) : 0;
            int d3 = (i + 2 < size) ? makeSingleDigit(arr[i + 2]) : 0;

            int number = d1 * 100 + d2 * 10 + d3;

            System.out.println("Formed number: " + number);

            if (number > greatest)
                greatest = number;
        }

        System.out.println("Greatest three-digit number = " + greatest);
    }
}

// Main Class
public class A10Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        Array obj = new Array(n);

        obj.input();
        obj.display();
        obj.sumAverage();
        obj.swapMaxMin();
        obj.occurrence();
        obj.greatestThreeDigit();
    }
}