package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld() {
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot() {
        System.out.println("0123456789012345678901" + System.lineSeparator() +
                "         __" + System.lineSeparator() +
                " _(\\    |@@|" + System.lineSeparator() +
                "(__/\\__ \\--/ __" + System.lineSeparator() +
                "   \\___|----|  |   __" + System.lineSeparator() +
                "       \\ }{ /\\ )_ / _\\" + System.lineSeparator() +
                "       /\\__/\\ \\__O (__" + System.lineSeparator() +
                "      (--/\\--)    \\__/" + System.lineSeparator() +
                "      _)(  )(_" + System.lineSeparator() +
                "     `---''---`");


    }

    //todo Task 3
    public void sumOfLiterals() {
        // input your solution here
        char m_z = 'Z';
        int m_hx = 0xFACE;
        float m_f = 100;
        long m_l = (int) 80L;
        double m_d = (int) 44e-1f;
        float m_f2 = (int) 5.5f;
        double m_d2 = (int) 8.88e1;
        double m_d3 = (int) 9.99;


        int sum = m_z + m_hx + (int) m_d2 + (int) m_l + (int) m_f + (int) m_d + (int) m_f2 + (int) m_d3;
        System.out.println(sum);

    }

    //todo Task 4
    public void addTwoNumbers() {
        // input your solution here
        Scanner DScanner = new Scanner(System.in);
        int varA = DScanner.nextInt();
        int varB = DScanner.nextInt();
        System.out.println((int) varA + (int) varB);
    }

    //todo Task 5
    public void swapTwoNumbers() {
        // input your solution here
        Scanner DScanner = new Scanner(System.in);
        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = DScanner.nextInt();
        System.out.print("y: ");
        int y = DScanner.nextInt();

        //swap var
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }


    //todo Task 6
    public void compareTwoNumbers() {
        // input your solution here
        Scanner DScanner = new Scanner(System.in);
        System.out.print("n1: ");
        int n1 = DScanner.nextInt();
        System.out.print("n2: ");
        int n2 = DScanner.nextInt();
        if (n1 > n2){
            System.out.println("n1 > n2");
        } else if (n2 > n1) {
            System.out.println("n2 > n1");
        } else {
            System.out.println("n1 == n2");

        }
    }

    //todo Task 7
    public void ratingSalesPerson() {
        // input your solution here
        Scanner RevenueScan = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int Revenue = RevenueScan.nextInt();
        if (Revenue < 0 || Revenue >= 100000){
            System.out.println("Invalid Revenue");
        } else if (0 == Revenue || Revenue < 20000) {
            System.out.println("Poor Sales Revenue");
        } else if (20000 == Revenue || Revenue < 50000) {
            System.out.println("Average Sales Revenue");
        } else if (50000 == Revenue || Revenue < 80000) {
            System.out.println("Good Sales Revenue");
        } else{
            System.out.println("Excellent Sales Revenue");
        }

    }
    //todo Task 8
    public void getCommissionRate() {
        // input your solution here
        Scanner ScannerA = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int CommissionClass = ScannerA.nextInt();
        switch (CommissionClass) {
            case 1:
                System.out.print("Your Commission Rate was set to "+0.01);
                //break = ausbrechen aus dem switch statement
                break;
            case 2:
                System.out.print("Your Commission Rate was set to "+0.02);
                break;
            case 3:
                System.out.print("Your Commission Rate was set to "+0.03);
                break;
            case 4:
                System.out.print("Your Commission Rate was set to "+0.04);
                break;
            default:
                System.out.print("Your Commission Rate was set to "+0.00);
        }
        System.out.println();
    }
    //Todo Task 9
    public void leapyear() {
        // input your solution here
        Scanner canner = new Scanner(System.in);
        boolean leap = false;
        System.out.print("Year: ");
        int year = canner.nextInt();
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            //The following 9 lines where taken and modified from https://www.programiz.com/java-programming/examples/leap-year last access 3.10.22
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            } else
                leap = true;
        } else
            leap = false;
        if (leap){
            System.out.print("Leapyear"+System.lineSeparator());
        } else System.out.print("Not a Leapyear"+System.lineSeparator());
        }
    //todo Task 10
    public void transposedNumbers() {
        // input your solution here
        Scanner ScannerA = new Scanner(System.in);
        System.out.print("Number: ");
        int Number = ScannerA.nextInt();
        System.out.println((int)(100*(Number%10))+(int)(((Number%100)-(Number%10)))+((int)Number/100));

    }
    public static void main(String[] args) {
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}
