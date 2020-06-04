package prueba_Clases_3Jun;
public class DoublyLinkedList {  
	  
	public int lenght, pos=0;
    class Node{  
        int data;  
        Node previous;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
            
        }  
    }  
  
    Node head, tail = null;  
  
    public void addNode(int data) {  
        Node newNode = new Node(data);  
  
        if(head == null) {  
            head = tail = newNode;  
            head.previous = null;  
            tail.next = null;  
            lenght++;
        }  
        else {  
            tail.next = newNode;  
            newNode.previous = tail;  
            tail = newNode;  
            tail.next = null; 
            lenght++;

        }  
    }  
  
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
    }  
  public int getLen() {
	  System.out.println("\nYour list has " +lenght + " nodes");
	  return lenght;
  }
  

public void searchNode(int value) {
	 int i = 0;  
     boolean flag = false;  
     //Node current will point to head  
     Node current = head;  
     while(current != null) {  
         //Compare value to be searched with each node in the list  
         if(i == value) {  
             flag = true;  
             break;  
         }  
         current = current.next;  
         i++;  
     }  
     if(flag)  
          System.out.println("The Node in position "+value +" is: " + current.data);  
     else  
          System.out.println("Node is not present in the list");  	
}  
 
static Node bubbleSort( Node current)  
{  
    int swapped, i;  
    Node ptr1;  
    Node lptr = null;  
  
    // Checking for empty list  
    if (current == null)  
        return null;  
  
    do
    {  
        swapped = 0;  
        ptr1 = current;  
  
        while (ptr1.next != lptr)  
        {  
            if (ptr1.data > ptr1.next.data)  
            {  
                int t = ptr1.data; 
                ptr1.data = ptr1.next.data; 
                ptr1.next.data = t; 
                swapped = 1;  
            }  
            ptr1 = ptr1.next;  
        }  
        lptr = ptr1;  
    }  
    while (swapped != 0);  
        return current; 
}  
 
}  