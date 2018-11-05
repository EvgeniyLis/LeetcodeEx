package easy;

public class MergeSortedArray {

    /*
    Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
    Note:
    The number of elements initialized in nums1 and nums2 are m and n respectively.
    You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
    Example:
    Input:
    nums1 = [1,2,3,0,0,0], m = 3
    nums2 = [2,5,6],       n = 3
    Output: [1,2,2,3,5,6]
    */

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length >= (m+n)){
            System.arraycopy(nums2, 0, nums1, m, nums2.length);
            int temp;
            for (int border=0; border<nums1.length; border++){
                for (int i=0; i<nums1.length-border-1; i++){
                    if (nums1[i]>nums1[i+1]){
                        temp=nums1[i];
                        nums1[i]=nums1[i+1];
                        nums1[i+1]=temp;
                    }
                }
            }
        }
    }

}