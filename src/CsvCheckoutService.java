public class CsvCheckoutService extends CheckoutService {
    protected IReceiptFormatter createFormatter() {
        return new CsvReceiptFormatter();
    }
}
