package $24$25LinkedList;

public class LinkedList{
	//Creating a node for linked list
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public static Node head;
	public static Node tail;
	public static int size = 0;
	//add first TC->O(1)
	public void addFirst(int data)
	{
		//create new Node
		Node newNode=new Node(data);
		if(head==null)
		{
			head=tail=newNode;
			size++;
			return;
		}
		//new node next=head
		newNode.next=head;
		//head=newNode
		head=newNode;
		size++;
	}
	//add last TC->O(1)
	public void addLast(int data)
	{
		//create new Node
		Node newNode=new Node(data);
		if(head==null)
		{
			head=tail=newNode;
			size++;
			return;
		}
		//tail next=new Node
		tail.next=newNode;
		//tail=newNode
		tail=newNode;
		size++;
	}
	//print a linkedlist TC->O(N)
	public void printLinkedList()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("LL is empty");
		}
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	//add in middle TC->O(N)
	public void add(int idx,int data)
	{
		if(idx==0)
		{
			addFirst(data);
			return;
		}
		Node newNode=new Node(data);
		Node temp=head;
		int i=0;
		while(i<idx-1)
		{
			temp=temp.next;
			i++;
		}
		//i=idx-1,temp=prev
		newNode.next=temp.next;
		temp.next=newNode;
		size++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.addFirst(7);
		ll.addFirst(8);
		ll.printLinkedList();
		ll.addLast(9);
		ll.addLast(11);
		ll.printLinkedList();
		ll.add(2,10);
		ll.printLinkedList();
		ll.add(3,88);
		ll.printLinkedList();
		System.out.println("size="+size);;

	}

}
