class Node {
    int data;
    Node rlink;
    Node llink;

    public Node(int data) {
        this.data = data;
        this.rlink = null;
        this.llink = null;
    }
}

class Doublell {
    private Node head;
    private Node tail;

    public Doublell() {
        this.head = null; // header node
        this.tail = null; // last node pointing to null
    }

    public void insert(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.rlink = newnode;
            newnode.llink = tail;
            tail = newnode;
        }
    }

    public void display() {
        Node current = head;
        System.out.println("Displaying linked list: ");
        while (current != null) {
            System.out.println("" + current.data);
            current = current.rlink;
        }
        System.out.println(" ");
    }

    public void delete(int item) {
        Node current = head;

        // search for the node with the given data
        while (current != null) {
            if (current.data == item) {
                // node found
                if (current.llink != null) // node is not the first node
                {
                    current.llink.rlink = current.rlink;
                } else // node is the first node
                {
                    head = current.rlink;
                    if (head != null) {
                        head.llink = null;
                    }
                }

                if (current.rlink != null) {
                    // node is not the last node
                    current.rlink.llink = current.llink;
                } else {
                    // node is the last node
                    tail = current.llink;
                    if (tail != null) {
                        tail.rlink = null;
                    }
                }

                System.out.println("Deleted: " + item);
                return;
            } else {
                current = current.rlink;
            }
        }

        // node not found
        System.out.println("Not found: " + item);
    }
}

public class Main {
    public static void main(String[] args) {
        Doublell d1 = new Doublell();
        d1.insert(6);
        d1.insert(10);
        d1.display();
        d1.delete(4);
        d1.display();
        d1.insert(7);
        d1.display();
    }
}
