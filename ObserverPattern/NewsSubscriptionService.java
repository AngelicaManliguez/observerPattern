package ObserverPattern;

public class NewsSubscriptionService
{
    public static void main(String[] args)
    {
        NewsAgency newsAgency = new NewsAgency();

        Subscriber angelica = new Subscriber();
        angelica.setSubscriberName("Angelica");

        Subscriber angelo = new Subscriber();
        angelo.setSubscriberName("Angelo");

        Subscriber wanda = new Subscriber();
        wanda.setSubscriberName("Wanda");

        newsAgency.add(angelica);
        newsAgency.add(angelo);

        newsAgency.notifySubscriber();

        newsAgency.remove(angelo);

        newsAgency.add(wanda);

        newsAgency.notifySubscriber();
    }
}
