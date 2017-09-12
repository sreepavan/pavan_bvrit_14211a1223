/*import java.text.SimpleDateFormat;
import java.util.*;*/
public class Main {

	//private static Date yourDate;

	public static void main(String[] args) {
		
		/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
		java.util.Date yourDate = sdf.parse("1992-07-26");
		}catch(Exception e) {};
		/*Student stu1=new Student(1,"ram",yourDate,95);
		Student stu2=new Student(2,"ram",yourDate,95);
		Student stu3=new Student(3,"ram",yourDate,95);
		Student stu4=new Student(4,"ram",yourDate,95);
		*/
/*
		Student[] studentArray = new Student[7];
		
		studentArray[0]=new Student(1,"ram",yourDate,95);
		studentArray[1]=new Student(2,"ram",yourDate,95);
		studentArray[2]=new Student(3,"ram",yourDate,95);
		studentArray[3]=new Student(4,"ram",yourDate,95);
		
		
		
		
		
		
		StudentGroup s=new StudentGroup(5);
		s.getStudents();
		s.setStudents(studentArray);
		*/
		
		/*list.add(0, yourObject);
		 * Afterwards you can delete the last element with:

if(list.size() > 10)
    list.remove(list.size() - 1);
		 * 
		 * 
		 * 
		 * */
		
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
	}

}
/*
import java.util.*;

public class SortingStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numofstudents = input.nextInt();
        String[] names = new String[numofstudents];
        int[] array = new int[numofstudents];
        for(int i = 0; i < numofstudents; i++) {
            System.out.print("Enter the student's name: ");
            names[i] = input.next();
            System.out.print("Enter the student's score: ");
            array[i] = input.nextInt();
        }
        selectionSort(array);
    }
    public static void selectionSort(int[] array) {
        for(int i = array.length - 1; i >= 1; i--) {
            int currentMax = array[0];
            int currentMaxIndex = 0;
            for(int j = 1; j <= i; j++) {
                if (currentMax < array[j]) {
                    currentMax = array[j];
                    currentMaxIndex = j;
                }   
                if (currentMaxIndex != i) {
                    array[currentMaxIndex] = array[i];
                    array[i] = currentMax;
                }
                System.out.println(array[i]);
            }
        }       
    }
}*/

