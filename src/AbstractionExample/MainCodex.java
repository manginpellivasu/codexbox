package AbstractionExample;

public class MainCodex {
    public static void main(String[] args) {
        Employee Abstract1 = new CodexBoxEg1();
        System.out.println(Abstract1.qualification());
        System.out.println(Abstract1.careerPercentage());
        Abstract1 = new Google();
        System.out.println(Abstract1.qualification());
        System.out.println(Abstract1.careerPercentage());
        Employee Absract2=new Google();
        System.out.println(Absract2.careerPercentage());
    }
}