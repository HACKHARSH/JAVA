class Data{
    int rollno;
    String name;
    int marks;


}
public class ObjArray {
    public static void main(String args[]) {

        Data s1 = new Data();
        s1.rollno = 1;
        s1.name = "Harsh";
        s1.marks = 97;

        Data s2 = new Data();
        s2.rollno = 2;
        s2.name = "Anjali";
        s2.marks = 92;

        Data s3 = new Data();
        s3.rollno = 3;
        s3.name = "Dhruv";
        s3.marks = 94;

        Data students[] = new Data[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;


        for (Data stud : students){
            System.out.println(stud.name + " : " + stud.marks);

        }


        
    }
    
}
