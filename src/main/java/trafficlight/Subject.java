package trafficlight;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observerList = new ArrayList<>();

    //add observer to the list
    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    //remove observer from list
    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }

    //notify all observers in the list
    public void notifyObserver(){
        for (Observer o: observerList) {
            o.update();
        }
    }

   /* public List<Observer> getObserverList() {
        return this.observerList;
    }*/
}
