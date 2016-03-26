package by.self.employee.data.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "position")
    private String position;

    @Column(name = "department_id")
    private Integer departmentId;

    @ManyToOne//(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinColumn(name = "department_id", insertable = false, updatable = false)
    private Department department;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String position, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.department = department;
    }

    public Integer getId() {
        return id;
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

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (!id.equals(employee.id)) return false;
        if (!firstName.equals(employee.firstName)) return false;
        if (!lastName.equals(employee.lastName)) return false;
        if (!position.equals(employee.position)) return false;
        return departmentId.equals(employee.departmentId);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + position.hashCode();
        result = 31 * result + departmentId.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", departmentId=" + departmentId +
                '}';
    }
}
