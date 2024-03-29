package Collection.PatikaStore;

import java.util.Comparator;

public class OrderMobilePhoneIdComparator implements Comparator<MobilePhone> {
    @Override
    public int compare(MobilePhone o1, MobilePhone o2) {
        return o1.getId() - o2.getId();
    }
}
