package exam1;

/**
 *   ����������ݽ��бȽ�
 */
public class TwoTwoCompareInArray {
	
	public static void main(String[] args) {
		//һ�������а�����������С�������Ƿ��ǰ�������������е�
	    int[] nums = {0,4,2,5,7};
	    int count = 0;
	    for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[j]<nums[i]){
					System.out.println(nums[j] + "С����" + nums[i]);
					count++;
				}
			}
		}
	    System.out.println(count);
	    
	    
	    //�鿴һ��ip������,ip֮���Ƿ���overlap
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
