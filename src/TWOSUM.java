import java.util.*;

public class TWOSUM {
public static void main(String[] args){
	int[] twosum=new int[]{3,2,4};
	System.out.println(Arrays.toString(twosums(twosum,6)));
}
public static int[] twosums(int[] sums,int target){
	int[] result=new int[2];
	Map<Integer,Integer> map=new HashMap<Integer,Integer>();
	for (int i=0;i<sums.length;i++){
		if(map.containsKey(target-sums[i])){
			result[1]=i;
			result[0]=map.get(target-sums[i]);
			return result;
		}
		map.put(sums[i], i);
	}
	return result;
}
}
