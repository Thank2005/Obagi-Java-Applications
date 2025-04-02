import java.util.Scanner;
import java.util.HashMap;

public class UtilityApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Welcome to the Utility App =====");
            System.out.println("1. Carbon Footprint Calculator");
            System.out.println("2. BMI Calculator");
            System.out.println("3. Gender Neutrality Text Processor");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    calculateCarbonFootprint(scanner);
                    break;
                case 2:
                    calculateBMI(scanner);
                    break;
                case 3:
                    processGenderNeutralText(scanner);
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please select 1, 2, 3, or 4.");
            }
        }
    }

    // Method for Carbon Footprint Calculator
    public static void calculateCarbonFootprint(Scanner scanner) {
        System.out.println("\n=== Carbon Footprint Calculator ===");
        System.out.print("Enter miles driven per year: ");
        double milesDriven = scanner.nextDouble();

        System.out.print("Enter fuel efficiency (miles per gallon): ");
        double fuelEfficiency = scanner.nextDouble();

        final double CO2_EMISSION_FACTOR = 19.6; // CO2 lbs per gallon of gasoline
        double fuelUsed = milesDriven / fuelEfficiency;
        double carbonFootprint = fuelUsed * CO2_EMISSION_FACTOR;

        System.out.printf("Your annual carbon footprint is %.2f lbs of CO2.\n", carbonFootprint);
    }

    // Method for BMI Calculator
    public static void calculateBMI(Scanner scanner) {
        System.out.println("\n=== BMI Calculator ===");
        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = scanner.nextDouble();

        double bmi = (weight * 703) / (height * height);

        System.out.printf("Your BMI is %.2f\n", bmi);

        // Display weight category
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 24.9) {
            System.out.println("Category: Normal weight");
        } else if (bmi < 29.9) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");
        }
    }

    // Method for Gender Neutrality Text Processor
    public static void processGenderNeutralText(Scanner scanner) {
        System.out.println("\n=== Gender Neutrality Text Processor ===");
        System.out.print("Enter a paragraph of text: ");
        String inputText = scanner.nextLine();

        // Define gender-specific words and their neutral replacements
        HashMap<String, String> genderNeutralMap = new HashMap<>();
        genderNeutralMap.put("man", "person");
        genderNeutralMap.put("woman", "person");
        genderNeutralMap.put("husband", "spouse");
        genderNeutralMap.put("wife", "spouse");
        genderNeutralMap.put("boy", "child");
        genderNeutralMap.put("girl", "child");
        genderNeutralMap.put("son", "child");
        genderNeutralMap.put("daughter", "child");
        genderNeutralMap.put("he", "they");
        genderNeutralMap.put("she", "they");
        genderNeutralMap.put("him", "them");
        genderNeutralMap.put("her", "them");

        // Replace gender-specific words with neutral alternatives
        String processedText = inputText;
        for (String key : genderNeutralMap.keySet()) {
            processedText = processedText.replaceAll("\\b" + key + "\\b", genderNeutralMap.get(key));
        }

        System.out.println("\nGender-neutral text:");
        System.out.println(processedText);
    }
}
