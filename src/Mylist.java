import java.util.NoSuchElementException;

public class Mylist< T >
{

    public ListNode < T > firstNode;
    public ListNode < T > lastNode;

    public String name;		// string used in printing

    //constructor creates empty List with "my list" as the name
    public Mylist()
    {
        System.out.println ("list default constructor");

    }

    //constructor creates an empty List with a name
    public Mylist(String listName)
    {
        System.out.println ("list 2nd constructor");
        name = listName;
        firstNode = lastNode = null;
    }
    public T removeFromFront() throws NoSuchElementException {
        if(isEmpty()){
            throw new NoSuchElementException(name);
        }
        T removeItem = firstNode.data;
        firstNode = firstNode.nextNode;
        return removeItem;
    }
    //insert item in front
    public void insertAtFront (T insertItem)
    {
        if (isEmpty ())
        {
            firstNode = lastNode = new ListNode < T > (insertItem);
        }
        else
        {
            firstNode = new ListNode < T > (insertItem, firstNode);
        }

    }

    //insert item at the back
    public void insertAtBack (T insertItem)
    {
        if (isEmpty ())
        {
            firstNode = lastNode = new ListNode < T > (insertItem);

        }
        else
        {
            ListNode < T > current = firstNode;
            while (current.nextNode != null)
            {
                current = current.nextNode;
            }
            current.nextNode = lastNode = new ListNode < T > (insertItem);

        }

    }

    //determine whether list is empty
    public boolean isEmpty ()
    {
        return firstNode == null;	// return true if list is empty
    }

    //output list contents
    public void print ()
    {
        if (isEmpty ())
        {
            System.out.printf ("Empty %s\n", name);
            return;
        }
        System.out.printf ("%s is: ", name);
        ListNode < T > current = firstNode;

        //while not at end of list, output current node's data
        while (current != null)
        {
            System.out.printf ("%s ", current.data);
            current = current.nextNode;
        }
        System.out.println ();
    }

    public int size ()		// returns the number of items in the list
    {
        int count = 0;
        ListNode < T > current = firstNode;
        while (current != null)
        {

            count++;

            current = current.nextNode;

        }
        return count;
    }

}


