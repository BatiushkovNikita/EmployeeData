package by.self.employee.data.vo;

public class EmployeeVO {

    private Integer id;
    private String firstName;
    private String lastName;
    private Integer positionId;
    private Integer departmentId;
    private String positionName;
    private String departmentName;

    public EmployeeVO() {
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

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeVO that = (EmployeeVO) o;

        if (!departmentId.equals(that.departmentId)) return false;
        if (!departmentName.equals(that.departmentName)) return false;
        if (!firstName.equals(that.firstName)) return false;
        if (!id.equals(that.id)) return false;
        if (!lastName.equals(that.lastName)) return false;
        if (!positionId.equals(that.positionId)) return false;
        if (!positionName.equals(that.positionName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + positionId.hashCode();
        result = 31 * result + departmentId.hashCode();
        result = 31 * result + positionName.hashCode();
        result = 31 * result + departmentName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "EmployeeVO{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", positionId=" + positionId +
                ", departmentId=" + departmentId +
                ", positionName='" + positionName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }


}
