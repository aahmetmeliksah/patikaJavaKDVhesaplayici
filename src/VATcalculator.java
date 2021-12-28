import java.util.Scanner;

public class VATcalculator {
    public static void main(String[] args) {
        double price, VATIncludedPrice, VAT = 0.18;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter price: ");
        price = input.nextDouble();

        double VATForLabel = price * VAT;
        VATIncludedPrice = price + VATForLabel;
        System.out.println("Original price is " + price);
        System.out.println("VAT is " + VATForLabel);
        System.out.println("VAT added price is " + VATIncludedPrice);
    }
}
