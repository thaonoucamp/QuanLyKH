package Tructoral;

import Creational.Customer;

public interface IMothods {
    int TYPE_ROOM_SIMPLE = 1000;
    int TYPE_ROOM_LUXURY = 2000;

    void inputCustomer();
    void editCustomer(int telephone);
    void deleteCustomer(int telephone);
    void showCustomer();
    double checkOut();

}
