import obs.ObservableImpl;
import obs.Observer;
import obs.ObserverImpl1;
import obs.ObserverImpl2;

public class Test {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        Observer obs1 = new ObserverImpl1();
        Observer obs2 = new ObserverImpl2();
        observable.subscribe(obs1);
        observable.subscribe(obs2);
        System.out.println("-----------");
        observable.setState(14);
        System.out.println("------------");
        observable.setState(23);
        System.out.println("------------");
        observable.setState(22);
    }
}
