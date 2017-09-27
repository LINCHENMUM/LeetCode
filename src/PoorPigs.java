
public class PoorPigs {
public static void main(String[] args){
	System.out.println(poorPigs(1000,15,60));
}
public static int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
    int r=minutesToTest/minutesToDie+1;
    int numPoorPig=0;
    while(Math.pow(r,numPoorPig)<buckets){
    	numPoorPig++;
    }
    return numPoorPig;
}
}
