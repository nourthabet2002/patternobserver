package obs;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
    private List<Double> history= new ArrayList<>();
    @Override
    public void update(Observable observable) {
        if(observable instanceof ObservableImpl obs){
            int state=obs.getState();
            System.out.println("********ObserverImpl2********");
            history.add(Double.valueOf(state));
            double sum = 0;
            for (int i = 0; i < history.size(); i++) {
                sum += history.get(i);
                System.out.println(history.get(i));
            }
            System.out.println("AVG: " + sum / history.size());
        }

    }
}
