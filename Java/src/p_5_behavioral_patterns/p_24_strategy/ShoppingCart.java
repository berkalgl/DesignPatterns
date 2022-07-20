package p_5_behavioral_patterns.p_24_strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;
    private IPayment payment;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public int totalCall(){
        int sm = 0;
        for(Item item: this.items)
            sm += item.getPrice();

        return sm;
    }
    public void pay(){
        this.payment.pay(totalCall());
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public IPayment getPayment() {
        return payment;
    }

    public void setPayment(IPayment payment) {
        this.payment = payment;
    }
}
