class Teacher {
     String designation;
     String collegeName;
    
     void work() {
        System.out.println("Teaching students");
    }
}

class ComputerTeacher extends Teacher {
    public ComputerTeacher() {
        designation = "Computer Teacher";
        collegeName = "SDMIT College";
    }
}

 class Main {
    public static void main(String args[]) {
        ComputerTeacher ct = new ComputerTeacher();
        System.out.println("Designation: " + ct.designation);
        System.out.println("College Name: " + ct.collegeName);
        ct.work();
    }
}
