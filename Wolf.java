public class Wolf extends Mammal {

    private String name_indentification;
    private String sex;
    private Boolean captivity;

    Wolf(String name, String color, int age, int legs, String sex, Boolean captivity) {
        super(color, age, legs);
        this.sex = sex;
        this.name_indentification = name;
        this.captivity = captivity;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Boolean getCaptivity() {
        return captivity;
    }

    public void setCaptivity(Boolean captivity) {
        this.captivity = captivity;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name_indentification;
    }

}
