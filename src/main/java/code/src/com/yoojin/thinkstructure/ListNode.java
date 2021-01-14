package code.src.com.yoojin.thinkstructure;

public class ListNode {

	public Object data;
	public ListNode next;
	
	public ListNode() {
		this.data = null;
		this.next = null;
	}
	
	public ListNode(Object data) {
		this.data = data;
		this.next = null;
	}
	
	public ListNode(Object data,ListNode next) {
		this.data = data;
		this.next = next;
	}
	
	public String toString() {
		return "ListNode( " + data.toString() + ")";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
