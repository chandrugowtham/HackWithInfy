import java.util.Scanner;

public class Converting_Sequence {
static long swapCount(String s) {
	char ch[]=s.toCharArray();
	int countleft=0,countright=0;
	int swap=0,imbalance=0;
	for(int i=0;i<ch.length;i++) {
		if(ch[i]=='(') {
			countleft++;
			if(imbalance>0) {
				swap+=imbalance;
				imbalance--;
			}
		}else if(ch[i]==')') {
			countright++;
			imbalance=(countright-countleft);
		}
	}return swap;
}

public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	System.out.println(swapCount(str));
	
}
}
