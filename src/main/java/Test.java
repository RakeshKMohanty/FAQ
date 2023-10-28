public class Test {

    Node head = null;
    Node tail = null;

    void addHead(int element) {
        if (head == null)
            head = new Node(element, null);
        else {
            Node current = new Node(element, null);
            current.next = head;
            head = current;
        }
    }

    Node getTailNode()  {
        if (head != null) {
            if(head.next != null) {
                Node currentNode = head;
                while (currentNode.next != null) {
                    currentNode = currentNode.next;
                }
                return tail = currentNode;
            }
            else{
                tail = head;
                return tail;
            }
        } else
            throw new RuntimeException("No Element");
            //throw new Exception("There is no element");

    }

    void addTailNode(int element) {
        Node tailNode = getTailNode();
        Node currentNode = new Node(element, null);
        tailNode.next = currentNode;
        tail = currentNode;
    }

    void iterateElement(){
        if(head != null){
            if(head.next != null){
                Node current = head;
                while(current.next != null){
                    System.out.print(current.element +"->");
                    current = current.next;
                }
                System.out.print(current.element);
            }
            else
            System.out.println(head.element);

        }
    }

    public static void main(String[] args){
        
        Test test = new Test();
        test.addHead(3);
        test.addHead(2);
        //test.addHead(1);
        test.addTailNode(4);
        test.addTailNode(5);
        Node tailNode = test.getTailNode();
        test.iterateElement();
        System.out.println("\nHead Element:"+test.head.element);

         test.head = reverseLinkedlist(test.head);
         test.iterateElement();

        //System.out.println("\nHello "+null);
    }

    private static Node reverseLinkedlist(Node head) {

        // Node node = null;
        if(head == null || head.next==null)
            return head;

        Node newHead = reverseLinkedlist(head.next);
        //Node headnext = head.next;
        //newHead.next = headnext;
        head.next.next = head;
        //while()

        head.next = null;
       // head = newHead;
        return newHead;
    }
}
