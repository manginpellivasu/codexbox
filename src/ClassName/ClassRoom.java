package ClassName;

import Package.Student;
        import java.util.ArrayList;
        import java.util.List;


public class  ClassRoom {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.setName("vaasu");
        std1.setRollno(1234);
        std1.setAddress("kphb");
        std1.getGrade('A');

        Student std2 = new Student();
        std2.setName("dinesh");
        std2.setRollno(4567);
        std2.setAddress("l.b nagar");
        std2.setGrade('A');

        Student std3 = new Student();
        std3.setName("vamshi");
        std3.setRollno(2345);
        std3.setAddress("nanakramguda");
        std3.setGrade('A');

        Student std4 = new Student();
        std4.setName("junaid");
        std4.setRollno(5648);
        std4.setAddress("karnool");
        std4.setGrade('A');

        Student std5 = new Student();
        std5.setName("rajath");
        std5.setRollno(2378);
        std5.setAddress("jharakand");
        std5.setGrade('A');

        List<Student> stds = new ArrayList<>();

        stds.add(std1);
        stds.add(std2);
        stds.add(std3);
        stds.add(std4);
        stds.add(std5);

        for (int i = 0; i < stds.size(); i++) {
            System.out.println(stds.get(i).getName());
            System.out.println(stds.get(i).getRollno());
            System.out.println(stds.get(i).getAddress());
            System.out.println(stds.get(i).getGrade('A'));
        }

        for (Student s : stds) {
            System.out.println("********************");


            System.out.println(s.getName());
            System.out.println(s.getRollno());
            System.out.println(s.getAddress());
            System.out.println(s.getGrade('A'));


        }


    }
}






