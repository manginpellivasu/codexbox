package Oops1;

public final class Immutable {
    private final Integer id;

    public Integer getId() {
        return id;
    }

    public Double getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }

    private final Double salary;

    public String getPhonenumber() {
        return phonenumber;
    }

    private final String phonenumber;
    private final String address;


    public Immutable(Integer id, Double salary, String phonenumber, String address) {
        this.id = id;
        this.salary = salary;
        this.phonenumber = phonenumber;
        this.address = address;
    }
}
