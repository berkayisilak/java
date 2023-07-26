package Collection.InsuranceManagement;

public class AddressManager {
    public static void addAddress(User user, Address address) {
        if (user.getAddresses() == null) {
            user.getAddresses().add(address);
        } else {
            user.getAddresses().add(address);
        }

    }

    public static void deleteAddress(User user, Address address) {
        user.getAddresses().remove(address);
    }
}
