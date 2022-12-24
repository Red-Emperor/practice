package practice.ClassesAndObjects;

public class user1 {
//    属性
    private String username;
    private String password;
    private String email;
    private int age;

    public user1() {
    }

    public user1(String username, String password, String email, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.age = age;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "user1{username = " + username + ", password = " + password + ", email = " + email + ", age = " + age + "}";
    }
////    空参
//    public user1(){
//
//    }
////    有参
//    public user1(String username,String password,String email,int age ){
//        this.username=username;
//        this.password=password;
//        this.email=email;
//        this.age=age;
//
//
//    }
////    get/set方法
//    public void setusername(String username){
//        this.username=username;
//    }
//    public String getusername(){
//        return username;
//    }
//
//    public void setemail(String email){
//        this.email=email;
//    }
//    public String getemail(){
//        return email;
//    }
//
//    public void setage(int age){
//        this.age=age;
//    }
//    public int getage(){
//        return age;
//    }
//
//    public  void  setpassword(String password){
//        this.password=password;
//    }
//    public String getpassword(){
//        return password;
//    }
//    快捷键 ctrl+shift+ ,（逗号）


}
