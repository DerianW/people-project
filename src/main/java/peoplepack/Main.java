package peoplepack;

import java.util.ArrayList;

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

    }
}