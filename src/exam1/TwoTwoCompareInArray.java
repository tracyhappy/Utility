package exam1;

/**
 *   数组里的数据进行比较
 */
public class TwoTwoCompareInArray {
	
	public static void main(String[] args) {
		//一个数组中按升序进行排列。检查它是否是按照升序进行排列的
	    int[] nums = {0,4,2,5,7};
	    int count = 0;
	    for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[j]<nums[i]){
					System.out.println(nums[j] + "小于了" + nums[i]);
					count++;
				}
			}
		}
	    System.out.println(count);
	    
	    
	    //查看一个ip数组中,ip之间是否有overlap
//	    String[] strArr = {"1.1.1.1","2.2.2.2"}
//	    for (int i = 0; i < strArr.length; i++) {
//	    	for (int j = i + 1; j < strArr.length; j++) {
//	    		IpRange ipRange1 = IpRange.parse(strArr[i]);
//	    		IpRange ipRange2 = IpRange.parse(strArr[j]);
//	    		boolean isOverlap = ipRange1.overlaps(ipRange2);
//	    		if (isOverlap) {
//	    			return invalid_overlap_ip;
//	    		}
//	    	}
//	    }
	}
}
