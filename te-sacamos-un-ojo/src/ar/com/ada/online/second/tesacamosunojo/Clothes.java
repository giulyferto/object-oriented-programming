package ar.com.ada.online.second.tesacamosunojo;

public class Clothes extends Product {
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void calculateDiscount() {
        if (department.equals("kids") || department.equals("women"))
            discount = price * 0.15;
        else
            discount = 0d;
    }
}
