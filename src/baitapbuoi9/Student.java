package baitapbuoi9;

//public class BaiTapBuoi9 {
public class Student {

    int ID;
    String name;

    public Student(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    void displayInformation() {
        System.out.println("ID" + ID + "Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Nam");
        Student s2 = new Student(2, "Lan");
        s1.displayInformation();
        s2.displayInformation();
    }
}
