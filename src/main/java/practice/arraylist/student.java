package practice.arraylist;

public class student {
    private String studyName;
    private String name;
    private int age;
    private String className;


    public student() {
    }

    public student(String studyName, String name, int age, String className) {
        this.studyName = studyName;
        this.name = name;
        this.age = age;
        this.className = className;
    }

    /**
     * 获取
     *
     * @return studyName
     */
    public String getStudyName() {
        return studyName;
    }

    /**
     * 设置
     *
     * @param studyName
     */
    public void setStudyName(String studyName) {
        this.studyName = studyName;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return className
     */
    public String getClassName() {
        return className;
    }

    /**
     * 设置
     *
     * @param className
     */
    public void setClassName(String className) {
        this.className = className;
    }

    public String toString() {
        return "student{studyName = " + studyName + ", name = " + name + ", age = " + age + ", className = " + className + "}";
    }
}
