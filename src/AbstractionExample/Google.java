package AbstractionExample;

public class Google extends Employee {

    @Override
    String qualification() {
        return "B.TECH and M.TECH";
    }

    @Override
    String careerPercentage() {
        return "70%";
    }
}
