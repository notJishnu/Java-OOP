import java.util.Scanner;

class JaggedArray {
    int marks[][];
    String names[] = {"Child1", "Child2", "Child3", "Child4", "Child5"};

    // Constructor: allocate memory as per given subjects
    JaggedArray() {
        marks = new int[5][];
        marks[0] = new int[3]; // Child1
        marks[1] = new int[5]; // Child2
        marks[2] = new int[2]; // Child3
        marks[3] = new int[6]; // Child4
        marks[4] = new int[4]; // Child5
    }

    // Input marks
    void input() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks for " + names[i] + ":");
            for (int j = 0; j < marks[i].length; j++) {
                marks[i][j] = sc.nextInt();
            }
        }
    }

    // Display marks row-wise
    void display() {
        System.out.println("\nMarks of Children:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(names[i] + ": ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Total marks of each child
    void totalMarks() {
        System.out.println("\nTotal Marks:");
        for (int i = 0; i < marks.length; i++) {
            int total = 0;
            for (int j = 0; j < marks[i].length; j++) {
                total += marks[i][j];
            }
            System.out.println(names[i] + " = " + total);
        }
    }

    // Count marks greater than 80
    void countAbove80() {
        System.out.println("\nMarks greater than 80:");
        for (int i = 0; i < marks.length; i++) {
            int count = 0;
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] > 80)
                    count++;
            }
            System.out.println(names[i] + " = " + count);
        }
    }

    // Alert for marks less than 30
    void alertBelow30() {
        System.out.println("\n⚠ Marks less than 30:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(names[i] + ": ");
            boolean found = false;

            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] < 30) {
                    System.out.print(marks[i][j] + " ");
                    found = true;
                }
            }

            if (!found)
                System.out.print("None");

            System.out.println();
        }
    }
}

// Main Class
public class A11Q1 {
    public static void main(String[] args) {

        JaggedArray obj = new JaggedArray();

        obj.input();
        obj.display();
        obj.totalMarks();
        obj.countAbove80();
        obj.alertBelow30();
    }
}