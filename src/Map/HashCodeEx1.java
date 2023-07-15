package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> mapStudent = new HashMap<>();
        Student st1 = new Student("Pavel", "Kuzmin", 3);
        Student st2 = new Student("Anton", "Kuzmin", 1);
        Student st3 = new Student("Anna", "Rum", 0);
        Student st4 = new Student("Alex", "Fess", 4);
        mapStudent.put(st1, 7.3);
        mapStudent.put(st2, 3.5);
        mapStudent.put(st3, 2.0);
        mapStudent.put(st4, 1.);
        System.out.println(mapStudent);
        Student st5 = new Student("Pavel", "Kuzmin", 3);
        boolean result = mapStudent.containsKey(st5);
        System.out.println(".containsKey " + result);
        System.out.println(".equals      " + st1.equals(st5));
        System.out.println("st1 HC= " + st1.hashCode());
        System.out.println("st5 HC= " + st5.hashCode());

    }
}
class Student{
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, surname, course);
//    }
}