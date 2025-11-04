package obs;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(Observable observable) {
        if (observable instanceof ObservableImpl obs) {
            int state = obs.getState();
            System.out.println("=======ObserverImpl1=======");
            double tendency=Math.sqrt(state) * Math.cos(state);
            System.out.println(" Tendency: " + tendency);
            System.out.println("=======ObserverImpl1=======");
        }

    }
}
