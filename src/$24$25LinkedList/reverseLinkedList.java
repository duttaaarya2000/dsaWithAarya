package $24$25LinkedList;

import $24$25LinkedList.LinkedList.Node;

public class reverseLinkedList {
	public class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public static Node head;
	public static Node tail;
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
		//reverse of a linked list Iterative Approach
		public void reverse() {
			Node prev=null;
			Node curr=tail=head;
			Node next;
			while(curr!=null)
			{
				next=curr.next;
				curr.next=prev;
				prev=curr;
				curr=next;
			}
			head=prev;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseLinkedList ll=new reverseLinkedList();
		ll.head=ll.new Node(34);
		ll.head.next=ll.new Node(66);
		ll.head.next.next=ll.new Node(89);
		ll.head.next.next.next=ll.new Node(8);
		ll.printLinkedList();
		ll.reverse();
		ll.printLinkedList();

	}

}
