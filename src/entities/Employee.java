package entities;

public class Employee {
    private String name;
    private Integer hours;
    private Double valueHours;

    public Employee(){
    }

    public Employee(String name, Integer hours, Double valueHours) {
        this.name = name;
        this.hours = hours;
        this.valueHours = valueHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValueHours() {
        return valueHours;
    }

    public void setValueHours(Double valueHours) {
        this.valueHours = valueHours;
    }

    public Double payment(){
        return valueHours * hours;
    }
}
