package entities;

public class OutSourceEmployee extends Employee{
    private Double additionalChager;

    public OutSourceEmployee(){
        super();
    }
    public OutSourceEmployee(String name, Integer hours, Double valueHours, Double additionalChager) {
        super(name, hours, valueHours);
        this.additionalChager = additionalChager;
    }

    public Double getAdditionalChager() {
        return additionalChager;
    }

    public void setAdditionalChager(Double additionalChager) {
        this.additionalChager = additionalChager;
    }

    @Override
    public Double payment(){
        return super.payment() + additionalChager * 1.1;
    }
}
