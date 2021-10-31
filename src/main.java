
public class main {
    public static void main(String args[]){
        Student student = new Student("Paul", "CS",4.00);

        //Getter
        student.getStudentName();
        student.getMajor();

        //Setter
        student.setGpa(10.0);


        HeadMaster headMaster = new HeadMaster("Brooks","G12",51);

        //Getter
        headMaster.getName();
        headMaster.getOfficeNumber();

        //Setter
        headMaster.setAge(10);
        headMaster.setName("Dr.Brooks");
        headMaster.setOfficeNumber("G12");

        Worker worker = new Worker();

        //Getter
        worker.getAge();
        worker.getName();
        worker.getHourPay();

        //Setter
        worker.setAge(26);
        worker.setName("John");
        worker.setHourPay(9.25);

        Professor professor = Professor.builder()
                .department("Computer Science")
                .age(39)
                .name("Sward")
                .build();

        //Getter
        professor.getDepartment();
        professor.getName();

        //Setter
        professor.setName("Dr. Sward");
        professor.setDepartment("Computer Science");
        professor.setAge(40);


    }
}
