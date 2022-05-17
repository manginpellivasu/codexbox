package Oops1;

public class Main {
    public static void main(String[] args) {
        Immutable I=new Immutable(1234,5000.50,"9703202666","kphb");
        System.out.println(I.getId());
        System.out.println(I.getSalary());
        System.out.println(Long.parseLong(I.getPhonenumber()));
        System.out.println(I.getAddress());
    }
}
