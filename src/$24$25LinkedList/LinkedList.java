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
	//Remove first node from LL
	public int removeFirst() {
		int val=head.data;
		head=head.next;
		size--;
		return val;
	}
	//Remove last node from LL
	public int removeLast() {
		if(size==0)
		{
			System.out.println("List is Empty");
			return -1;
		}
		else if(size==1)
		{
			int val=head.data;
			head=tail=null;
			size--;
			return val;
		}
		//prev : i=size-2
		Node prev=head;
		for(int i=0;i<size-2;i++)
		{
			prev=prev.next;
		}
		int val=prev.next.data;//tail data
		prev.next=null;
		tail=prev;
		size--;
		return val;
	}
	//Search in Iterative way
	public int itrSearch(int key)
	{
		Node temp=head;
		int i=0;
		while(temp!=null) {
			if(temp.data==key)//key found
			{
				return i;
			}
			temp=temp.next;
			i++;
		}
		//key not found
		return -1;
	}
	//Search in recursive way
	public int recSearch(int key) {
		return helper(head,key);
	}

	private int helper(Node head, int key) {
		// TODO Auto-generated method stub
		if(head==null)
		{
			return -1;
		}
		if(head.data==key)
		{
			return 0;
		}
		int idx=helper(head.next, key);
		if(idx==-1)
		{
			return -1;
		}
		return idx+1;
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
		System.out.println("size="+size);
		System.out.println(ll.removeFirst());;
		ll.printLinkedList();
		System.out.println(ll.removeLast());
		ll.printLinkedList();
		System.out.println("size="+size);
		System.out.println(ll.itrSearch(88));
		System.out.println(ll.itrSearch(76));
		System.out.println(ll.recSearch(88));
		System.out.println(ll.recSearch(76));


	}

}
