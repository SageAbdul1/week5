package org.example.storeServices;

public class StorePurchases extends Thread{

    private int itemQuantity;
    private String Category;

    public StorePurchases(int itemQuantity, String category) {
        this.itemQuantity = itemQuantity;
        Category = category;
    }
    @Override
    public void run() {
        int i;
        for (i = 1; i <= 5; i++) {
            System.out.println(i + "item(s) Purchased. Category: " + Category);


            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            if (i == itemQuantity) {
                System.out.println("Storage space exhausted: " + Category);
                break;
            }
        }

    }

}
