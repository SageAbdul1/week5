package org.example.storeServices;

public class StoreSales extends Thread {

    private String name;

    private String phoneNumber;

    private String itemPurchased;

    public StoreSales(String name, String phoneNumber, String itemPurchased) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.itemPurchased = itemPurchased;
    }

    @Override
    public void run() {
        for (int i= 1; i<3; i++){
            System.out.println(i + "Customer Name: " + name + "Customer PhoneNumber" + phoneNumber + "Purchased" + itemPurchased);
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        }
        }

    }


