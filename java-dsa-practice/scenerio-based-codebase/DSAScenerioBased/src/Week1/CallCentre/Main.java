package Week1.CallCentre;

 import java.util.*;
	public class Main {

		static Queue<String> normal = new LinkedList<>();
		static PriorityQueue<String> vip = new PriorityQueue<>();
		static HashMap<String,Integer> callcount = new HashMap<>();
		
		public static void addCall(String customer,boolean isvip) {
			if(callcount.containsKey(customer)) {
				callcount.put(customer,callcount.get(customer) + 1);
			}
			else {
				callcount.put(customer,1);
			}
			
			if(isvip) {
				vip.add(customer);
				System.out.println(customer + " added to vip");
			}
			else {
				normal.add(customer);
				System.out.println(customer + " added to normal");
			}
		}
		
		public static void serveNext() {
			if(!vip.isEmpty()) {
				System.out.println("serving vip : " + vip.remove());
			}
			else if(!normal.isEmpty()) {
				System.out.println("serving normal : " + normal.remove());
			}
			else {
				System.out.println("No customers to serve");
			}
		}
		
		public static void showcallhistory() {
			System.out.println("-------------");
			for(String customer : callcount.keySet()) {
				System.out.println(customer + " " + callcount.get(customer) + " calls");
			}
		}
		
		public static void showqueues() {
			System.out.println("VIP : " + vip);
			System.out.println("Normal : " + normal);
		}

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			addCall("A",false);
			addCall("B",true);
			addCall("C",false);
			addCall("D",true);
			
			showqueues();
			showcallhistory();
			
			System.out.println("------");
			
			serveNext();
	        serveNext();
	        serveNext();
	        serveNext();
	        serveNext();  

	        showqueues();
		

	}

}
