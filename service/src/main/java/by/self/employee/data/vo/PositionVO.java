package by.self.employee.data.vo;

public class PositionVO {

    private Integer id;
    private String name;

    public PositionVO() {
    }

    public PositionVO(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public PositionVO(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PositionVO that = (PositionVO) o;

        if (!id.equals(that.id)) return false;
        if (!name.equals(that.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "PositionVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
