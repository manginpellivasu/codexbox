package AbstractionExample;

public abstract class Employee {
    private Integer Id;
    private Long salary;
    private String address;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    abstract String qualification();
    abstract String careerPercentage();



      }
