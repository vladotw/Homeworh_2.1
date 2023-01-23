package pro.sky.java.course2.hw2_1.mechanic;

import pro.sky.java.course2.hw2_1.bus.Bus;
import pro.sky.java.course2.hw2_1.transport.Transport;

public class Mechanic {

    private String name;
    private String company;
private WorkType type;

    public Mechanic(String name,
                    String company,
                    WorkType type) {

        setName(name);
        setCompany(company);
        this.type = type;
    }

    public void performMaintenance(Transport transport) {

            if (transport instanceof Bus) {
                System.out.println("Автобусы не могут проходить техобслуживание");
            } else {
                System.out.println("Мастер " + getName() +  " проводит техобслуживание" + transport.getBrand() +
                        " " + transport.getModel());
            }

    }

    public void fixTransport(Transport transport) {

            System.out.println("Мастер " + getName() + " ремонтирует ТС " + transport.getBrand() + " " +
                    transport.getModel());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Название компании не может быть пустым");
        } else {
            this.name = name;
        }

    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if (company == null || company.isBlank()) {
            throw new IllegalArgumentException("Название компании не может быть пустым");
        } else {
            this.company = company;
        }

    }

    public WorkType getType() {
        return type;
    }

    public void setType(WorkType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Mechanic: "  + name +
                " из компании " + company;
    }

}
