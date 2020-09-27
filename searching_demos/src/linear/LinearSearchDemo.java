package linear;

public class LinearSearchDemo {

	public static void main(String[] args) {
		String ar[]= {"hello","hi","java","hello","jme","hello","jse","hello","hello","java"};
		
		String ele="hello";
		
		boolean b=false;
		for(String s:ar) {
			if(s.equals(ele)) {
				b=true;
				break;
			}
		}
		if(b) {
			System.out.println(ele+" found");
		}else {
			System.out.println(ele+" not found");
		}
		
		b=false;
		for (int i = 0; i < ar.length; i++) {
			if(ele.equals(ar[i])) {
				b=true;
				System.out.println(ele+" found at position - "+(i+1));
			}
		}
		if(!b) {
			System.out.println(ele+" not existing in any index");
		}
				

	}

}

//Collection - contains,List(indexOf, lastIndexOf) Map-containsKey(),containsValue
//Collections.frequency(list,searchele)
