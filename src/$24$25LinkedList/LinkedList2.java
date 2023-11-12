package $24$25LinkedList;

public class LinkedList2 {
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public  Node head;
	public  Node tail;
	public int size = 0;
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
	//Find and remove Nth Node from End
	public void deleteNthfromEnd(int n) {
		//calculate size Iterative method
		int sz=0;
		Node temp=head;
		while(temp!=null) {
			temp=temp.next;
			sz++;
		}
		if(n==sz) {
			head=head.next;//remove first
			return;
		}
		//sz-n
		int i=1;
		int iToFind=sz-n;
		Node prev=head;
		while(i<iToFind) {
			prev=prev.next;
			i++;
		}
		prev.next=prev.next.next;
		return;
	}
	//Find mid of the LL using Slow Fast Approach
	public Node findMid(Node head)
	{
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;//+1
			fast=fast.next.next;//+2
		}
		return slow;//slow is the middle
	}
	//Check if LinkedList is palindrome or not
	public boolean checkPalindrome() {
		if(head==null ||head.next==null)
		{
			return true;
		}
		//Step-1 find mid
		Node midNode=findMid(head);
		//Step-2 reverse 2nd half
		Node prev=null;
		Node curr=midNode;
		Node next;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		Node right=prev;//right half head
		Node left=head;//left half head
		while(right!=null)
		{
			if(left.data !=right.data)
			{
				return false;
			}
			left=left.next;
			right=right.next;
		}
		return true;
	}
	public static void main(String args[]) {
		LinkedList2 li=new LinkedList2();
		li.addFirst(5);
		li.addLast(3);
		li.addLast(8);
		li.addLast(6);
		li.addLast(4);
		li.printLinkedList();
		li.deleteNthfromEnd(3);
		li.printLinkedList();
		System.out.println(li.checkPalindrome());
		LinkedList2 li2=new LinkedList2();
		li2.addFirst(1);
		li2.addFirst(2);
		li2.addFirst(3);
		li2.addFirst(2);
		li2.addFirst(1);
		li2.printLinkedList();
		System.out.println(li2.checkPalindrome());
	}

}
