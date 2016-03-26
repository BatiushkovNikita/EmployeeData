package by.self.employee.data.vo;

import by.self.employee.data.model.Department;

public class EmployeeVO {

    private Integer id;
    private String firstName;
    private String lastName;
    private String position;
    private String departmentName;

    public EmployeeVO() {
    }

    public EmployeeVO(String firstName, String lastName, String position, String departmentName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.departmentName = departmentName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeVO that = (EmployeeVO) o;

        if (!departmentName.equals(that.departmentName)) return false;
        if (!firstName.equals(that.firstName)) return false;
        if (!id.equals(that.id)) return false;
        if (!lastName.equals(that.lastName)) return false;
        if (!position.equals(that.position)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + position.hashCode();
        result = 31 * result + departmentName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "EmployeeVO{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
