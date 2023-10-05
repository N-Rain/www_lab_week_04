package vn.edu.iuh.fit;

public class Student {
    private long id;
    private String name;
    private Class_ lopHoc;

    public Class_ getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(Class_ lopHoc) {
        this.lopHoc = lopHoc;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(long id, String name, Class_ lopHoc) {
        this.id = id;
        this.name = name;
        this.lopHoc = lopHoc;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lopHoc=" + lopHoc +
                '}';
    }
}
