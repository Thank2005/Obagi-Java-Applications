
import java.util.Scanner;

public class Chapter2Exercises {
    private Scanner input;

    public Chapter2Exercises() {
        this.input = new Scanner(System.in);
    }

    public void runAllExercises() {
        arithmeticOperations();
        compareIntegers();
        arithmeticMinMax();
        displayShapes();
        printPatterns();
        largestAndSmallest();
        oddEvenCheck();
        multiplesCheck();
        checkerboardPattern();
        circleCalculations();
        characterValues();
        separateDigits();
        squaresCubesTable();
        countNumbers();
        bmiCalculator();
        worldPopulationGrowth();
        carPoolSavings();
        
        input.close(); // Close scanner after all exercises
    }

    public void arithmeticOperations() {
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        System.out.printf("Sum: %d%nProduct: %d%nDifference: %d%nQuotient: %d%n",
                num1 + num2, num1 * num2, num1 - num2, (num2 != 0 ? num1 / num2 : 0));
    }

    public void compareIntegers() {
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        if (num1 > num2)
            System.out.printf("%d is larger%n", num1);
        else if (num2 > num1)
            System.out.printf("%d is larger%n", num2);
        else
            System.out.println("These numbers are equal.");
    }

    public void arithmeticMinMax() {
        System.out.print("Enter three integers: ");
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        int sum = a + b + c, product = a * b * c, average = sum / 3;
        int min = Math.min(a, Math.min(b, c)), max = Math.max(a, Math.max(b, c));

        System.out.printf("Sum: %d%nAverage: %d%nProduct: %d%nSmallest: %d%nLargest: %d%n",
                sum, average, product, min, max);
    }

    public void displayShapes() {
        System.out.println("Box:\n*****\n*   *\n*   *\n*   *\n*****");
        System.out.println("\nOval:\n  ***  \n *   * \n*     *\n *   * \n  ***  ");
        System.out.println("\nArrow:\n  *  \n *** \n*****\n  *  \n  *  ");
        System.out.println("\nDiamond:\n  *  \n * * \n*   *\n * * \n  *  ");
    }

    public void printPatterns() {
        System.out.println("*\n**\n***\n****\n*****");
        System.out.println("*\n***\n*****\n****\n**");
    }

    public void largestAndSmallest() {
        System.out.print("Enter five integers: ");
        int smallest = Integer.MAX_VALUE, largest = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            if (num < smallest) smallest = num;
            if (num > largest) largest = num;
        }
        System.out.printf("Smallest: %d%nLargest: %d%n", smallest, largest);
    }

    public void oddEvenCheck() {
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println(number % 2 == 0 ? "Even" : "Odd");
    }

    public void multiplesCheck() {
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
        System.out.println(num1 % num2 == 0 ? num1 + " is a multiple of " + num2 : num1 + " is NOT a multiple of " + num2);
    }

    public void checkerboardPattern() {
        for (int i = 0; i < 8; i++) {
            System.out.println(i % 2 == 0 ? "* * * * * * * *" : " * * * * * * * *");
        }
    }

    public void circleCalculations() {
        System.out.print("Enter radius of circle: ");
        int radius = input.nextInt();
        System.out.printf("Diameter: %d%nCircumference: %.2f%nArea: %.2f%n",
                2 * radius, 2 * Math.PI * radius, Math.PI * radius * radius);
    }

    public void characterValues() {
        char[] chars = {'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '$', '*', '+', '/'};
        for (char c : chars) {
            System.out.printf("The character %c has the value %d%n", c, (int) c);
        }
    }

    public void separateDigits() {
        System.out.print("Enter a five-digit number: ");
        int number = input.nextInt();
        System.out.printf("%d   %d   %d   %d   %d%n",
                number / 10000, (number / 1000) % 10, (number / 100) % 10, (number / 10) % 10, number % 10);
    }

    public void squaresCubesTable() {
        System.out.println("Number\tSquare\tCube");
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d\t%d\t%d%n", i, i * i, i * i * i);
        }
    }

    public void countNumbers() {
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        System.out.println("Enter five numbers: ");
        for (int i = 0; i < 5; i++) {
            int number = input.nextInt();
            if (number > 0) positiveCount++;
            else if (number < 0) negativeCount++;
            else zeroCount++;
        }
        System.out.printf("Positive: %d%nNegative: %d%nZeros: %d%n", positiveCount, negativeCount, zeroCount);
    }

    public void bmiCalculator() {
        System.out.print("Enter weight (kg): ");
        double weight = input.nextDouble();
        System.out.print("Enter height (m): ");
        double height = input.nextDouble();
        double bmi = weight / (height * height);
        System.out.printf("Your BMI: %.2f%n", bmi);
    }

    public void worldPopulationGrowth() {
        System.out.print("Enter the current world population: ");
        long population = input.nextLong();
        System.out.print("Enter the annual growth rate (in percentage): ");
        double growthRate = input.nextDouble();
        for (int i = 1; i <= 5; i++) {
            population += (population * growthRate / 100);
            System.out.printf("Year %d: %d%n", i, population);
        }
    }

    public void carPoolSavings() {
        System.out.print("Enter daily miles driven: ");
        double miles = input.nextDouble();
        System.out.print("Enter cost per gallon of gas: ");
        double costPerGallon = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double mpg = input.nextDouble();
        System.out.print("Enter parking fees per day: ");
        double parking = input.nextDouble();
        System.out.print("Enter tolls per day: ");
        double tolls = input.nextDouble();
        double dailyCost = (miles / mpg * costPerGallon) + parking + tolls;
        System.out.printf("Your daily carpool cost: $%.2f%n", dailyCost);
    }

    public static void main(String[] args) {
        Chapter2Exercises exercises = new Chapter2Exercises();
        exercises.runAllExercises();
    }
}
