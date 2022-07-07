package p_5_behavioral_patterns.p_23_observer;

public class ObserverMain {
    public static void main(String[] args) {

        Customer cus1 = new Customer("Kemal Bil");
        Customer cus2 = new Customer("Zehra Bilsin");
        Customer cus3 = new Customer("Ayşe Bilki");

        DailyNews dailyNews = new DailyNews();
        cus1.subscribe(dailyNews);
        cus2.subscribe(dailyNews);
        cus3.subscribe(dailyNews);

        System.out.println("=======================");
        dailyNews.sendNewspaper();

        System.out.println("=======================");
        cus2.cancelSub();
        dailyNews.sendNewspaper();
    }
}
