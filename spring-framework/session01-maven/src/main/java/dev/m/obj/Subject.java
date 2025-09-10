package dev.m.obj;
// class binh thuong
public class Subject {
    private String name;
    private String code;
    private String point;

    public Subject(String name, String code, String point) {
        this.name = name;
        this.code = code;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", point='" + point + '\'' +
                '}';
    }
}
