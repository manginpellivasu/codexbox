package Interface;

public class Batch1 implements School{
    @Override
    public void studentName() {
        System.out.println("Student name:vaasu");

    }

    @Override
    public void studentRollnumber() {
        System.out.println("roll no:"+1234);

    }

    @Override
    public void studentMarks() {
        System.out.println("marks:"+920);

    }

    @Override
    public void studnetAddress() {
        System.out.println("address:kphb");

    }
}
