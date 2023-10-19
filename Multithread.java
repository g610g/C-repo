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
        myList.sortList();
        myList.printList();
        String name = "Gio Gonzales";
        int[][] numbers = {{1,2,3}, {4,5,6,7,8,9}}; 
        // System.out.println(addBetweenRecursion(5, 10));
    }
    public static int addBetweenRecursion(int start, int end)
    {
        if (end == start)
        {
            return end;
        }
        return end + addBetweenRecursion(start, end - 1);
    }

}