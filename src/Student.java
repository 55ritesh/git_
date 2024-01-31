import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

// Task 1 to do

public class Student{
    private String name;
    private List<Integer> marks;

    public Student(String name,List<Integer>marks){
        this.name = name;
        this.marks=marks;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks){
        this.marks=marks;
    }

    public static void main(String[] args){

        Student ritesh = new Student("Ritesh",Arrays.asList(95,75,70,65,82,72));
        Student mounika = new Student("Mounika",Arrays.asList(80,75,65,90,95));

        mounika.setName("Mounika");
        ritesh.setName("Ritesh");

        displayInfo(mounika);
        displayInfo(ritesh);

        List<Integer> commanMark = findMarks(mounika,ritesh);
        System.out.println("Common Marks:" + commanMark);

    }


    public static void displayInfo(Student s){
        System.out.println("Student name: " + s.getName());
        System.out.println("Student marks: " + s.getMarks());

    }

    public static List<Integer> findMarks(Student s1,Student s2){
        List<Integer> m1 = new ArrayList<>(s1.getMarks());
        List<Integer> m2 = new ArrayList<>(s2.getMarks());
        List<Integer> m3 = new ArrayList<>();


        for(Integer it:m1){
            if(m2.contains(it)){
                m3.add(it);
            }
        }
        return m3;

        /*
        m1.retainAll(m2);
        return m1;

         */


    }
}
