import java.util.ArrayList;
import java.util.List;


// Usage
public class ObserverPatternDemo {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        
        Observer channel1 = new NewsChannel("Channel 1");
        Observer channel2 = new NewsChannel("Channel 2");

        agency.attach(channel1);
        agency.attach(channel2);

        agency.setNews("Breaking News: Observer Pattern in Action!");
        
        agency.detach(channel1);
        agency.setNews("Update: Design Patterns are Powerful!");
    }
    
    // inner classes:

 // Subject (Observable)
 interface Subject {
     void attach(Observer o);
     void detach(Observer o);
     void notifyObservers();
 }

 public static class NewsAgency implements Subject {
     private List<Observer> observers = new ArrayList<>();
     private String news;

     public void setNews(String news) {
         this.news = news;
         notifyObservers();
     }

     public String getNews() {
         return news;
     }

     @Override
     public void attach(Observer o) {
         observers.add(o);
     }

     @Override
     public void detach(Observer o) {
         observers.remove(o);
     }

     @Override
     public void notifyObservers() {
         for (Observer o : observers) {
             o.update(news);
         }
     }
 }

 // Observer
 interface Observer {
     void update(String news);
 }

 public static class NewsChannel implements Observer {
     private String channelName;

     public NewsChannel(String name) {
         this.channelName = name;
     }

     @Override
     public void update(String news) {
         System.out.println(channelName + " received news update: " + news);
     }
 }
}