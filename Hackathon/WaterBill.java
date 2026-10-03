import java.util.Scanner;

class WaterBill {
    public static void main(String[] args) {
        System.out.println("Enter Water bill amount");
        Scanner sc = new Scanner(System.in);

        double consumption = sc.nextDouble();

        if (consumption <= 500.0) {
            System.out.println("Water Bill: Rs.100");
        } else {
            System.out.println("Water Bill: Rs.200");
        }
    }
}