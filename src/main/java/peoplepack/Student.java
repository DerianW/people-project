package peoplepack;

public class Student extends Person implements Learner
{
    public Student(long ID) { super(ID) ; }

    private double totalStudyTime ;

    public void learn(double numberOfHours) { totalStudyTime += numberOfHours ; }

    public double getTotalStudyTime() { return totalStudyTime ; }
}