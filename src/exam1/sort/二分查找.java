package exam1.sort;

import java.util.Random;


public class 二分查找 {   
    public static void main(String[] args) {  
        int[] src = new int[] {1, 3, 5, 7, 8, 9};   
        int index = new Random().nextInt(src.length);
        System.out.println("随机查找数：" + src[index]);
        
        System.out.println(binarySearch(src, src[index])); 
        System.out.println(binarySearch(src,0,src.length-1,src[index])); 
    }  
    /** 
     * * 二分查找算法 * * 
     *  
     * @param srcArray   有序数组 * 
     * @param des 	查找元素 * 
     * @return des的数组下标，没找到返回-1 
     */   
   public static int binarySearch(int[] srcArray, int des){   
      
        int low = 0;   
        int high = srcArray.length-1;   
        while(low <= high) {   
            int middle = (low + high)/2;   
            if(des == srcArray[middle]) {   
                return middle;   
            }else if(des <srcArray[middle]) {   
                high = middle - 1;   
            }else {   
                low = middle + 1;   
            }  
        }  
        return -1;  
   }  
   
   // 二分查找递归实现   
   public static int binarySearch(int srcArray[], int start, int end, int key) {   
       int mid = (end - start) / 2 + start;   
       if (srcArray[mid] == key) {   
           return mid;   
       }   
       if (start >= end) {   
           return -1;   
       } else if (key > srcArray[mid]) {   
           return binarySearch(srcArray, mid + 1, end, key);   
       } else if (key < srcArray[mid]) {   
           return binarySearch(srcArray, start, mid - 1, key);   
       }   
       return -1;   
   } 
 
} 