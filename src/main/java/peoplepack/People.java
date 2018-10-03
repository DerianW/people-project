package peoplepack;

import java.util.ArrayList;

public class People
{
    private Person person ;
    public ArrayList<Person> personList = new ArrayList<Person>();

    public void add(Person p) { personList.add(p) ; }

    public Person findByID(long ID)
    {
        for (Person p : personList)
        {
            if (p.getID() == ID)
            {
                return p ;
            }
        }
        return null ;
    }

    public void remove(Object Person) { personList.remove(Person) ; }

    public void remove(long ID)
    {
        for (Person i : personList)
        {
            if (i.getID() == ID)
            {
                personList.remove(i) ;
                break ;
            }
        }
    }

    public int getCount() { return personList.size() ; }
    public Object getArray() { return personList.toArray() ; }
    public void removeAll() { personList.clear() ; }
}