import java.util.Scanner;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class ShopApp {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.println("========Інтернет-магазин: оформлення замовлення========");

        System.out.print("Введіть назву товару: ");
        String productName = sc.nextLine();

        System.out.print("Введіть опис товару: ");
        String description = sc.nextLine();

        System.out.print("Виберіть категорію товару (наприклад: електроніка, одяг, книги): ");
        String category = sc.nextLine();

        System.out.print("Введіть кількість товару (шт.): ");
        int quantity = sc.nextInt();

        System.out.print("Введіть ціну за одиницю товару (грн): ");
        double unitPrice = sc.nextDouble();
        sc.nextLine(); 

        System.out.print("Введіть розмір знижки (у %, напр. 10): ");
        double discountPercent = sc.nextDouble();
        sc.nextLine();

        double totalBeforeDiscount = quantity * unitPrice;
        double discountAmount = totalBeforeDiscount * (discountPercent / 100);
        double totalPrice = totalBeforeDiscount - discountAmount;

        System.out.println();
        System.out.println("========== Результат ==========");
        System.out.printf("Товар:                   %s%n", productName);
        System.out.printf("Категорія:               %s%n", category);
        System.out.printf("Кількість:               %d шт.%n", quantity);
        System.out.printf("Ціна за одиницю:         %.2f грн%n", unitPrice);
        System.out.printf("Сума без знижки:         %.2f грн%n", totalBeforeDiscount);
        System.out.printf("Знижка:                  %.2f%% (%.2f грн)%n", discountPercent, discountAmount);
        System.out.printf("Сума до сплати:          %.2f грн%n", totalPrice);
        System.out.printf("Опис товару:             %s%n", description);

        sc.close();
    }
}
