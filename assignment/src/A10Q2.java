import java.util.Scanner;

// OneDArray Class
class OneDArray {
    int arr[];

    // Constructor to allocate memory
    OneDArray(int n) {
        arr = new int[n];
    }

    // Method to show array
    void show() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// TwoDArray Class
class TwoDArray {
    int arr[][];
    int rows = 2;
    int cols;

    // Constructor to allocate (2 x n)
    TwoDArray(int n) {
        cols = n;
        arr = new int[rows][cols];
    }

    // Input method
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements for 2 x " + cols + " matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    // Display row-wise
    void display() {
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Split into two OneDArray objects
    void split(OneDArray obj1, OneDArray obj2) {
        for (int j = 0; j < cols; j++) {
            obj1.arr[j] = arr[0][j];  // First row
            obj2.arr[j] = arr[1][j];  // Second row
        }
    }

    // Add two matrices
    TwoDArray add(TwoDArray obj) {
        TwoDArray result = new TwoDArray(cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.arr[i][j] = this.arr[i][j] + obj.arr[i][j];
            }
        }
        return result;
    }

    // Multiply two matrices (2 x n) * (2 x n) possible only if n = 2
    TwoDArray multiply(TwoDArray obj) {
        TwoDArray result = new TwoDArray(cols);

        if (cols != rows) {
            System.out.println("Multiplication not possible unless matrix is 2 x 2.");
            return result;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.arr[i][j] = 0;
                for (int k = 0; k < cols; k++) {
                    result.arr[i][j] += this.arr[i][k] * obj.arr[k][j];
                }
            }
        }
        return result;
    }
}

// Main Class
public class A10Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter column size (n): ");
        int n = sc.nextInt();

        // Create two TwoDArray objects
        TwoDArray t1 = new TwoDArray(n);
        TwoDArray t2 = new TwoDArray(n);

        // Input data
        t1.input();
        t2.input();

        // Display
        System.out.println("\nFirst Matrix:");
        t1.display();

        System.out.println("\nSecond Matrix:");
        t2.display();

        // Split first matrix
        OneDArray o1 = new OneDArray(n);
        OneDArray o2 = new OneDArray(n);

        t1.split(o1, o2);

        System.out.println("\nAfter Splitting First Matrix:");
        o1.show();
        o2.show();

        // Addition
        TwoDArray sum = t1.add(t2);
        System.out.println("\nAddition Result:");
        sum.display();

        // Multiplication
        TwoDArray mul = t1.multiply(t2);
        System.out.println("\nMultiplication Result:");
        mul.display();
    }
}