import java.util.Arrays;

public class Multiply {
	public static void main(String[] args){
		System.out.println(multiply("0", "34"));
	}

	public static String multiply(String num1, String num2) {
	    num1=new StringBuilder(num1).reverse().toString();
	    num2=new StringBuilder(num2).reverse().toString();
	    int[] m=new int[num1.length()+num2.length()];
	    for (int i=0;i<num1.length();i++){
	    	int a=num1.charAt(i)-'0';
	    	for (int j=0;j<num2.length();j++){
	    		int b=num2.charAt(j)-'0';
	    		m[i+j]+=a*b;
	    	}
	    }
	    StringBuilder result=new StringBuilder();
	    for (int k=0;k<m.length;k++){
	    	int digit=m[k]%10;
	    	int carry=m[k]/10;
	    	result.insert(0, digit);
	    	if (k<m.length-1){
	    		m[k+1]+=carry;
	    	}
	    }
	    //System.out.println(result.toString());
	    while(result.length()>0 && result.charAt(0)=='0'){
	    	//System.out.println("before"+result.toString());
	    	result.deleteCharAt(0);
	    	//System.out.println("after"+result.toString());
	    }
	    return (result.length()==0?"0":result.toString()); 
	}
}
