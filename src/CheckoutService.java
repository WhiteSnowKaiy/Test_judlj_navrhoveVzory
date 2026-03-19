public abstract class CheckoutService {
    protected abstract IReceiptFormatter createFormatter();

    public String checkout(String shopName, Item[] items){
        if (shopName == null || shopName.isEmpty()){
            return "Shop Name is invalid!";
        } else if (items == null || items.length == 0){
            return "Items list is empty!";
        }

        IReceiptFormatter formatter = createFormatter();
        return formatter.formatReceipt(shopName, items);
    }
}
