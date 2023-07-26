package Collection.PatikaStore;

import java.util.Comparator;

public class OrderNotebookIdComparator implements Comparator<Notebook> {
    @Override
    public int compare(Notebook o1, Notebook o2) {
        return o1.getId() - o2.getId();
    }
}
