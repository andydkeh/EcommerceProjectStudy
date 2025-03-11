package models;

import java.util.ArrayList;

public class Client extends User{

    ArrayList<String> purchaseHistory = new ArrayList<String>();

    public Client(String name, String email, String address) {
        super(name, email, address);
    }

    //depois da classe order for criada alterar esse parametro
    public void addPurchase(String order) {
        purchaseHistory.add(order);
    }

    public void showPurchaseHistory() {
        System.out.println("[Purchases made]");
        for (String item : purchaseHistory) {
            System.out.println(item);
        }
    }
}
