package DSA.MODULE_2.Week7_LinkedList;

import javax.swing.JOptionPane;

/**
 * LinkedList is an algorithm that stores data dynamically as it uses memory
 * address.
 * Storing may happen at the beginning, in the middle, and at the last.
 * Same goes to deletion.
 * It does NOT store the data in a sequential manner,
 * instead it uses the Node (data, address) that link between them to form a
 * chain or link list.
 * 
 * @author 4
 */

public class LNode<Object> { // the class accepts any data type: int, double, String.
    private Object data; // any data to be added in the list
    private LNode next; // pointer to the next node
    private LNode head; // pointer at first/head node

    // global error prompt
    public void error_message(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Constructor
     * Points its initial values for the next and head pointers to null.
     * This is necessary to set an empty LL.
     */
    public LNode() {
        next = head = null;
    }

    public boolean isEmpty() { // returns 'true' if list is empty. Otherwise, 'false.'
        return head == null;
    }

    // Operations

    // [addAtFirst] allows adding a Node to list based on value given/assigned.
    public void addAtFirst(Object value) {
        LNode newNode = new LNode(); // an instantiation of an object of a class LNode. A Node.

        // this code shows that storing data is at the beginning when a list is empty.
        if (isEmpty()) {
            newNode.data = value; // first value is added to a node as data.
            newNode.next = null; // pointer 'next' points to null. First node of the list.
            head = newNode; // satisfies the creation of a node. It concludes that: Node (data, next
                            // pointer) is now the head.

            // when the list is not empty
        } else {
            newNode.data = value;
            newNode.next = head;// new Node (data, next) will be the new head now.
            head = newNode;
        }
    }

    // [traverse] visits each Node in a list until the last pointer points to null.
    public String traverse() {
        if (isEmpty()) {
            return "List is empty";
        } else {
            String hold = "";
            LNode link = head; // indicates that traversal should start from the head, going through each Node
                               // until it reaches the last, which points to null.
            while (link != null) {
                hold += "|" + link.data + "|" + link.next + "|\n";
                link = link.next;
            }
            return "head Node|" + head + "\n" + hold;
        }
    }

    // [addAtLast]
    public void addAtLast(Object value) {
        if (isEmpty()) {
            addAtFirst(value); // will call the addFirst method to create the first Node
        } else {
            // loop that reads each Node in the List until the last
            LNode link = head;
            while (link.next != null) {
                link = link.next;
            }
            LNode newNode = new LNode();
            newNode.data = value;
            newNode.next = null; // sets the newly inserted Node points to the null pointer.
            link.next = newNode; // invoked that the Node is created as the last Node
        }
    }

    /**
     * [currentSize]
     * Allows one to read each Node in the List to determine its current size.
     * It traverses from head to the last Node.
     * It increments the counter variable as it visits through each Node.
     */
    public int currentSize() {
        int counter = 1;
        if (isEmpty()) {
            error_message("List is empty");
        } else {
            LNode link = head;
            while (link.next != null) {
                link = link.next;
                counter++;
            }
        }
        return counter;
    }

    public void addAtPosition(Object value, int position) {
        if (isEmpty()) {
            error_message("List is EMPTY. Node is added at the beginning.");
            addAtFirst(value);
        } else if (position == 0) {
            error_message("Node is added at the beginning");
            addAtFirst(value);
        } else if (position < 0 || position > currentSize()) {
            error_message(position + " is NOT valid");
        } else {
            LNode visit, link;
            visit = link = head;
            int ctr = 1;
            while (ctr != position) {
                link = link.next;
                ctr++;
            }
            while (link.next != visit) {
                visit = visit.next;
            }
            LNode newNode = new LNode();
            newNode.data = value;
            newNode.next = visit;
            link.next = newNode;
        }
    }

    public void addInMiddle(Object value) {
        if (isEmpty()) {
            error_message("List is EMPTY. Node is added at the beginning.");
            addAtFirst(value);
        } else {
            int position = currentSize() / 2;
            addAtPosition(value, position);
        }
    }

    // [deleteAtFirst] eliminates the first node of the list.
    public void deleteAtFirst() {
        if (isEmpty()) {
            error_message("Deleting Not Allowed. Linked list is empty.");
        } else {
            LNode link = head;
            head = link.next;
            System.out.println("Deleting is Successful !");
        }
    }

    // deleteInMiddle
    public void deleteInMiddle() {
        if (isEmpty()) {
            error_message("Deleting Not Allowed. Linked list is empty.");
        } else {
            int position = currentSize() / 2;
            System.out.println(position);
            if (position == 1) {
                deleteAtFirst();
            } else {
                LNode visit, link;
                visit = link = head;
                int ctr = 1;
                while (ctr != position) {
                    link = link.next;
                    ctr++;
                }
                while (link.next != visit) {
                    visit = visit.next;
                }
                visit.next = link.next;
                System.out.println("Deleting is Successful !");
            }
        }
    }

    // deleteValue

    // [deleteAtLast] - NOT YET FINAL!
    public void deleteAtLast() {
        if (isEmpty()) {
            error_message("Deleting Not Allowed. Linked list is empty");
        } else {
            LNode visit, link;
            visit = link = head;
            while (visit.next != null) {
                visit = visit.next;
            }
            while (link.next != visit) {
                link = link.next;
            }
            link.next = null;
            System.out.println("Deleting is Successful !");
        }
    }

    // [deleteAtPosition] - NOT SURE!
    public void deleteAtPosition(int position) {
        if (isEmpty()) {
            error_message("Deleting Not Allowed. Linked list is empty");
        } else if (position == 0) {
            error_message("Deleting Not Allowed. Node is at the beginning");
        } else if (position < 0 || position > currentSize()) {
            error_message(position + " is NOT valid");
        } else {
            LNode visit, link, pointer;
            visit = link = pointer = head;
            int ctr = 0;
            while (ctr != position - 1) {
                visit = visit.next;
                ctr++;
            }
            while (link.next != visit) {
                link = link.next;
            }
            ctr = 0;
            while (ctr != position) {
                pointer = pointer.next;
                ctr++;
            }
            link.next = pointer;

        }
    }

    //deleteValue
    public void deleteValue(Object value) {
        if (isEmpty()) {
            error_message("Deleting Not Allowed. Linked list is empty");
        } else {
            LNode visit, link;
            visit = link = head;
            while (visit.data != value) {
                visit = visit.next;
            }
            while (link.next != visit) {
                link = link.next;
            }
            link.next = visit.next;
        }
    }


    // [getFirst] returns the first node in the list. - AMBOT YAWA
    public java.lang.Object getFirst() {
        if (isEmpty()) {
            error_message("The list is empty");
        }
        return head.data;

    }

    // [getLast] returns the node in the list based on a specific position.
    public Object getLast() {
        if (isEmpty()) {
            error_message("The list is empty");
        }
        LNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return (Object) temp.data;
    }

    public Object getAtPosition(int position) {
        if (isEmpty()) {
            error_message("The list is empty");
        } else if (position < 0 || position >= currentSize()) {
            error_message("Position is NOT valid");
        } else {
            LNode temp = head;
            int ctr = 0;
            while (ctr != position) {
                temp = temp.next;
                ctr++;
            }
            return (Object) temp.data;
        }
        return null;
    }
    
    // indexat using for loop 
    public int indexAt(Object value) {
        if (isEmpty()) {
            error_message("The list is empty");
        } else {
            LNode temp = head;
            int ctr = 0;
            while (temp.data != value) {
                temp = temp.next;
                ctr++;
            }
            return ctr;
        }
        return -1;
    }
    public void clear() {
        head = null;
    }
}
