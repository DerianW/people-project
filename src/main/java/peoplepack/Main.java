package peoplepack ;

public class Main
{
    public static void main(String[] args)
    {
        Person dude = new Person(1) ;
        Person brah = new Person(2) ;

        People peeps = new People() ;

        peeps.add(dude) ;
        peeps.add(brah) ;

        System.out.println( peeps.getCount() ) ;
        peeps.removeAll() ;
        System.out.println( peeps.getCount() ) ;

        peeps.add(dude) ;
        peeps.add(brah) ;
        System.out.println( peeps.getCount() ) ;

        System.out.println( peeps.findByID(1) ) ;
        System.out.println( peeps.findByID(3) ) ;

        peeps.remove(1) ;

        System.out.println( peeps.getCount() ) ;

        System.out.println("==========================================================");

        People people = new People() ;

        Person person1 = new Person(11) ;
        Person person2 = new Person(22) ;
        Person person3 = new Person(33) ;

        person2.setName("Poop man") ;
        System.out.println( person2.getName() ) ;

        people.add(person1) ;
        people.remove(person1) ;

        System.out.println( people.findByID(22) ) ;
        System.out.println(people.personList) ;

        people.add(person1) ;
        people.add(person2) ;
        people.add(person3) ;

        System.out.println( people.getCount() ) ;

        people.remove(11) ;
        System.out.println( people.getCount() ) ;

        people.removeAll() ;
        System.out.println( people.getCount() ) ;

        Student student = new Student(555) ;

        System.out.println( student.getTotalStudyTime() ) ;

        Instructor instructor = new Instructor(626) ;

        Student student2 = new Student(666) ;
        Student student3 = new Student(777) ;

        Student[] studentArray = new Student[]{student2, student3} ;

        instructor.lecture(studentArray, 35);

        for (Student s : studentArray)
        {
            System.out.println( s.getTotalStudyTime() ) ;
        }

    }
}