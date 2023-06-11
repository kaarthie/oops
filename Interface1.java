package Interface;

 interface Teacher {
  void teacherAdvise();
}
 interface Mentor{
    void mentorAdvise();
}
class Student implements Teacher,Mentor{
 @Override
 public void teacherAdvise() {
  System.out.println("Study well");
 }
 @Override
 public void mentorAdvise() {
  System.out.println("Be rational-from one interface");
 }

 public static void main(String[] args) {
  Student karthi=new Student();
  karthi.teacherAdvise();
  karthi.mentorAdvise();
 }
}