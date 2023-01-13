package practice.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class studentTest {
    /**
     * 案例：学生信息系统：展示数据，并按照学号完成搜索
     * 学生类信息（学号，姓名，性别，班级）
     * 测试数据：
     * "20180302","叶孤城",23,"护理一班"
     * "20180303","东方不败",23,"推拿二班"
     * "20180304","西门吹雪",26,"中药学四班"
     * "20180305","梅超风",26,"神经科2班"
     */
    public static void main(String[] args) {
        ArrayList<student> student = new ArrayList<>();
        student.add(new student("20180302", "叶孤城", 23, "护理一班"));
        student.add(new student("20180302", "叶孤城", 23, "护理一班"));
        student.add(new student("20180303", "东方不败", 23, "推拿二班"));
        student.add(new student("20180304", "西门吹雪", 26, "中药学四班"));
        student.add(new student("20180305", "梅超风", 26, "神经科2班"));
        System.out.println("学号\t\t名称\t年龄\t\t班级");

        for (int i = 0; i < student.size(); i++) {
            practice.arraylist.student s = student.get(i);
            System.out.println(s.getStudyName() + "\t\t" + s.getName() + "\t\t"
                    + s.getAge() + "\t\t" + s.getClassName());
        }

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请您输入要查询的学生的学号：");
            String id = sc.next();
            practice.arraylist.student studentByStudyId = getStudentByStudyId(student, id);
            if (studentByStudyId == null) {
                System.out.println("查无此人！");
            } else {
                // 找到了该学生对象了，信息如下
                System.out.println(studentByStudyId.getStudyName() + "\t\t" + studentByStudyId.getName() + "\t\t"
                        + studentByStudyId.getAge() + "\t\t" + studentByStudyId.getClassName());
            }


        }

    }

    /**
     * 根据学号，去集合中找出学生对象并返回。
     *
     * @param student
     * @param studyName
     * @return
     */
    public static student getStudentByStudyId(ArrayList<student> student, String studyName) {
        for (int i = 0; i < student.size(); i++) {
            practice.arraylist.student student1 = student.get(i);
            if (student1.getStudyName().equals(studyName)) {
                return student1;
            }
        }
        return null;
    }
}
