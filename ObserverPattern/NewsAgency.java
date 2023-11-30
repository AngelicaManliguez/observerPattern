package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsAgencySubject{

    private List<Subscriber> subscriberList = new ArrayList<>();

    @Override
    public void add(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void remove(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscriber() {
        for(Subscriber subscriber : subscriberList){
            subscriber.updateSubscriber(publishNews());
        }
    }

    public String publishNews()
    {
        String news = "Bea Binene finally learns how to drive: 'Here's to achieving goals'";

        System.out.println("Breaking news published!");
        System.out.println(news);

        return news;
    }

}
