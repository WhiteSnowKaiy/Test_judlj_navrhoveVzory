public class TextCheckoutService extends CheckoutService {
    protected IReceiptFormatter createFormatter() {
        return new TextReceiptFormatter();
    }
}
