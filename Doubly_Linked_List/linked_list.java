import java.util.*;
public class Test{
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addAtFirst(29);
		ll.deleteFirst();
		ll.traverse();
		ll.addAtFirst(34);
		ll.addAtFirst(34);
		ll.traverse();
		ll.addAtEnd(67);
		ll.addAtEnd(54);
		ll.traverse();
		ll.deleteFirst();
		ll.traverse();
		ll.deleteEnd();
		ll.traverse();
		ll.addAtFirst(30);
		ll.addAtEnd(20);
		ll.addAtEnd(78);
		ll.traverse();
		ll.reverse();
		ll.traverse();
		ll.deleteFirst();
		ll.deleteEnd();
		ll.traverse();
	}
} 
class Node{
	int data;
	Node next;
	Node prev;
}

class LinkedList{

	Node HEAD = null;

	void addAtEnd(int data){
		Node node = new Node();
		node.next = null;
		node.data = data;
		if(HEAD!=null){
			Node temp = HEAD;
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next = node;
			node.prev = temp;

		}else{
			node.prev = null;
			HEAD = node;
		}
	}

	void deleteFirst(){
		if(HEAD!=null){
			HEAD = HEAD.next;
			if(HEAD!=null)
				HEAD.prev = null;
		}

	}
	void deleteEnd(){
		if(HEAD!=null){
			Node node = HEAD;
			while(node.next!=null){
				node = node.next;
			}
			if(node!=HEAD)
				node.prev.next = null;
			else
				deleteFirst();

		}

	}
	void reverse(){

		if(HEAD!=null){
			Node node = HEAD;
			Node temp;
			while(node.next!=null){
				temp = node.prev;
				node.prev = node.next;
				node.next = temp;
				node = node.prev;
			}

			HEAD = node;
			temp = node.prev;
			node.prev = node.next;
			node.next = temp;
			node.prev = null;

		}

	}

	void addAtFirst(int data){
		Node node = new Node();
		node.prev = null;
		node.data = data;
		if(HEAD!=null){
			node.next = HEAD;
			HEAD.prev = node;
			HEAD = node;
		}else{
			node.next = null;
			HEAD = node;
		}

	}



	void traverse(){
		if(HEAD!=null){
			Node node = HEAD;
			while(node!=null){
				System.out.print(node.data+"	");
				node = node.next;
			}
			System.out.println("");
		}
		

	}

	
}
