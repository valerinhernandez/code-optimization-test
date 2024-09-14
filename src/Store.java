public class Store {

    public static final int PRICE_PRODUCT1 ;
    public static final int PRICE_PRODUCT2 ;
    public static final int PRICE_PRODUCT3 ;
    public static final int QUANTITY_PRODUCT_1 

    public static void main(String[] args) {
        int p1 = 15;
        int p2 = 10;
        int p3 = 5;

        int total1 = p1 * 2;
        int total2 = p2 * 3;
        int total3 = p3 * 4;

        int totalSales = total1 + total2 + total3;

        if (totalSales > 50) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
