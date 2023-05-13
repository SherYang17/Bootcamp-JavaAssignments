package Day50.SchoolManagementSystem;

/**
 * Created by Sher on 5/12/2023
 * This class is responsible for keeping the
 * track of students fees, name, grade & fees
 * paid.
 *
 */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**        type /** then hit enter and the line 18 to 22 is created. Only works if you create line 23 first
     * To create a new student by initializing
     * @param id id for the student: unique.
     * @param name name of the student.
     * @param grade grade of the student.
     */
   public Student (int id, String name, int grade) {
       this.feesPaid = 0;
       this.id = id;
       this.name = name;
       this.grade = grade;

   }

    /**
     * used to update the student's grade.
     * @param grade new grade of the student
     */
   public void setGrade (int grade) {


   }

    /**
     * Keep adding the fees to the feesPaid Field
     * Add the fees to the fees paid
     * the school is going tor eceive the funds
     * @param fees
     */
    public void payFees (int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return id of the student.
     */
    public int getId () {
        return id;
    }

    /**
     *
     * @return name of the student.
     */
    public String getName () {
        return name;
    }

    /**
     *
     * @return the grade of the student.
     */
    public int getGrade () {
        return grade;
    }

    /**
     *
     * @return fees paid by the student.
     */
    public int getFeesPaid () {
        return feesPaid;
    }

    /**
     *
     * @return the total fees of the student.
     */
    public int getFeesTotal () {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees.
     */
    public int getRemainingFees (){
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name :"+ name +
                " Total fees paid so far $"+ feesPaid;
    }

}
