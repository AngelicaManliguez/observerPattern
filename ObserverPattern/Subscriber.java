package ObserverPattern;

public class Subscriber implements SubscriberObserver{

    public String subscriberName;

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void updateSubscriber(String news) {
        System.out.println("Good day, " + subscriberName + "! Here is the updated news :) \n");
    }
}
