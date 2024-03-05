public class Student {
    private String name;
    private String surName;
    private int age;
    private String[] courses;

    public void setName(String name) {

        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setSurName(String surName) {
        this.surName = surName;

    }

    public String getSurName() {

        return surName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String[] getCourses(String course) {
        return courses;

    }

    public String setCourses(String  courses) {

        this.courses = new String[]{courses};


        return courses;
    }

}
