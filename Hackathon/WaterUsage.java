import java.util.Scanner;

class WaterUsage {
    
    static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Usage of water in morning hours :");
        int morningUsage = sc.nextInt();
        System.out.println("Usage of water in evening hours :");
        int eveningUsage = sc.nextInt();

        int total = calculateTotal(morningUsage, eveningUsage);

        System.out.println("Total water consumption: " + total);
    }
}