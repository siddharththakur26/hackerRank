package HackerRank.Algorithms.LinkedList;

public class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;

    }
    int countNode(Node head){
      if (head.next == null)
          return 1;
      else
      {
          int counter =1;
          Node current = head;
          while(current.next != null ){
              current = current.next;
              counter++;
          }
              return counter;
      }
    }

    public static void main(String[] args) {
        // create node
        Node head = new Node(4);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);
        Node nodeD = new Node(10);

        // join nodes
        head.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        System.out.println(head.countNode(head));



    }
}

