package ObserverPattern;

public interface NewsAgencySubject
{
    void add(Subscriber subscriber);//Subscribe
    void remove(Subscriber subscriber);//Unsubscribe
    void notifySubscriber();
}
