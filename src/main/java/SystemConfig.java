package java;

public class SystemConfig {

    private String name;
    private String nameTwo;
    private Long number;

    @Override
    public String toString() {
        return "SystemConfig{" +
                "name='" + name + '\'' +
                ", nameTwo='" + nameTwo + '\'' +
                ", number=" + number +
                '}';
    }

    public SystemConfig(String name, String nameTwo, Long number) {
        this.name = name;
        this.nameTwo = nameTwo;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameTwo() {
        return nameTwo;
    }

    public void setNameTwo(String nameTwo) {
        this.nameTwo = nameTwo;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }
}
