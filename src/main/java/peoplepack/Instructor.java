package peoplepack;

public class Instructor extends Person implements Teacher
{
    public Instructor(long ID) { super(ID) ; }

    public void teach(Learner learner, double numberOfHours)
    {
        learner.learn(numberOfHours) ;
    }

    public void lecture(Learner[] learners, double numberOfHours)
    {
        double numberOfHoursPerLearner = numberOfHours / learners.length ;
        for (Learner l : learners)
        {
            l.learn(numberOfHoursPerLearner) ;
        }
    }
}