import java.util.Scanner;
class HouseHold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number Of Family Members Are :");
        int familyMembers = sc.nextInt();
        System.out.println("Water Consumed For Family :");
        double waterConsumed = sc.nextDouble();
        System.out.println("House Number is :");
        int houseNumber = sc.nextInt();
        System.out.println("Water Usage :");
        char waterUsageStatus = sc.next().charAt(0);

        System.out.println("Number of family members: " + familyMembers);
        System.out.println("Water consumed in litres: " + waterConsumed);
        System.out.println("House number: " + houseNumber);
        System.out.println("Water usage status: " + waterUsageStatus);
    }
}