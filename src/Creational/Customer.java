package Creational;

public class Customer extends Person{
    private int telephone;
    private int dayRent;
    private int roomNumber;

    public Customer() {
    }

    public Customer(int telephone, int dayRent, int roomNumber) {
        this.telephone = telephone;
        this.dayRent = dayRent;
        this.roomNumber = roomNumber;
    }

    public Customer(String name, String identity, int telephone, int dayRent, int roomNumber) {
        super(name, identity);
        this.telephone = telephone;
        this.dayRent = dayRent;
        this.roomNumber = roomNumber;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getDayRent() {
        return dayRent;
    }

    public void setDayRent(int dayRent) {
        this.dayRent = dayRent;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "Customer{" +
                "telephone='" + telephone + '\'' +
                ", dayRent=" + dayRent +
                ", typeRoom='" + roomNumber + '\'' +
                '}';
    }
}
