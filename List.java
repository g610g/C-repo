public class List {
    private Node head;

    public List()
    {
        this.head = null;
    }
    public void addNode(Node node)
    {
        if (this.head == null)
        {
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
        return;
    }
    public void printList()
    {
        Node temp = this.head;
        while(temp != null)
        {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        return;
    }
    public int getHeadValue()
    {
        return this.head.value;
    }
    public void insertEnd(Node node)
    {
        Node temp = this.head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = node;
        return;
    }
    public void sortList()
    {
            
        if (this.head == null)
        {
            return;
        }
        Node currentNode = this.head, nextNode = this.head.next;
        this.head = null;
        while(currentNode != null)
        {
            currentNode.next = null;
            this.insertSorting(currentNode);
            currentNode = nextNode;
            if (currentNode == null)
            {
                break;
            }
            nextNode = currentNode.next;
        }

    }
    public void reverseList()
    {
        
    }
    private void insertSorting(Node currentNode)
    {
        if (this.head == null)
        {
            this.head = currentNode;
            return;
        }
        if (this.head.next == null)
        {
            if (currentNode.value < this.head.value)
            {
                Node handler = this.head;
                this.head = currentNode;
                currentNode.next = handler;
                return;
            }
            this.head.next = currentNode;
            return;
        }
        Node temp = this.head;
        Node previous = null;
        //temp is the current value for each of the loop
        while(temp != null)
        {
            if (currentNode.value < temp.value)
            {
                //if the current node is the smallest as of the moment attach it as the new head of the sorted list
                if (temp == this.head || previous == null)
                {
                    Node handler = this.head;
                    this.head = currentNode; 
                    currentNode.next = handler;                 
                    return;
                }
                currentNode.next = temp;
                previous.next = currentNode;
                return;
            }
            previous = temp;
            temp = temp.next;
        }
        previous.next = currentNode;
        return;
    }
    
}
