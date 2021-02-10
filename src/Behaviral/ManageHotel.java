package Behaviral;

import Creational.Customer;
import Tructoral.IMothods;
import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageHotel extends Customer implements IMothods {
    ArrayList cusInfo = new ArrayList<>();

    List<Customer> listCus = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    @Override
    public void inputCustomer() {
        int index = 0;
        System.out.println("Enter the quantity Cus: ");
        int quantityCus = Integer.parseInt(sc.nextLine());
        do {
            index++;
            System.out.println("Enter the Cus " + index + ":");

            System.out.println("Enter the Name: ");
            setName(sc.nextLine());
            cusInfo.add(this.getName());

            System.out.println("Enter the Id: ");
            setIdentity(sc.nextLine());
            cusInfo.add(this.getIdentity());

            System.out.println("Enter the Telephone: ");
            setTelephone(sc.nextInt());
            cusInfo.add(this.getTelephone());

            System.out.println("Enter the DayRents: ");
            setDayRent(sc.nextInt());
            cusInfo.add(this.getDayRent());

            System.out.println("Enter the RoomNumber: ");
            setRoomNumber(sc.nextInt());
            cusInfo.add(this.getRoomNumber());

        } while (index < quantityCus);
    }

    @Override
    public void editCustomer(int telephone) {

    }

    @Override
    public void deleteCustomer(int telephone) {

    }

    @Override
    public void showCustomer() {

    }

    @Override
    public double checkOut() {
        System.out.println("Enter the Telephone want CheckOut: ");
        int telephone = sc.nextInt();

        for (int i = 0; i < cusInfo.size(); i++) {
            if (this.cusInfo.get(i).equals(telephone)) {
                System.out.println(cusInfo);
            }
        }
        System.out.println(cusInfo.toString());

        double billRoom = 0;
        if (this.getRoomNumber() % 2 == 0) {
            billRoom = this.getDayRent() * TYPE_ROOM_LUXURY;
        } else {
            billRoom = this.getDayRent() * TYPE_ROOM_SIMPLE;
        }
        return billRoom;
    }
}
