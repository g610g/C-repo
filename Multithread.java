public class Multithread{
    public static void main(String[] args) 
    { 
        //create a node first and initialize a list
        Node newNode = new Node(10);
        Node newNode1 = new Node(20);
        Node newNode2 = new Node(30);
        Node newNode3 = new Node(15); 
        Node newNode4 = new Node(5); 
        List myList = new List();
        myList.addNode(newNode);
        myList.addNode(newNode1);
        myList.insertEnd(newNode2);
        myList.insertEnd(newNode3);
        myList.insertEnd(newNode4);
        System.out.print("Unsorted list: ");
        myList.printList();
        myList.sortList();
        System.out.println("Sorted List:");
        myList.printList();
    }
}