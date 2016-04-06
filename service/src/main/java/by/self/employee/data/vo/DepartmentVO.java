package by.self.employee.data.vo;

public class DepartmentVO {

    private Integer id;
    private String Name;

    public DepartmentVO() {
    }

    public DepartmentVO(String name) {
        Name = name;
    }

    public DepartmentVO(Integer id, String name) {
        this.id = id;
        Name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepartmentVO that = (DepartmentVO) o;

        if (!Name.equals(that.Name)) return false;
        if (!id.equals(that.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + Name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "DepartmentVO{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }
}
