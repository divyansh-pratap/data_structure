import java.util.*;

public class linked_list{

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addAtEnd(70);
		ll.addAtFirst(20);
		ll.addAtFirst(80);
		ll.addAtEnd(0);
		ll.addAtFirst(30);
		ll.addAtFirst(80);
		ll.addAtEnd(60);
		ll.addAtEnd(10);
		ll.addAtEnd(80);
		ll.traverse();
		ll.search(30);
		ll.reverse();
		ll.traverse();

		ll.addAtFirst(80);
		ll.traverse();
		ll.deleteAllOccurenceOf(80);
		ll.traverse();
		ll.deleteAllOccurenceOf(30);
		ll.traverse();


	}
}

class Node{
	int data;
	Node next;
}
class LinkedList{

	Node HEAD = null;

	void addAtFirst(int data){
		Node newNode = new Node();
		newNode.data = data;

		if(HEAD!=null){
			newNode.next = HEAD;
			HEAD = newNode;
		}else{
			HEAD = newNode;
		}

	}

	void addAtEnd(int data){

		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;

		if(HEAD!=null){			
			Node node = HEAD;
			while(node.next!=null){
				node = node.next;
			}
			node.next = newNode;

		}else{
			HEAD = newNode;

		}

	}

	void search(int data){
		if(HEAD!=null){
			Node node = HEAD;
			while(node.next!=null){
				if(node.data==data){
					System.out.println(node.data + " Found");
				}
				node = node.next;
			}
			if(node.data==data){
				System.out.println(data + " found");
			}
		}

	}

	void traverse(){
		if(HEAD!=null){
			Node node = HEAD;
			while(node.next!=null){
				System.out.print(node.data+"	");
				node = node.next;
			}
			System.out.println(node.data);
		}


	}

	void deleteFirst(){
		if(HEAD!=null){
			HEAD = HEAD.next;
		}

	}

	void deleteEnd(){

		if(HEAD!=null){
			Node node = HEAD;
			while(node.next.next!=null){
				node = node.next;
			}
			node.next=null;
		}

	}

	void deleteAllOccurenceOf(int data){

		if(HEAD!=null){
			Node node = HEAD;
			while(node.next.next != null){

				if(node.next.data == data){
					node.next = node.next.next;
				}

				node = node.next;
			}
			if(node.next.data==data){
				deleteEnd();
			}
			if(HEAD.data==data){
				deleteFirst();
			}

		}

	}

	void reverse(){
		 // Node temp = null , temp2;
		 // while(HEAD!=null){
		 // 	temp2 = HEAD.next;
		 // 	HEAD.next = temp;
		 // 	temp = HEAD;
		 // 	HEAD = temp2;
		 // }
		 // HEAD = temp ;
		reverseRecursively(HEAD);
	}

	void reverseRecursively(Node p){

		if(p!=null && p.next==null){
			HEAD = p;
			return;
		}
		reverseRecursively(p.next);
		p.next.next = p;
		p.next = null;



	}





}


