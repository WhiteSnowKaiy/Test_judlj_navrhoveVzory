public class CsvReceiptFormatter implements  IReceiptFormatter {
    @Override
    public String formatReceipt(String shopName, Item[] items) {
        StringBuilder sb = new StringBuilder();

        String formatted = "shop,item,price\n";
        sb.append(formatted);

        int total = 0;
        for (Item item : items) {
            total += item.getPrice();
            sb.append(shopName).append(",").append(item.getName()).append(",").append(item.getPrice()).append("Kc\n");
        }

        sb.append("TOTAL,,").append(total).append("Kc\n");
        formatted = sb.toString();

        return formatted;
    }
}
