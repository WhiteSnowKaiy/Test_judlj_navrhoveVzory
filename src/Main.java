void main() {
    Item[] items = {
            new Item(
                    "Karel",
                    33
            ),
            new Item(
                    "Banan",
                    25
            ),
            new Item(
                    "Jablek",
                    85
            )
    };

    CheckoutService s1 = new TextCheckoutService();
    System.out.println(s1.checkout("kiosk", items));

    CheckoutService s2 = new CsvCheckoutService();
    System.out.println(s2.checkout("kiosk", items));
}
